/*
Array is a container to hold elements of the same type.
You can create an array of each of the primitive data types we learned so far.

Main focus:
- Array is an object and can use "dot" operator
- Array has "length" property
- Array holds data elements - items
- Array has fixed size

Further study:
- How to resize array?
- Array can be self-nested (2d arrays), how about 3d array?

Exercise:
4. Find a array size value that will start failing your program.
5. Swap two elements in an array
 */
public class DataArrays {
    public static void main(String[] args) {
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

        // Byte array as binary data
        byte[] binary = {-0x80, 0x0A, 0x0B, 0x0C, 0x7F};
        System.out.println(java.util.Arrays.toString(binary));

        // Swap array elements
        int temp = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temp;
        System.out.println("numbers - swapped " + java.util.Arrays.toString(numbers));

        // Copy arrays
        int[] sourceNums = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] numbers2 = new int[sourceNums.length];
        System.arraycopy(sourceNums, 0, numbers2, 0, sourceNums.length);
        System.out.println("numbers2 " + java.util.Arrays.toString(numbers2));

        // Copy arrays - easier
        int[] numbers3 = java.util.Arrays.copyOf(sourceNums, sourceNums.length);
        System.out.println("numbers3 " + java.util.Arrays.toString(numbers3));

        // Copy arrays - easier - range
        int[] numbers4 = java.util.Arrays.copyOfRange(sourceNums, 3, 7);
        System.out.println("numbers4 " + java.util.Arrays.toString(numbers4));

        // Print 2D arrays
        String[][] tictactoe = {{"X", "O", " "}, {"X", "0", "O"}, {"O", " ", "x"}};
        System.out.println(java.util.Arrays.deepToString(tictactoe));
    }
}
