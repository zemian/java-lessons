public class ReverseString {
    public static void main(String[] args) {
        //reverseString1();
        reverseString2();
    }

    private static void reverseString1() {
        String s = "Hello";
        String s2 = (new StringBuilder(s)).reverse().toString();
        System.out.println(s2);
    }

    private static void reverseString2() {
        // To implement this manually, we can loop through half of the string char array, and
        // swapping from the back of the array.
        // NOTE: We can try to use "stop = max >> 1" to gain performance (See StringBuider impl)
        // it's just one tiny operation, so does not matter much in most cases.
        String s = "Hello";
        char[] sChars = s.toCharArray();
        for (int i = 0, max  = sChars.length - 1, stop = max / 2; i <= stop; i++) {
            int j = max - i;
            char temp = sChars[i];
            sChars[i] = sChars[j];
            sChars[j] = temp;
        }
        String s2 = String.valueOf(sChars);
        System.out.println(s2);
    }
}
