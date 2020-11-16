/**
 * Primitive Wrappers are builtin Java classes that represents each of the primitive data type.
 *
 * Main focus:
 * - Wrapper classes provide many static utility methods range from type conversions.
 * - Wrapper classes create data and wraps it in an object.
 * - Java supports autoboxing - assigning literal type values will auto wrap into object
 * - Wrapper object can have "null" value
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
        String binaryNum = Integer.toBinaryString(0xAB07);
    }
}