import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {
    public static void main(String[] args) throws Exception {
        // Working with Unix Epoch time
        long t1 = System.currentTimeMillis();
        System.out.println("T1 " + t1);
        double answer = 3.14;
        for (int i = 0; i < 100_000; i++) {
            answer += Math.sin(answer + i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Answer " + answer + " took " + (t2 - t1) + " ms");

        // Working with Date
        Date today = new Date(System.currentTimeMillis());
        Date today2 = new Date(); // Same as above

        // Display date string in "Wed Nov 25 11:28:05 EST 2020" format
        System.out.println(today);

        // Date to epoch conversion
        System.out.println(today2.getTime());

        // Epoch date - Zero epoch time
        System.out.println("Epoch date " + new Date(0));

        // Display date object in other custom format
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Formatted date: " + df.format(today));

        // Parsing date from string in a certain format
        if (args.length > 0) {
            Date inputDate = df.parse(args[0]);
            System.out.println("Input date " + inputDate);


            // Getting date parts
            Calendar cal = Calendar.getInstance();
            cal.setTime(inputDate);
            System.out.println("Calendar year: " + cal.get(Calendar.YEAR));
            System.out.println("Calendar month: " + cal.get(Calendar.MONTH) + 1);
            System.out.println("Calendar day: " + cal.get(Calendar.DATE));

            // Create date from parts (Calendar to Date)
            Calendar cal2 = Calendar.getInstance();
            cal2.set(2020, Calendar.NOVEMBER, 26);
            Date thanksgivingDate = cal2.getTime();
            System.out.println("Thanksgiving: " + thanksgivingDate);
        }



    }
}
