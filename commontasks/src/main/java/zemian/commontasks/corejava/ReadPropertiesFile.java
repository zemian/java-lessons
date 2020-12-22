package zemian.commontasks.corejava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws Exception {
        String file = "commontasks/config.properties";
        Properties props = new Properties();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            props.load(reader);
        }
        System.out.println(props);
        System.out.println(props.getProperty("foo"));
        System.out.println(props.containsKey("bar"));

        for (String key : props.stringPropertyNames()) {
            System.out.println(key + " => " + props.getProperty(key));
        }
    }
}
