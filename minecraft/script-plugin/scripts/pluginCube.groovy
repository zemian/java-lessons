import org.bukkit.command.Command
import org.bukkit.entity.Player
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin
import zemian.minecraft.scriptplugin.GenerateCubeExample
import zemian.minecraft.scriptplugin.ScriptPlugin

class MyCubeScriptPlugin extends ScriptPlugin {
    MyCubeScriptPlugin(JavaPlugin javaPlugin) {
        super(javaPlugin)
    }

    @Override
    void onEnable() {
        javaPlugin.getCommand("test").setExecutor(new CommandExecutor() {
            @Override
            boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                Player player = (Player) sender;
                new GenerateCubeExample().generateCube(player.getLocation(), 10);
                return true;
            }
        })
    }
}

// scriptPlugin is a global variable
return new MyCubeScriptPlugin(javaPlugin);
