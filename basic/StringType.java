/*
String - a special Java type

Main focus:
- Create string using double quote literal
- It can use "null" value
- It's a object, hence it can use "dot" operator on methods.

Further study:
- Learn some common String function/methods you can use from the API
- Learn more on java.util.Arrays class and it's methods from the API
- Learn more about Java regular expression
- Learn more about Locale String Formatting

Exercises:
1. What happen when you call "dot" methods on a null value?
2. Create a string from array of "char".
3. Convert all string value to upper case.
 */
public class StringType {
    public static void main(String[] args) {
        // # Builtin String object literal and its methods usage
        String str = "foo";
        System.out.println(str);
        System.out.println(str + " bar"); // Use of (+) concatenation operator
        System.out.println(str + 3.14);
        System.out.println(str.length()); // Use of "dot" operator here
        System.out.println(str.substring(0, 2));
        System.out.println(str.indexOf("o"));

        // String can hold a special value called "null"
        // If you assign this value, it can not invoke any of the "dot" operations
        String str2 = null;
        System.out.println(str2);
        //System.out.println(str2.length()); // ERROR: NullPointerException!

        // Java String need scape on certain characters
        String special = "That's one good \"string\" that ends with \\n character\n.";
        System.out.println(special);
        // It should prints: That's one good "string" that ends with \n character

        // Create String from char[] array
        char[] letters = {'h', 'e', 'l', 'l', 'o'};
        String word = new String(letters);
        System.out.println(word);

        // Convert String to char[] array
        char[] characters = str.toCharArray(); // Get the data under string
        System.out.println(characters[0]);

        // Array of String
        String[] array = {"foo", "bar", "baz"};
        System.out.println(array);
        System.out.println(array[0]);

        // Array of fixed size Strings with default null values
        String[] names = new String[10]; // Holds null values!
        System.out.println(names[0]);
        //System.out.println(names[0].length()); // ERROR: Element is null - hence NullPointerException!
        System.out.println(names.length); // Array length is valid

        // Split and join
        String[] words = "one two three".split(" ");
        System.out.println(java.util.Arrays.asList(words)); // Pretty print array
        String line = String.join("|", words);
        System.out.println(line);

        // Compare strings - Do not use '==' on String
        String a = "foo";
        if (a.equals("foo")) {
            System.out.println("String a is a 'foo'");
        }

        // Match with regular expression of '\w+'
        // Note that we need to escape '\' character in string.
        if (a.matches("\\w+")) {
            System.out.println("Match found!");
        }

        // String is immutable, so you have to so lot of concatenation that build new String.
        // If you do this often, then its' not efficient. Luckily, Java has StringBuilder
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            strBuilder.append("Test#").append(i).append("\n");
        }
        String strFinal = strBuilder.toString();
        System.out.println(strFinal);

        // Converting String to other types

        // Convert string to int
        int inputNum = Integer.parseInt("987");
        System.out.println(inputNum);
        System.out.println(Double.parseDouble("3.14"));
        System.out.println(Boolean.valueOf("true"));

        // Int to string is easy and can be used with concatenate
        String strNum = "" + 123;
        System.out.println(strNum);

        // Convert Hex(int) into String of bits (zeros and ones)
        String binaryNum = Integer.toBinaryString(0xAB07);
        System.out.println(binaryNum);

        // String formatting
        String output = String.format("Hello %s", "World");
        System.out.println(output);
        System.out.println(String.format("Hello %50s", "World"));
        System.out.println(String.format("Score %d", 9_000));
        System.out.println(String.format("Score %50d", 9_000));
        System.out.println(String.format("Score %-50d", 9_000));
        System.out.println(String.format("Price %f", 1_234.99));
        System.out.println(String.format("Price %.2f", 1_234.99));
        System.out.println(String.format("Price %50.2f", 1_234.99));
        System.out.println(String.format("Price %50.2f", .99));
    }
}
