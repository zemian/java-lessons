/*
Jar and Packages - Delivering code easier

If you want to share code with other people, transferring large number of classes and packages is not practical.
Java give you a way to not only zip up all files, but also compress it!

Main focus:
- Reuse "packages" output from previous lesson
- Build jar file with "jar" command.
- Inspect a .class with "javap"

Further study:
- Learn to use multiple jar files
- Learn how to use 'javac -d'
- Create executable jar and run with 'java -jar'
- Learn what a decompiler is
- Learn to use project builder tool: ant or maven
- Learn to use IDE to export jar file
- Learn that you can package resource files inside jar
- Learn how to read resource files from inside a jar programmatically
 */

//
// Use following in a terminal to create a jar file.
//
// How to clean up all generated files
//
//    rm -v $(find . -name '*.class' -o -name '*.jar')
//
// To create a jar file
//
//     cd basic
//     javac $(find packages -name '*.java') JarFilesClasspath.java
//     jar -cvf my.jar $(find packages -name '*.class') JarFilesClasspath.*
//
// To inspect the jar file
//
//     jar tvf my.jar
//
// To run a jar file that has a main()
//
//     java -classpath my.jar JarFilesClasspath
//     java -cp my.jar JarFilesClasspath
//
// How to clean up generated files and re-try
//     rm -v $(find . -name '*.class' -o -name '*.jar')
//
//
// You may also use Ant tool to compile all the java files:
//
//     ant build
//     java -cp target/basic-1.0.jar JarFilesClasspath
//
// You may also try generating javadoc!
// NOTE: This javadoc tool only generate package classes. It ignores default package classes.
//
//     ant javadoc
//     open target/javadoc
//

import packages.Apple;

public class JarFilesClasspath {
    public static void main(String[] args) {
        System.out.println(Apple.tasteDescription());
        System.out.println(packages.recipe.ApplePie.howToCook());
    }
}
