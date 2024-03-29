package java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://docs.oracle.com/en/java/javase/16/index.html
 * Java16 released on March 2021 (https://en.wikipedia.org/wiki/Java_version_history)
 * https://www.oracle.com/java/technologies/javase/16-relnotes.html#NewFeature
 * https://mkyong.com/java/what-is-new-in-java-16/
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Day Period
        System.out.println(DateTimeFormatter.ofPattern("B").format(LocalTime.now()));

        // Stream.toList()
        List<Integer> list = Stream.of(3, 2, 1).map(n -> n * 2).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(3, 2, 1).map(n -> n * 2).toList();
    }
}