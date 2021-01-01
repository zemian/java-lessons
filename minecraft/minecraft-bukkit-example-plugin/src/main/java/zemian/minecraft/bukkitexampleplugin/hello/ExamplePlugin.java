package zemian.minecraft.bukkitexampleplugin.hello;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ExamplePlugin extends JavaPlugin {
    public static Logger LOG = Logger.getLogger(ExamplePlugin.class.getName());
    
    @Override
    public void onEnable() {
        LOG.info("Hello");
    }
}