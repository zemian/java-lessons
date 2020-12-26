package zemian.minecraft.bukkitexampleplugin.eventlistener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.logging.Logger;

public class MyListener implements Listener {
    public static Logger LOG = Logger.getLogger(MyListener.class.getName());

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        LOG.info("Event " + event);
        Bukkit.broadcastMessage("Welcome to the server!");
    }
}
