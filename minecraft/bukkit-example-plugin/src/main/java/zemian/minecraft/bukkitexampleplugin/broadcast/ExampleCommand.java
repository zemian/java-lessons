package zemian.minecraft.bukkitexampleplugin.broadcast;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import java.util.logging.Logger;

public class ExampleCommand implements CommandExecutor {
    public static Logger LOG = Logger.getLogger(ExampleCommand.class.getName());

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.broadcastMessage("This is just an example plugin.");
        Bukkit.broadcastMessage(ChatColor.GREEN + "Plugin is ready!");
        return true;
    }
}
