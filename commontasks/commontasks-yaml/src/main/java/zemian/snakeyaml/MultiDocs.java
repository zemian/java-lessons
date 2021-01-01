package zemian.snakeyaml;

import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.util.Map;

/**
 * https://bitbucket.org/asomov/snakeyaml/wiki/Home
 */
public class MultiDocs {
    public static void main(String[] args) throws Exception {
        try (FileReader reader = new FileReader("commontasks-yaml/examples/multi-docs.yaml")) {
            Yaml yaml = new Yaml();
            Iterable<Object> list = yaml.loadAll(reader);
            list.forEach(e -> System.out.println(e));
        }
    }
}
