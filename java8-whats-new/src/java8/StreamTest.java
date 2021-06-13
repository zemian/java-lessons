package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("One", "Two", "Three");
        myList.stream()
                .filter(s -> s.startsWith("O"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        Arrays.stream(new int[]{3, 2, 1}).map(n -> n * 2).forEach(System.out::println);

        // Stream to list
        Stream.of(3, 2, 1).map(n -> n * 2).collect(Collectors.toList()).forEach(System.out::println);
        Stream<String> language = Stream.of("java", "python", "node");
        List<String> result = language.collect(Collectors.toList());
        result.forEach(System.out::println);

        // TODO Why this failed?
        //Arrays.stream(new int[]{3, 2, 1}).map(n -> n * 2).collect(Collectors.toList());
    }
}
