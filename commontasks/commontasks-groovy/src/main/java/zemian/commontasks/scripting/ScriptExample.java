package zemian.commontasks.scripting;

import java.util.Map;

public class ScriptExample {
    public static void main(String[] args) {
        ScriptUtils.runScript("commontasks/scripts/hello.js", Map.of());
    }
}
