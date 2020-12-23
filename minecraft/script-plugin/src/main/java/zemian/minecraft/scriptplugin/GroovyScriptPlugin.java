package zemian.minecraft.scriptplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class GroovyScriptPlugin extends JavaPlugin {
    public static Logger LOG = Logger.getLogger(GroovyScriptPlugin.class.getName());

    public static String DEFAULT_SCRIPT = System.getProperty("scriptPlugin", "scripts/plugin.groovy");
    private Map<String, ScriptPlugin> scriptPlugins = new HashMap<>();

    public GroovyScriptPlugin() {
        addScriptPlugin(DEFAULT_SCRIPT);
    }

    public ScriptPlugin addScriptPlugin(String scriptPath) {
        File file = new File(scriptPath);
        if (file.exists()) {
            LOG.info("Using groovy script plugin: " + scriptPath);
            Map<String, Object> params = Map.of("javaPlugin", this, "scriptPath", scriptPath);
            ScriptPlugin scriptPlugin = ScriptUtils.runGroovyScript(scriptPath, params);
            scriptPlugins.put(file.getName(), scriptPlugin);
            return scriptPlugin;
        } else {
            LOG.warning("Plugin script not found: " + scriptPath);
        }
        return null;
    }

    public ScriptPlugin getScriptPlugin(String name) {
        return scriptPlugins.get(name);
    }

    public ScriptPlugin removeScriptPlugin(String name) {
        return scriptPlugins.remove(name);
    }

    public boolean isScriptPluginExists(String name) {
        return scriptPlugins.containsKey(name);
    }

    @Override
    public void onEnable() {
        LOG.info("Add script command executor.");
        getCommand("script").setExecutor(new ScriptPluginLoaderCommand(this));

        for (Map.Entry<String, ScriptPlugin> entry : scriptPlugins.entrySet()) {
            LOG.info("Run onEnable for script " + entry.getKey());
            entry.getValue().onEnable();
        }
    }

    @Override
    public void onDisable() {
        for (Map.Entry<String, ScriptPlugin> entry : scriptPlugins.entrySet()) {
            LOG.info("Run onDisable for script " + entry.getKey());
            entry.getValue().onDisable();
        }
    }
}