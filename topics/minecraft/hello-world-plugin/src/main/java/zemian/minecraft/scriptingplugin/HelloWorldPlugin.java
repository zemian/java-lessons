package zemian.minecraft.javascriptplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("hello").setExecutor(new HelloCommand());
    }
}