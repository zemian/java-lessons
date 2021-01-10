/*
Function - Java static methods

One usage of Class is to simply group functions together.

Further study:
- Notice the usage of "static" keyword on function
- Notice how we created a classes inside our main class (nested or inner classes)
- Explore how "javac" generate ".class" files on these inner classes.
- Notice that all code in Java program must be inside one or more classes!

Excercise:

- Write a Class with following functions:
    * Method "print10Nums" that prints number 1 to 10.
    * Method "printRangeNums(int min, int max)" that prints number from min to max (both inclusive).
    * Method "printRandomNums(int min, int max)" that prints one random number between min (inclusive) to max (exclusive).
 */
public class FunctionsGroupByClass {
    public static void main(String[] args) {
        // You can access functions in Class with "dot" operator
        MyFunction.printHi();
        MyFunction2.printHi();
    }

    public static class MyFunction {
        // Function One
        public static void printHi() {
            System.out.println("Hi Zemian");
        }

        // You can not redefine function with same name
        /* This will not compile!
        public static void printHi() {
            System.out.println("Hi Zemian");
        }
        */
    }

    public static class MyFunction2 {
        // Since you are in different class, now you can have same function name.
        public static void printHi() {
            System.out.println("Hello Zemian");
        }
    }
}
