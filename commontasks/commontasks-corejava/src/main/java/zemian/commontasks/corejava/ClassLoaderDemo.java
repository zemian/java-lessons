package zemian.commontasks.corejava;

public class ClassLoaderDemo {
    public static void main(String[] args) throws Exception {
        ClassLoader classloader = ClassLoaderDemo.class.getClassLoader();
        printHierarchy("ClassLoader for ClassLoaderDemo class", classloader);

        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        printHierarchy("ClassLoader for current thread context", cl);

        // NOTE: Class such as "java.lang.Integer" will not have classloader!
        if (args.length > 0) {
            Class<?> clazz = Class.forName(args[0]);
            printHierarchy("ClassLoader for " + args[0], clazz.getClassLoader());
        }

        // You can create your own ClassLoader to load Class from a specific location.
        // To learn more, see this article:
        // https://www.baeldung.com/java-classloaders
    }

    public static void printHierarchy(String label, ClassLoader cl) {
        System.out.println(label);
        if (cl == null) {
            System.out.println("  No classloader found!");
            return;
        }

        String indent = "  ";
        do {
            System.out.println(indent + cl);
            indent += "  " ;
            cl = cl.getParent();
        } while (cl != null);
    }
}
