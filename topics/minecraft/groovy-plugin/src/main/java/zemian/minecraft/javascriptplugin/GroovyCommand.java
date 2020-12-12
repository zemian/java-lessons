package zemian.minecraft.javascriptplugin;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.File;
import java.io.IOException;

public class GroovyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {
        String mcScript = System.getProperty("user.home") + "/mc.groovy";
        if (strings.length > 0) {
            mcScript = strings[0];
        }
        File file = new File(mcScript);
        System.out.println("Executing groovy script: " + file);

        Binding binding = new Binding();
        binding.setVariable("sender", sender);
        binding.setVariable("command", command);
        binding.setVariable("label", label);
        binding.setVariable("strings", strings);
        GroovyShell shell = new GroovyShell(binding);
        try {
            shell.evaluate(file);
        } catch (IOException e) {
            throw new RuntimeException("Failed to run Groovy", e);
        }

        return false;
    }
}
