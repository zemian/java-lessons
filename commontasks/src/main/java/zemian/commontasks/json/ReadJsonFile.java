package zemian.commontasks.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

public class ReadJsonFile {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        String file = "commontasks/src/main/resources/zemian/commontasks/corejava/gson-sample.json";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            Type type = new TypeToken<Map<String, Object>>(){}.getType();
            Map<String, Object> json = gson.fromJson(reader, type);
            System.out.println(json);
        }
    }
}
