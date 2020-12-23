package zemian.minecraft.helloplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class HelloWorldPlugin extends JavaPlugin {
    Logger logger = Logger.getLogger(HelloWorldPlugin.class.getName());
    
    @Override
    public void onEnable() {
        logger.info("Enabling HelloWorldPlugin");

        logger.info("Setup 'hello' command executor");
        this.getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable() {
        logger.info("Disabling HelloWorldPlugin");
    }
}