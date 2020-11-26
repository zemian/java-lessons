public class ArraysDemo {
    public static void main(String[] args) {
        // Print java primitive arrays
        int[] numbers = {9, 8, 7};
        System.out.println("numbers " + java.util.Arrays.toString(numbers));
        byte[] binary = {-0x80, 0x0A, 0x0B, 0x0C, 0x7F};
        System.out.println("binary " + java.util.Arrays.toString(binary));

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
