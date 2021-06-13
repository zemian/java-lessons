package java11;

/**
 * https://docs.oracle.com/en/java/javase/11/
 * Java8 released on September 2018 (https://en.wikipedia.org/wiki/Java_version_history)
 * https://www.oracle.com/java/technologies/javase/11-relnote-issues.html#NewFeature
 * https://mkyong.com/java/what-is-new-in-java-11/
 */
public class Hello {
    public static void main(String[] args) {
        // Java11 lets you run directly from source in Terminal!
        // try:
        //   java java11-whats-new/src/java11/Hello.java
        //
        // This means you can use shebang #! in source, but it has to be a shell file, not
        // java source in package!
        System.out.println("Hi");
    }
}
