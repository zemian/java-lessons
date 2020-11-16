/*
 * Java 8 primitive types
 *
 * Main focus:
 * - There 4 main types: int, double, boolean, and char
 * - Other 4 types are just more narrow or wider of the main type on the data range.
 * - Each type can be group together using "array"
 *
 * Further study:
 * - Explore the data range for each type
 * - Explore more operators you can use for each data type
 * - Explore some basic operators you can use on each type
 * - Explore what happen when you mix types when using with operators
 * - Learn how to use good name on variable!
 * - Array is fixed once created
 * - Array can be self-nested (2d arrays)
 * - Learn about floating point number: https://floating-point-gui.de/formats/fp/
 *
 * Exercise:
 * 1. Find the min and max value of each data type range.
 * 2. What will happen if you increase int beyond it's max limit?
 * 3. Find at least 2 other operators that you can use on "int" types.
 * 4. Find a array size value that will start failing your program.
 * 5. Swap two elements in an array
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        // # The 8 primitive types
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

        byte b = 0x7F;
        short s = 99;
        int i = 1234567890;
        long n = 1234567890123456789L;
        float f = 3.14f;
        double d = 3.14159265358979323846264338327950288419716939937510;
        boolean t = true;
        char c = '\uffff';

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(n);
        System.out.println(f);
        System.out.println(d);
        System.out.println(t);
        System.out.println(c);

        // Array type - a container
        int[] numbers = {1, 2, 3};
        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers.length);

        int[] bigArray = new int[10_000]; // Holds default value
        System.out.println(bigArray[0]);
        System.out.println(bigArray[bigArray.length - 1]);

        // ## Operators
        int sum = 99 + 1;
        double sum2 = 1.0 + 2.0;
        int hex = 0xFF >>> 1;
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(hex);

        // ## Operator Precedence
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
        System.out.println(n + 9 - i * d / 5);
        System.out.println(n + (9 - i) * d / 5);
    }
}
