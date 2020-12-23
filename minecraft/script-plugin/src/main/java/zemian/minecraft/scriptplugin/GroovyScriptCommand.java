package zemian.minecraft.scriptplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.logging.Logger;

public class GroovyScriptCommand implements CommandExecutor {
    public static Logger LOG = Logger.getLogger(GroovyScriptCommand.class.getName());
    private GroovyScriptPlugin groovyScriptPlugin;

    public GroovyScriptCommand(GroovyScriptPlugin groovyScriptPlugin) {
        this.groovyScriptPlugin = groovyScriptPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        LOG.info("sender=" + sender + ", command=" + command + ", label=" + label + ", args=" + Arrays.toString(args));
        String script = GroovyScriptPlugin.DEFAULT_SCRIPT;
        if (args.length > 0) {
            script = args[0];
        }
        LOG.info("Reloading groovyScriptPlugin with " + script);
        groovyScriptPlugin.initPluginDelegate(script);
        groovyScriptPlugin.onEnable();
        return true;
    }
}