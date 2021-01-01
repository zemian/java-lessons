package zemian.minecraft.bukkitexampleplugin.scheduler;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.logging.Logger;

public class ExampleCommand implements CommandExecutor {
    public static Logger LOG = Logger.getLogger(ExampleCommand.class.getName());

    private ExampleTask task;

    public ExampleCommand(ExampleTask task) {
        this.task = task;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        LOG.info("Stopping task now.");
        task.cancel();
        return true;
    }
}
