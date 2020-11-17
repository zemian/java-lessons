/*
 * Primitive Wrappers are builtin Java classes that represents each of the primitive data type.
 *
 * Main focus:
 * - Wrapper classes provide many static utility methods range from type conversions
 * - Wrapper classes create data and wraps it in an object
 * - Java supports autoboxing - assigning literal type values will auto wrap into object
 * - Wrapper object can have "null" value
 *
 * Further Study:
 * - Always use primitive types instead of wrapper unless you have reason for it
 * - Primitive wrapper are used in Collection Types, which you will learn more later
 * - It's better NOT to use 'new' keyword on wrapper and use literal autoboxing instead
 */
public class PrimitiveWrappers {
    public static void main(String[] args) {
        // ## Object wrapper for primitive types
        Integer intObj = new Integer(99); // Redundant to use "new"
        Integer intObj2 = 99; // Default to use Autoboxing
        Double doubleObj = 3.14;
        Integer[] intArray = {1, 2, 3};
        System.out.println(intObj);
        System.out.println(intObj2);
        System.out.println(doubleObj);
        System.out.println(intArray[0]);

        // ## Null value for object
        String obj1 = null;
        Integer obj2 = null;
        Double obj3 = null;
        Object obj4 = null;
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

        // Use their utility methods related to Integer
        // View constants
        System.out.println(Integer.MAX_VALUE);
        // Convert Hex(int) into string of bits (zeros and ones)
        String binaryNum = Integer.toBinaryString(0xAB07);
        System.out.println(binaryNum);
        // Convert string to int
        int inputNum = Integer.parseInt("987");
        System.out.println(inputNum);
    }
}
