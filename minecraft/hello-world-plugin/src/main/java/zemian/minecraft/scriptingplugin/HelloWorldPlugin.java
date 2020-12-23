package zemian.minecraft.scriptingplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enabling HelloWorldPlugin");
        this.getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling HelloWorldPlugin");
        super.onDisable();
    }
}