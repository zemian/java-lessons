/*
Java supports anonymous function (without name) and it's called Lambda.

Main focus:
- Create a one time function usage that pass to other function as argument.
- Implement single abstract method (SAM)
- Provide Java function programming style

Further study:
- See https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
- Learn about Java Stream https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

 */

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        // Normal looping of a list
        ArrayList<String> list = new ArrayList<>(List.of("one", "two", "three"));
        for (String word: list) {
            System.out.println(word.toUpperCase());
        }
        // Alternative of using a anonymous function to a "stream()" receiver.
        list.stream().forEach((word) -> System.out.println(word.toUpperCase()));
        list.stream().forEach(word -> System.out.println(word.toUpperCase()));

        // More example with map that returns a list
        List<String> capWords = list.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
        System.out.println(capWords);

        // Creating your own function receiver - example of callback
        generateWord(word -> {
            System.out.println("Got a word: " + word);
        });

        // Example of generator
        transformWord(() -> {
            // Generate a random string
            String word = UUID.randomUUID().toString();
            return word;
        });

        // Another example: Implements Runnable
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am running a task");
            }
        };
        doAction(task);
        // Now creating a anonymous function/closure/lambda and pass into a caller
        doAction(() -> {
            System.out.println("Hi");
        });

        // Working array with stream() receiver - function programming style
        // Note we need a utility method to convert array to stream() first
        int[] numbers = {7, 8, 9};
        int[] doubleNumbers = java.util.Arrays.stream(numbers).map((num) -> num2).toArray();
        System.out.println(doubleNumbers[0]);
        System.out.println(doubleNumbers[1]);
        System.out.println(doubleNumbers[2]);

        // Or if there is only one argument, you don't need parenthesis
        doubleNumbers = java.util.Arrays.stream(numbers).map(num -> num2).toArray();
        System.out.println(doubleNumbers[0]);
    }

    /*
    How to design function that accept other function:
    See https://stackoverflow.com/questions/29945627/java-8-lambda-void-argument

        Use Supplier if it takes nothing, but returns something.

        Use Consumer if it takes something, but returns nothing.

        Use Callable if it returns a result and might throw (most akin to Thunk in general CS terms).

        Use Runnable if it does neither and cannot throw.
     */


    public static void generateWord(Consumer<String> callback) {
        // Generate a random string
        String word = UUID.randomUUID().toString();
        callback.accept(word);
    }

    public static String transformWord(Supplier<String> wordGenerator) {
        String word = wordGenerator.get();
        return word.toUpperCase();
    }

    // A function that accepts a function as parameter
    public static void doAction(Runnable callback) {
        System.out.println("About to invoke a anonymous function");
        callback.run();
        System.out.println("Anonymous function finished");
    }
}
