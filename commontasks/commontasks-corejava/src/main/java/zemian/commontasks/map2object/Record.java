package zemian.commontasks.map2object;

import java.util.List;

public class Record {
    List<Integer> points;
    int score;

    public Record() {
    }

    @Override
    public String toString() {
        return "Record{" +
                "points=" + points +
                ", score=" + score +
                '}';
    }
}
