package zemian.minecraft.helloplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class HelloWorldPlugin extends JavaPlugin {
    public static Logger LOG = Logger.getLogger(HelloWorldPlugin.class.getName());
    
    @Override
    public void onEnable() {
        LOG.info("Enabling HelloWorldPlugin");

        LOG.info("Setup 'hello' command executor");
        this.getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable() {
        LOG.info("Disabling HelloWorldPlugin");
    }
}