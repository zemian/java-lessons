package zemian.minecraft.javascriptplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaScriptCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {
        String mcScript = System.getProperty("user.home") + "/mc.js";
        if (strings.length > 0) {
            mcScript = strings[0];
        }
        File file = new File(mcScript);
        System.out.println("Executing JavaScript: " + file);

        Context cx = Context.enter();
        try {
            Scriptable scope = cx.initStandardObjects();
            ScriptableObject.putProperty(scope, "sender", Context.javaToJS(sender, scope));
            ScriptableObject.putProperty(scope, "command", Context.javaToJS(command, scope));
            ScriptableObject.putProperty(scope, "label", Context.javaToJS(label, scope));
            ScriptableObject.putProperty(scope, "strings", Context.javaToJS(strings, scope));

            try (FileReader reader = new FileReader(file)) {
                cx.evaluateReader(scope, reader, mcScript, 1, null);
                //Object result = cx.evaluateReader(scope, reader, mcScript, 1, null);
                // Convert the result to a string and print it.
                //System.out.println(Context.toString(result));
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to run JavaScript", e);
        } finally {
            cx.exit();
        }
        return false;
    }
}
