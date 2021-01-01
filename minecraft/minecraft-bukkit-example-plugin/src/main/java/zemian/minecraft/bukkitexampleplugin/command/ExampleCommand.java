package zemian.minecraft.bukkitexampleplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;
import java.util.logging.Logger;

public class ExampleCommand implements CommandExecutor {
    public static Logger LOG = Logger.getLogger(ExampleCommand.class.getName());

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        LOG.info("sender=" + sender + ", command=" + command + ", label=" + label + ", args=" + Arrays.toString(args));
        return true;
    }
}
