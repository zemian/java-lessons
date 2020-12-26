package zemian.minecraft.bukkitexampleplugin.scheduler;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.logging.Logger;

public class ExampleTask extends BukkitRunnable {
    public static Logger LOG = Logger.getLogger(ExampleTask.class.getName());

    private final JavaPlugin plugin;

    public ExampleTask(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        // What you want to schedule goes here
        LOG.info("Task is running now");
        plugin.getServer().broadcastMessage("Look, I am running on a separated thread!");
    }

}
