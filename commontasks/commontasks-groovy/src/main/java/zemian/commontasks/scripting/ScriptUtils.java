package zemian.commontasks.scripting;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

public class ScriptUtils {
    /**
     * Execute a script file using Java Scripting API. The params map will be use to
     * create script variables that can be access in the script.
     */
    public static <T> T runScript(String file, Map<String, Object> params) {
        String ext = file.substring(file.lastIndexOf(".") + 1);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ScriptEngineManager factory = new ScriptEngineManager();
            ScriptEngine engine = factory.getEngineByName(ext);
            Bindings bindings = engine.createBindings();
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                bindings.put(entry.getKey(), entry.getValue());
            }
            return (T) engine.eval(reader, bindings);
        } catch (Exception e) {
            throw new RuntimeException("Failed to run Script " + file, e);
        }
    }
}
