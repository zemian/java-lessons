package zemian.minecraft.bukkitexampleplugin.hello;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.logging.Logger;

public class ExampleCommand implements CommandExecutor {
    public static Logger LOG = Logger.getLogger(ExampleCommand.class.getName());

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        LOG.info("sender=" + sender + ", command=" + command + ", label=" + label + ", args=" + Arrays.toString(args));

        // In case you want to process multiple commands per plugin
        if (command.getName().equals("hello")) {
            // Say hello to player
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Hello there!");
            }
            return true;
        }

        // Returns false means you have not processed the given command
        return false;
    }
}
