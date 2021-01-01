package zemian.commontasks.json;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.util.List;

public class MyDataJson {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();

        // Write to a JSON file from Java Object
        MyData data = new MyData("foo", 99, new Date(), 3.14);
        MyData data2 = new MyData("foo", 98, new Date(), 3.14);
        MyData data3 = new MyData("foo", 97, new Date(), 3.14);
        List list = List.of(data, data2, data3);
        String json = gson.toJson(list);
        System.out.println(json);

        // Read from JSON file into JavaObject
        String file = "commontasks/src/main/resources/zemian/commontasks/corejava/mydata-sample.json";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            MyData myData = gson.fromJson(reader, MyData.class);
            System.out.println("MyData object: " + myData);
        }
    }
}
