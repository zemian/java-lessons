This is a basic ant build tool based project example.

Place all source files under `src/main/java` directory.
NOTE: The file structure is similar to Maven, but it is not a must have requirement.

If you have any third party libraries jars, add them into
the `lib/compile` folder.

To build the project, run:

    ant dist
    
To clean and retry

    ant clean build
    
To auto download test + logger libraries, run:

    ant download-lib
    ant test
    