package zemian.snakeyaml;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileReader;

public class MyJavaBeanExample {
    public static void main(String[] args) throws Exception {
        try (FileReader reader = new FileReader("commontasks-yaml/examples/myjavabean.yaml")) {
            Yaml yaml = new Yaml(new Constructor(MyJavaBean.class));
            MyJavaBean bean = yaml.load(reader);
            System.out.println(bean);
        }
    }
}
