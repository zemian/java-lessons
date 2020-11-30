/*
Control Statement

Main focus:
- Statement is a line of executable code.
- Group of statements is called Block.
- Control Statements are keyword that let you control which block of code to execute
  under a certain condition.
- Block of code can be repeated or skipped.

Further study:
- Learn about "switch" control statement (alternate to like if/elseif/else)
- Learn about "do-while" loop
- Learn about "continue" and "break" in loop

More Ref:
- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html

Exercise:
1. Write a program that will convert string into Title string.
2. Generate 10 random string with alpha numeric characters.
3. Parse args for options (it should support --option=value syntax)
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

        // Careful comparing double - use '>' or '<' on difference instead
        double strange = 0.1 + 0.2;
        if (strange == 0.3) {
            System.out.println("Expected");
        } else {
            System.out.println("Unexpected");
            System.out.println(strange); // Output: 0.30000000000000004
        }

        // Repeating code with While Loop under a condition
        int counter = 0;
        while (counter < 3) {
            System.out.println(Math.random()); // Print random decimal between 0.0 and 1.0
            counter++;
        }

        // For Loop - more compact than while
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // For loop is commonly used to iterate over collection data (array, list or map etc)
        int [] numbers = {7, 8, 9};
        for (int i = 0; i < 3; i++) {
            int value = numbers[i];
            System.out.println(value);
        }

        // You can break a for loop - exit early
        for (int i = 0; i < 3; i++) {
            int value = numbers[i];
            if (value % 2 == 0) {
              System.out.println(value);
              break; // Exit early
            }
        }

        // You can jump to next iteration of loop forcefully using "continue"
        for (int i = 0; i < 3; i++) {
            int value = numbers[i];
            if (value % 2 == 0) {
              System.out.println(value);
              continue; // Exit early
            }
        }

        // For Each Loop (with value directly without index counter)
        for (int value : numbers) {
            System.out.println(value);
        }

        // Ternary Operator - it's a expression that's short for if/else.
        // You can use it for assignment. Note that you can't assign if/else into variable,
        // but ternary operator can!
        String answer = (a < b) ? "yes" : "no";
        System.out.println(answer);

        // Switch statement
        String userInput = (args.length > 0) ? args[0] : "no";
        switch (userInput) { // You can also switch any numeric type or Enum!
            case "yes":
                System.out.println("User input entered YES.");
                System.out.println("You are the yes person.");
                break;
            case "no":
                System.out.println("You entered NO.");
                System.out.println("Or you could be didn't enter any value at all.");
                break;
            default:
                System.out.println("Wrong answer.");
        }

        // Do While
        int count = 0;
        do {
            System.out.println(count + " Action first, ask later.");
        } while (++count < 3);
    }
}
