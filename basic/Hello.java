/*
A classic Hello World program in Java

Main focus:
- Basic Java code structure - class match file naming convention.
- Introducing JDK with javac and java command line

Further study:
- Learn to compile and run Java program from command line using "java" and "javac"
- Note that class name matches to file
- Note the function signature for "main"
- Explore what is the ".class" file
- Explore more on command line options for "java" and "javac"

Exercise:
1. Recreate Hello program by retyping it without peeking
2. Find the version of your "java" command in your system
3. Install/reinstall latest JDK software package.
 */

//
// 1. Download and install JDK 11 from https://www.oracle.com/java
//
// 2. Setup Terminal environment variable with where you installed JDK.
//    For example: edit ".bashrc" file and add the following at the end:
//
//      export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.3.jdk/Contents/Home
//      export PATH=$JAVA_HOME/bin:$PATH
//
// 3. Verify "java -version" and "which javac" are expected
//
// 4. Compile and Run Hello program
//
//      # To compile it
//      cd basic
//      javac Hello.java
//
//      # To run it
//      java Hello
//
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
