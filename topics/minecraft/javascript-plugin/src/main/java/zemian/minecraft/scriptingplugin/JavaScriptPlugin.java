package zemian.minecraft.scriptingplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class JavaScriptPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("js").setExecutor(new JavaScriptCommand());
    }
}