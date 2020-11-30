/*
Primitive Data Operators

Main focus:
- Basic math operations
- Higher level math operations
- Order of precedences on operators
- Comparison operators

Further Studies
- Find at least 2 other operators that you can use on "int" types.
- Explore what happen when you mix types when using with operators

Exercise:
1. Discover what others operators Java supports: (example: &, |, >>, >>> etc)
2. Find a array size value that will start failing your program.
3. Swap two elements in an array

 */
public class DataOperators {
    public static void main(String[] args) {
        // ## Four basic math operators: + - * /
        int a = 9, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // Other special numeric operators
        int remainder = 100 % 40; // Modulus - calculate remainder
        System.out.println(remainder);
        int hex = 0xFF >>> 1; // Shifting bit value one place to the right
        System.out.println(hex);

        // ## Operator Precedence
        int i = 9, j = 8, k = 7;
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
        System.out.println(i + 9 - j * k / 5);            // => 7
        System.out.println(i + (9 - j) * k / 7);          // => 10

        // A special Math object that provide some common numeric operations
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
        // ==, !=, >=, <=, >, <
        boolean compareResult = a < b;
        System.out.println(compareResult);
        System.out.println(a == b);
        System.out.println(a >= b);

        // Logical operator
        boolean compareResult2 = a < 90 && a > 10;
        boolean compareResult3 = a < 90 || a > 10; // can short-circuit!
        System.out.println(compareResult2);
        System.out.println(compareResult3);

        // Negate operator
        boolean oppositeCompareResult3 = !compareResult3;
        System.out.println(oppositeCompareResult3);
    }
}
