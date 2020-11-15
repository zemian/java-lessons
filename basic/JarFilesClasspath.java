import packages.Apple;

/**
 * Jar and Packages - Delivering code easier
 *
 * If you want to share code with other people, transferring large number of classes and packages is not practical.
 * Java give you a way to not only zip up all files, but also compress it!
 *
 * Main focus:
 * - Reuse "packages" output from previous lesson
 * - Build jar file with "jar" command.
 * - Inspect a .class with "javap"
 *
 * Further study:
 * - Learn to use multiple jar files
 * - Learn how to use 'javac -d'
 * - Create executable jar and run with 'java -jar'
 * - Learn what a decompiler is
 * - Learn to use project builder tool: ant or maven
 * - Learn to use IDE to export jar file
 */
public class JarFilesClasspath {

    // Use following in a terminal to create a jar file.
    //
    //     # To create a jar file
    //     cd basic
    //     javac JarFilesClasspath.java $(find packages -name '*.java')
    //     jar -cvf my.jar JarFilesClasspath.* $(find packages -name '*.class')
    //
    //     # To inspect the jar file
    //     jar tvf my.jar
    //
    //     # To run a jar file that has a main()
    //     java -classpath '.:my.jar' JarFilesClasspath
    //
    public static void main(String[] args) {
        System.out.println(Apple.tasteDescription());
        System.out.println(packages.recipe.ApplePie.howToCook());
    }
}
