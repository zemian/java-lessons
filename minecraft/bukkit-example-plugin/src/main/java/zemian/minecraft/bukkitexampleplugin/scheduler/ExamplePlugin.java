package zemian.minecraft.bukkitexampleplugin.scheduler;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.logging.Logger;

/*
In MC, it's about 20 ticks per 1 second. It's not always constant because a server may lag.
 */
public class ExamplePlugin extends JavaPlugin {
    public static Logger LOG = Logger.getLogger(ExamplePlugin.class.getName());

    private ExampleTask task;
    
    @Override
    public void onEnable() {
        LOG.info("Scheduling task");

        // Create the task and schedule to run it once, after 20 ticks
        //task = new ExampleTask(this).runTaskLater(this, 20);

        long delay = 10; // delay 10 ticks before task begin
        long period = 40; // repeat task every 40 ticks (2 seconds)
        task = new ExampleTask(this);
        task.runTaskTimer(this, delay, period);

        getCommand("test").setExecutor(new ExampleCommand(task));
    }

    @Override
    public void onDisable() {
        LOG.info("Cancelling task");
        task.cancel();
    }
}