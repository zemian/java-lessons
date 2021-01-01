package zemian.commontasks.scripting;

import java.util.Map;

public class GroovyScriptExample {
    public static void main(String[] args) {
        String file = "commontasks/scripts/hello.groovy";
        if (args.length > 0)
            file = args[0];
        GroovyScriptUtils.runScript(file, Map.of());
    }
}
