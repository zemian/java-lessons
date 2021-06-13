package java16;

import java.lang.reflect.RecordComponent;

public class MyRecordMain {
    public static void main(String[] args) {
        MyRecord a = new MyRecord("Dumpling", 1);
        MyRecord b = new MyRecord("Spring", 1);
        System.out.println(a);
        System.out.println(a.name()); // Note: it's not a getter!
        System.out.println(a.age());
        System.out.println(a.hashCode());
        System.out.println(a.equals(b));

        // Inspect record with new API
        RecordComponent[] recordComps = a.getClass().getRecordComponents();
        for (RecordComponent rec : recordComps) {
            System.out.println(rec.getName());
        }

        // Check isRecord from object
        if (a.getClass().isRecord()) {
            System.out.println("Record!");
        }
    }
}
