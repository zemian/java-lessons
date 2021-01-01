package zemian.minecraft.scriptplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.File;
import java.util.Arrays;
import java.util.logging.Logger;

public class ScriptPluginLoaderCommand implements CommandExecutor {
    public static Logger LOG = Logger.getLogger(ScriptPluginLoaderCommand.class.getName());
    private GroovyScriptPlugin groovyScriptPlugin;

    public ScriptPluginLoaderCommand(GroovyScriptPlugin groovyScriptPlugin) {
        this.groovyScriptPlugin = groovyScriptPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        LOG.info("sender=" + sender + ", command=" + command + ", label=" + label + ", args=" + Arrays.toString(args));
        boolean isRemove = false;
        // Get the script to load or unload
        String script = GroovyScriptPlugin.DEFAULT_SCRIPT;
        if (args.length > 0) {
            if (args[0].equals("remove")) {
                isRemove = true;
                script = args[1];
            } else {
                script = args[0];
            }
        }
        File file = new File(script);
        String scriptPluginName = file.getName();
        ScriptPlugin scriptPlugin;

        if (isRemove) {
            LOG.info("Removing groovyScriptPlugin " + script);
            scriptPlugin = groovyScriptPlugin.removeScriptPlugin(scriptPluginName);
            if (scriptPlugin != null) {
                scriptPlugin.onDisable();
            }
        } else {
            // Add or reload
            if (groovyScriptPlugin.isScriptPluginExists(scriptPluginName)) {
                LOG.info("Reloading groovyScriptPlugin " + script);
                scriptPlugin = groovyScriptPlugin.getScriptPlugin(scriptPluginName);
                scriptPlugin.onDisable();
            } else {
                LOG.info("Adding new groovyScriptPlugin " + script);
            }
            scriptPlugin = groovyScriptPlugin.addScriptPlugin(script);
            scriptPlugin.onEnable();
        }
        return true;
    }
}