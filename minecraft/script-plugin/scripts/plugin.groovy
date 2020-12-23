import org.bukkit.plugin.java.JavaPlugin
import zemian.minecraft.scriptplugin.ScriptPlugin

class MyScriptPlugin extends ScriptPlugin {
    MyScriptPlugin(JavaPlugin javaPlugin) {
        super(javaPlugin)
    }

    @Override
    void onEnable() {
        System.out.println("This script plugin is ready to do work!");
    }
}

// scriptPlugin is a global variable
return new MyScriptPlugin(javaPlugin);
