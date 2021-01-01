package zemian.minecraft.bukkitexampleplugin.eventlistener;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ExamplePlugin extends JavaPlugin {
    public static Logger LOG = Logger.getLogger(ExamplePlugin.class.getName());

    private MyListener listener = new MyListener();
    
    @Override
    public void onEnable() {
        LOG.info("Setup event listener");
        // NOTE: It's "registerEvents()", (with 's')
        getServer().getPluginManager().registerEvents(listener, this);
    }

    @Override
    public void onDisable() {
        LOG.info("Remove listener");
        HandlerList.unregisterAll(listener);
    }
}