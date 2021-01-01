package zemian.commontasks.guavaexamples;

import java.util.Date;

/*
https://github.com/google/gson/blob/master/UserGuide.md#TOC-Using-Gson
 */
public class HelloGuava {
    public static void main(String[] args) {
        MyData data = new MyData("foo", 99, new Date(), 3.14);
        System.out.println(data);
    }
}
