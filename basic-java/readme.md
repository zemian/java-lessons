# basic

Learning basic Java Programming Language.

NOTE: It's important to learn the basic of Java using a plain text editor instead of a full IDE.

Java 11 API Reference: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/module-summary.html

## Goal

I want to introduce Java programming to beginners as quickly as possible. The lessons are short and with
the essential **Main focus** topics that cover common use cases. The main topics will contain working
example code in each lesson. There are also **Further Study** notes to help students to research more
on related topics on their own.

After these lessons, the students should able to understand basic of Java programming language and be
able to read existing code and write simple program on their own.

There are many Java programming patterns and techniques that go beyong the basic syntax. After
these lessons, you may want to explore some [Common Tasks](../commontasks) in Java.

## Install and Setup Java Development Kit (JDK)

1. Download and install JDK 11 from https://jdk.java.net/java-se-ri/11

2. Setup Terminal environment variable with where you installed JDK.
   
   	For example on MacOS: edit `$HOME/.bashrc` file and add the following at the end:

   	```
	export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.3.jdk/Contents/Home
	export PATH=$JAVA_HOME/bin:$PATH
	```

	For Windows OS, you need to modify the System Environment to add JAVA_HOME. Then ensure you add
	the `JAVA_HOME/bin` to PATH on the very top of the entries list.

3. Verify `java -version` and `javac -version` commands are good.

4. Compile and Run Hello program

	```
	# To compile it
	cd basic-java/src/main/java

	javac Hello.java
	
	# To run it
	java Hello
	```

NOTE: Some lessons might have additional compilation steps. See the code comments for more details.

## Learning Path

* [Lesson 1 - Hello World](src/main/java/Hello.java)
* [Lesson 2 - Primitive Types](src/main/java/PrimitiveTypes.java)
* [Lesson 3 - Data Operators](src/main/java/DataOperators.java)
* [Lesson 4 - Data Arrays](src/main/java/DataArrays.java)
* [Lesson 5 - Control Statements](src/main/java/ControlStatements.java)
* [Lesson 6 - String Type](src/main/java/StringType.java)
* [Lesson 7 - Functions](src/main/java/Functions.java)
* [Lesson 8 - Functions Group by Class](src/main/java/FunctionsGroupByClass.java)
* [Lesson 9 - Class Type Definition](src/main/java/ClassTypeDefinition.java)
* [Lesson 10 - Packages](src/main/java/Packages.java)
* [Lesson 11 - Primitive Wrappers](src/main/java/PrimitiveWrappers.java)
* [Lesson 12 - Collection Types](src/main/java/CollectionTypes.java)
* [Lesson 13 - Class Inheritance](src/main/java/ClassInheritance.java)
* [Lesson 14 - Abstract Class](src/main/java/AbstractClass.java)
* [Lesson 15 - Interface](src/main/java/Interface.java)
* [Lesson 16- Static and Inner Class](src/main/java/StaticInnerClass.java)
* [Lesson 17 - Access Modifier](src/main/java/AccessModifier.java)
* [Lesson 18 - Enum Type](src/main/java/EnumType.java)
* [Lesson 19 - Generic Type](src/main/java/GenericType.java)
* [Lesson 20 - Exception Handling](src/main/java/ExceptionHandling.java)
* [Lesson 21 - Meta Class](src/main/java/MetaClass.java)
* [Lesson 22 - Anonymous Class](src/main/java/AnonymousClass.java)
* [Lesson 23 - Lambda](src/main/java/Lambda.java)
* [Lesson 24 - Multitask With Threads](src/main/java/MultitaskWithThreads.java)
* [Lesson 25 - Jar Files and Classpath](src/main/java/JarFilesClasspath.java)
