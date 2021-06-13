package java8;

import java.util.ArrayList;
import java.util.List;

/**
 * https://docs.oracle.com/javase/8/
 * Java8 released on March 2014 (https://en.wikipedia.org/wiki/Java_version_history)
 * https://www.oracle.com/java/technologies/javase/8-whats-new.html
 * https://mkyong.com/tutorials/java-8-tutorials/
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hi");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // normal loop
        for (String l : list) {
            System.out.println(l);
        }

        //  Java 8 forEach to loop a List.
        // lambda
        // list.forEach(x -> System.out.println(x));

        // method reference
        list.forEach(System.out::println);
    }
}
