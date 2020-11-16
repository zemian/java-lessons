/*
 * String - a special Java type
 *
 * Main focus:
 * - Create string using double quote literal
 * - It can use "null" value
 * - It's a object, hence it can use "dot" operator on methods.
 *
 * Further study:
 * - Learn some common String function/methods you can use from the API
 * - Learn more on java.util.Arrays class and it's methods from the API
 *
 * Exercises:
 * 1. What happen when you call "dot" methods on a null value?
 * 2. Create a string from array of "char". *
 * 3. Convert all string value to upper case.
 */
public class StringType {
    public static void main(String[] args) {
        // # Builtin String Object type
        String str = "foo";
        System.out.println(str);
        System.out.println(str + " bar"); // Use of (+) concatenation operator
        System.out.println(str + 3.14);
        System.out.println(str.length()); // Use of "dot" operator here
        System.out.println(str.substring(0, 2));
        System.out.println(str.indexOf("o"));

        char[] characters = str.toCharArray(); // Get the data under string
        System.out.println(characters[0]);

        // Array of String
        String[] array = {"foo", "bar", "baz"};
        System.out.println(array);
        System.out.println(array[0]);

        // Array of empty null values
        String[] names = new String[10]; // Holds null values!
        System.out.println(names[0]);
        System.out.println(names[0].length()); // NullPointerException!
    }
}
