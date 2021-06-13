package java16;

public class InstanceofPatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello World";

        // Old way:
        if (obj instanceof String) {
            String s = (String) obj;    // cast
            System.out.println(s.toLowerCase());
        }

        // New way:
        if (obj instanceof String s) {
            System.out.println(s.toLowerCase());
        }

        // Combined operators
        if (obj instanceof String s && s.length() > 5) {
            if (s.equalsIgnoreCase("java16")) {
                //...
            }
        }
    }
}
