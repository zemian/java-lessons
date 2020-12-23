package zemian.minecraft.scriptplugin;

import org.bukkit.plugin.java.JavaPlugin;

/** A base class a script can extends and return to implement MC plugin. */
public class ScriptPlugin {
    protected JavaPlugin javaPlugin;

    public ScriptPlugin() {}
    public ScriptPlugin(JavaPlugin javaPlugin) {
        this.javaPlugin = javaPlugin;
    }
    public JavaPlugin getJavaPlugin() {
        return this.javaPlugin;
    }
    public void onEnable() {}
    public void onDisable() {}
}
