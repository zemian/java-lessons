/*
Java has 8 primitive types.

Main focus:
- There 4 main types: int, double, boolean, and char
- Other 4 types are just more narrow or wider of the main type on the data range.
- We can cast - convert and force one type to another between numeric types.

Further study:
- Explore the data range for each type
- Learn how to use good names on variable!
- Why does "0.1 + 0.2" does not equals "0.3" ?
- Learn about floating point number: https://floating-point-gui.de/formats/fp/

Exercise:
1. Find the min and max value of each data type range.
2. What will happen if you increase int beyond it's max limit?
3. Create an area formula expression with variables and calculate the result
3. Create an quadratic formula expression with variables and calculate the result
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
        byte b1 = -0x80;
        byte b2 = 0x0A;
        byte b3 = 0x7F;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // You can declare multiple variables on the same line
        int x = 9, y = 8, z = 7;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // thousand separator
        int bigNumber = 98_123_450;
        System.out.println(bigNumber);

        // Storing int into long is okay
        long big = 123;
        System.out.println(big);

        // Storing float into double is okay
        double big2 = 123f;
        System.out.println(big2);

        // Storing long into int is not good
        int bad = (int)999_999_999_999_999L;
        float bad2 = (float)0.999_999_999_999_999; // => -1530494977
        System.out.println(bad);
        System.out.println(bad2);
    }
}
