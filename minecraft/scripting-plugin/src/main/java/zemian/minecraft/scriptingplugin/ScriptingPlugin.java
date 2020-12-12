package zemian.minecraft.scriptingplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class ScriptingPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("script").setExecutor(new ScriptingCommand());
    }
}