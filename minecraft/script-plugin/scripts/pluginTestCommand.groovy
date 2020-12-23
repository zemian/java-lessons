import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin
import zemian.minecraft.scriptplugin.ScriptPlugin

class TestCommand implements CommandExecutor {
    @Override
    boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        System.out.println("Test command args=" + args);
        return true;
    }
}
class Test2Command implements CommandExecutor {
    @Override
    boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        System.out.println("Test2 command args=" + args);
        return true;
    }
}

class Test3Command implements CommandExecutor {
    @Override
    boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        System.out.println("Test3 command args=" + args);
        return true;
    }
}


class MyTestScriptPlugin extends ScriptPlugin {
    MyTestScriptPlugin(JavaPlugin javaPlugin) {
        super(javaPlugin)
    }

    @Override
    void onEnable() {
        this.javaPlugin.getCommand("test").setExecutor(new TestCommand());
        this.javaPlugin.getCommand("test2").setExecutor(new Test2Command());
        this.javaPlugin.getCommand("test3").setExecutor(new Test3Command());
    }
}

// scriptPlugin is a global variable
return new MyTestScriptPlugin(javaPlugin);
