package zemian.commontasks.scripting;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

public class GroovyScriptUtils {
    /**
     * Execute a Groovy script file using GroovyShell API. The params map will be use to
     * create script variables that can be access in the script.
     *
     * NOTE: The difference between this and ScriptUtils.runScript() is latter requires
     * the lookup of Engine with a classloader tied to the JDK! This might not be good solution
     * if you have a custom classloader.
     */
    public static <T> T runScript(String file, Map<String, Object> params) {
        GroovyShell shell = new GroovyShell();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Binding context = shell.getContext();
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                context.setVariable(entry.getKey(), entry.getValue());
            }
            return (T) shell.evaluate(reader, file);
        } catch (Exception e) {
            throw new RuntimeException("Failed to run Script " + file, e);
        }
    }
}
