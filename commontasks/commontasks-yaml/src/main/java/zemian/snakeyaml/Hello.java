package zemian.snakeyaml;

import org.yaml.snakeyaml.Yaml;

import java.util.HashMap;
import java.util.Map;

/**
 * https://bitbucket.org/asomov/snakeyaml/wiki/Home
 */
public class Hello {
    public static void main(String[] args) {
        loading();
        dumping();
    }

    private static void dumping() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Pushkin");
        Yaml yaml = new Yaml();
        String output = yaml.dump(map);
        System.out.println(output);
    }

    private static void loading() {
        Yaml yaml = new Yaml();
        Map<String, Object> map = yaml.load("a: 1\nb: 2\nc:\n  - aaa\n  - bbb");
        System.out.println("a type: " + map.get("a").getClass());
        System.out.println("b type: " + map.get("b").getClass());
        System.out.println("c type: " + map.get("c").getClass());
    }
}
