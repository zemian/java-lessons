package zemian.minecraft.scriptingplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;

public class ScriptingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {
        String mcScript = System.getProperty("user.home") + "/mc.js";
        try {
            if (strings.length > 0) {
                mcScript = strings[0];
            }
            String ext = mcScript.substring(mcScript.lastIndexOf(".") + 1);
            ScriptEngineManager factory = new ScriptEngineManager();
            ScriptEngine engine = factory.getEngineByName(ext);
            File file = new File(mcScript);
            System.out.println("Executing JavaScript: " + file);
            Bindings bindings = engine.createBindings();
            bindings.put("sender", sender);
            bindings.put("command", command);
            bindings.put("label", label);
            bindings.put("strings", strings);
            try (FileReader reader = new FileReader(file)) {
                engine.eval(reader, bindings);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to run Script " + mcScript, e);
        }
        return false;
    }
}