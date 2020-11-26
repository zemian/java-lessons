/*
Java 8 primitive types

Main focus:
- There 4 main types: int, double, boolean, and char
- Other 4 types are just more narrow or wider of the main type on the data range.
- Each type can be group together using "array"

Further study:
- Explore the data range for each type
- Explore more operators you can use for each data type
- Explore some basic operators you can use on each type
- Explore what happen when you mix types when using with operators
- Learn how to use good name on variable!
- Array is fixed once created
- Array can be self-nested (2d arrays)
- Learn about floating point number: https://floating-point-gui.de/formats/fp/

Exercise:
1. Find the min and max value of each data type range.
2. What will happen if you increase int beyond it's max limit?
3. Find at least 2 other operators that you can use on "int" types.
4. Find a array size value that will start failing your program.
5. Swap two elements in an array
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
        char c = 'A';

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(n);
        System.out.println(f);
        System.out.println(d);
        System.out.println(t);
        System.out.println(c);

        // Array type - a container of fixed size and data
        int[] numbers = {1, 2, 3}; // We call the curly braces array literal initializer
        System.out.println(numbers);
        System.out.println(java.util.Arrays.toString(numbers)); // How to print array nicely

        // Access array elements by zero based index with bracket notation
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // Get the array size
        int arraySize = numbers.length;
        System.out.println(arraySize);

        // You can create array of pre-determined size without data first, then fill it later
        int size = 10_000; // number can have '_' separator!
        double[] bigArray = new double[size]; // Holds default value of zero's
        System.out.println(bigArray[0]);
        System.out.println(bigArray[bigArray.length - 1]);

        // ## Four basic math operators: + - * /
        // it works for all numeric types
        int sum = 99 + 1;
        double sum2 = 1.0 + 2.0;
        System.out.println(sum);
        System.out.println(sum2);

        // Other special numeric operators
        int remainder = 100 % 40;
        System.out.println(remainder);
        int hex = 0xFF >>> 1; // Shifting bit value one place to the right
        System.out.println(hex);

        // Char type are for single character, but they are actually numeric with ascii code value
        char firstLetter = 'A';
        System.out.println(firstLetter);
        firstLetter = (char)(firstLetter + 1); // cast is needed because " + 1" turns it into int type.
        System.out.println(firstLetter);

        // Char can hold outside of letter or plain ASCII value that assign with Unicode value
        char oddChar = '\uffff';
        System.out.println(oddChar);

        // Byte is a small int -128 to 127, but it the value it holds is actually used to
        // represents binary value. Think of it as 8 bit binary data type.
        byte[] binary = {-0x80, 0x0A, 0x0B, 0x0C, 0x7F};
        System.out.println(java.util.Arrays.toString(binary));

        // ## Operator Precedence
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
        System.out.println(n + 9 - i * d / 5);
        System.out.println(n + (9 - i) * d / 5);

        // A special Math object that provide some more numeric operations
        System.out.println(Math.random());         // Random decimal greater or equals to 0.0, but less than 1.0
        System.out.println(Math.floor(1.5123));    // => 1.0
        System.out.println(Math.ceil(1.5123));     // => 2.0
        System.out.println(Math.min(1, 2));        // => 1
        System.out.println(Math.max(1, 2));        // => 2
        System.out.println(Math.abs(-1));          // => 1
        System.out.println(Math.pow(2, 8));        // 2 to the power of 8 => 256
        System.out.println(Math.cos(Math.PI / 2)); // Calc trignometric cosine of angle in radian unit
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println(Math.tan(Math.PI / 2));
    }
}
