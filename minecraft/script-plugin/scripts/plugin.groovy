import zemian.minecraft.scriptplugin.ScriptPlugin

class MyScriptPlugin extends ScriptPlugin {
    @Override
    void onEnable() {
        System.out.println("Groovy plugin on enable");
    }

    @Override
    void onDisable() {
        System.out.println("Groovy plugin on disable");
    }
}

// scriptPlugin is a global variable
return new MyScriptPlugin(javaPlugin);
