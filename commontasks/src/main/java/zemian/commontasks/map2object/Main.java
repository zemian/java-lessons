package zemian.commontasks.map2object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Using HashMap to represent object states
        HashMap<String, List<Integer>> record = new HashMap<>();
        record.put("points", List.of(7, 8, 9));
        record.put("score", List.of(99));
//        System.out.println(record);

        List<HashMap<String, List<Integer>> > records = new ArrayList<>();
        records.add(record);

        record = new HashMap<>();
        record.put("points", List.of(21, 22, 23));
        record.put("score", List.of(1_000));
        records.add(record);

        System.out.println(records);

        // Convert above to use a specific Record type
        List<Record> records2 = new ArrayList<>();
        Record record2 = new Record();
        record2.points = List.of(7, 8, 9);
        record2.score = 99;
        records2.add(record2);

        record2 = new Record();
        record2.points = List.of(21, 22, 23);
        record2.score = 1_000;
        records2.add(record2);

        System.out.println(records2);
    }
}
