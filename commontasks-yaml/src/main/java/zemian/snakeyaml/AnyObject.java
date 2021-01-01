package zemian.snakeyaml;

import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.util.Map;

/**
 * https://bitbucket.org/asomov/snakeyaml/wiki/Home
 */
public class AnyObject {
    public static void main(String[] args) throws Exception {
        try (FileReader reader = new FileReader("commontasks-yaml/examples/any-object.yaml")) {
            Yaml yaml = new Yaml();
            Map<String, Object> map = yaml.load(reader);
            System.out.println(map);
        }
    }
}
