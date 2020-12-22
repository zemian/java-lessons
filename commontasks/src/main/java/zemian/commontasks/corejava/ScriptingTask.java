package zemian.commontasks.corejava;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;

public class ScriptingTask {
    public static void main(String[] args) throws Exception {
        String script = (args.length > 0) ? args[0] : "commontasks/hello.js";
        runScript(script);
    }

    public static void runScript(String script) {
        try {
            String ext = script.substring(script.lastIndexOf(".") + 1);
            ScriptEngineManager factory = new ScriptEngineManager();
            ScriptEngine engine = factory.getEngineByName(ext);
            File file = new File(script);
            Bindings bindings = engine.createBindings();
            try (FileReader reader = new FileReader(file)) {
                engine.eval(reader, bindings);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to run script " + script, e);
        }
    }

}
