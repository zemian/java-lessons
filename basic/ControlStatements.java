/**
 * Control Statement
 *
 * Main focus:
 * - Statement is a line of executable code.
 * - Group of statements is called Block.
 * - Control Statements are keyword that let you control which block of code to execute
 *   under a certain condition.
 * - Block of code can be repeated or skipped.
 *
 * Further study:
 * - Learn about "switch" control statement (alternate to like if/elseif/else)
 * - Learn about "do-while" loop
 * - Learn about "continue" and "break" in loop
 *
 * More Ref:
 * - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html
 *
 * Exercise:
 * 1. Write a program that will convert string into Title string.
 * 2. Generate 10 random string with alpha numeric characters.
 * 3. Parse args for options (it should support --option=value syntax)
 */
public class ControlStatements {
    public static void main(String[] args) {
        // Shortcut - increment/decrement operators
        int n = 0;
        System.out.println(n);
        n = n + 1;
        System.out.println(n);
        n++;
        System.out.println(n);
        n--;
        System.out.println(n);

        // More fancier operator
        n = n + 5;
        System.out.println(n);
        n += 5;
        System.out.println(n);

        // Comparison & Boolean Result
        int a = 1, b = 3;
        boolean compareResult = a < b;
        System.out.println(compareResult);
        System.out.println(a == b);
        System.out.println(a >= b);

        // Condition Code Branching
        if (a < b) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is lesser than b");
        }

        // For Loop - repeat
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // Array Loop
        int [] numbers = {7, 8, 9};
        for (int i = 0; i < 3; i++) {
            int value = numbers[i];
            System.out.println(value);
        }

        // For Each Loop (with value directly without index counter)
        for (int value : numbers) {
            System.out.println(value);
        }

        // While Loop
        int counter = 0;
        while (counter < 3) {
            System.out.println(Math.random()); // Print random decimal between 0.0 and 1.0
            counter++;
        }
    }
}
