// Get a location in the world and place a block there
// See https://hub.spigotmc.org/javadocs/bukkit/ API
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.Material;

Location loc = new Location(Bukkit.getWorld("world"), 0, 80, 0);
Block testBlock = loc.getBlock();
//testBlock.setType(Material.DIRT);
testBlock.setType(Material.BECON);
