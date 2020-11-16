/*
 * Packages - Java namespace
 *
 * If class can hold functions, then think of package is used to hold classes.
 * Java packages use the file system structure to separate and store classes with
 * a namespace. See "Lesson06" folder for this lesson package definition used in
 * this lesson.
 *
 * Main focus:
 * - Create package by matching folder structure
 * - Remember to declare package name in definition
 * - Follow one class per file pattern
 * - Nested packages
 *
 * Further study:
 * - Learn about default package "java.lang"
 * - Learn about few import built-in JDK packages:
 *   java.util.*, java.io.*, java.text.*
 */

import packages.Apple; // Or you can do "lesson06.*" to import all classes

// Use import statement to bring in class definitions
public class Packages {
    public static void main(String[] args) {
        // Now "Apple" class is available to use
        System.out.println(Apple.tasteDescription());

        // Or you can use it with full package prefix without import
        System.out.println(packages.recipe.ApplePie.howToCook());
    }
}
