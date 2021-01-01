import org.bukkit.event.EventHandler
import org.bukkit.event.HandlerList
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.plugin.java.JavaPlugin
import zemian.minecraft.scriptplugin.ScriptPlugin

class EventHandlerExample implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        System.out.println("Player moved event " + event);
    }
}

class MyEventScriptPlugin extends ScriptPlugin {
    MyEventScriptPlugin(JavaPlugin javaPlugin) {
        super(javaPlugin)
    }

    @Override
    void onEnable() {
        javaPlugin.getServer().getPluginManager().registerEvents(new EventHandlerExample(), javaPlugin);
    }

    @Override
    void onDisable() {
        //PlayerInteractEvent.getHandlerList().unregister(javaPlugin);
        // Or unregister all
        HandlerList.unregisterAll(javaPlugin);
    }
}

// scriptPlugin is a global variable
return new MyEventScriptPlugin(javaPlugin);
