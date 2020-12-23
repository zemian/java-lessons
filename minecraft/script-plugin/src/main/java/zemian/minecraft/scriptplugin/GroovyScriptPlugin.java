package zemian.minecraft.scriptplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Map;
import java.util.logging.Logger;

public class GroovyScriptPlugin extends JavaPlugin {
    public static Logger LOG = Logger.getLogger(GroovyScriptPlugin.class.getName());

    public static String DEFAULT_SCRIPT = System.getProperty("scriptPlugin", "scripts/plugin.groovy");
    private String scriptPath = null;
    private ScriptPlugin scriptPlugin = null;

    public GroovyScriptPlugin() {
        initPluginDelegate(DEFAULT_SCRIPT);
    }

    public void initPluginDelegate(String scriptPath) {
        if (!exists(scriptPath)) {
            throw new RuntimeException("Plugin script not found: " + scriptPath);
        }
        LOG.info("Using groovy script plugin: " + scriptPath);
        Map<String, Object> params = Map.of("javaPlugin", this, "scriptPath", scriptPath);
        this.scriptPlugin = ScriptUtils.runGroovyScript(scriptPath, params);
        this.scriptPath = scriptPath;
    }

    public String getScriptPath() {
        return scriptPath;
    }

    public ScriptPlugin getScriptPlugin() {
        return scriptPlugin;
    }

    private boolean exists(String file) {
        return new File(file).exists();
    }

    @Override
    public void onEnable() {
        LOG.info("Add script command executor.");
        getCommand("script").setExecutor(new GroovyScriptCommand(this));

        LOG.info("Run scriptPlugin onEnable.");
        scriptPlugin.onEnable();
    }

    @Override
    public void onDisable() {
        LOG.info("Run scriptPlugin onDisable.");
        scriptPlugin.onDisable();
    }


}