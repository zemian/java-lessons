package zemian.minecraft.javascriptplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class GroovyScriptingPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("groovy").setExecutor(new GroovyCommand());
    }
}