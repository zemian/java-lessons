package zemian.minecraft.scriptplugin;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.logging.Logger;

// Source: https://bukkit.gamepedia.com/Plugin_Tutorial
public class EventHandlerExample implements Listener {
    Logger logger = Logger.getLogger(EventHandlerExample.class.getName());

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        // Get the player's location.
        Location loc = event.getPlayer().getLocation();
        // Sets loc to five above where it used to be. Note that this doesn't change the player's position.
        loc.setY(loc.getY() + 5);
        // Gets the block at the new location.
        Block b = loc.getBlock();
        // Sets the block to type id 1 (stone).
        b.setType(Material.STONE);
    }
}