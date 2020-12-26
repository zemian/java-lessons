package zemian.minecraft.bukkitexampleplugin.broadcast;

import org.bukkit.plugin.java.JavaPlugin;
import zemian.minecraft.bukkitexampleplugin.command.ExampleCommand;

import java.util.logging.Logger;

public class ExamplePlugin extends JavaPlugin {
    public static Logger LOG = Logger.getLogger(ExamplePlugin.class.getName());
    
    @Override
    public void onEnable() {
        LOG.info("Setup test command executor");
        getServer().broadcastMessage("Setup test command executor");
        this.getCommand("test").setExecutor(new ExampleCommand());
    }
}