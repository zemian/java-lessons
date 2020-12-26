package zemian.minecraft.bukkitexampleplugin.broadcast;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ExamplePlugin extends JavaPlugin {
    public static Logger LOG = Logger.getLogger(ExamplePlugin.class.getName());
    
    @Override
    public void onEnable() {
        LOG.info("Broadcasting server message.");
        Bukkit.broadcastMessage("This is just an example plugin.");
        Bukkit.broadcastMessage(ChatColor.GREEN + "Plugin is ready!");
    }
}