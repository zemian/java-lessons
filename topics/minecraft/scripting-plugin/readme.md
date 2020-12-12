Use Java ScriptingEngine feature to dynamically load MC plugin for faster development process.

This should allow simple modification without reloading the server. But scripting can 
impact performance so it should be used with care.

## JDK Nashhorn

JDK 6 - JDK 8 has a built-in JavaScript engine using the Rhino project (see below).

JDK 8 to 14 the built-in JavaScript engine has been replaced by Nashorn project. 
Ad new command tool `jjs` has been added. Nashorn provides a 100% support of ECMAScript 5.1

Starting JDK 15, Nashorn has been removed from JDK and it will have its own separate 
package from JDK.

* https://github.com/openjdk/nashorn
* https://search.maven.org/artifact/org.openjdk.nashorn/nashorn-core/15.0/jar
* https://mail.openjdk.java.net/pipermail/nashorn-dev/2020-October/007557.html
* https://docs.oracle.com/en/java/javase/14/scripting/using-java-scripts.html#GUID-AB5FB8B1-AEE4-4ECE-9ECE-06E1A66F0291


## Mozilla Rhino Project

* https://developer.mozilla.org/en-US/docs/Mozilla/Projects/Rhino
* http://mozilla.github.io/rhino/javadoc/index.html
* https://developer.mozilla.org/en-US/docs/Mozilla/Projects/Rhino/Shell

    java org.mozilla.javascript.tools.shell.Main [options] script-filename-or-url [script-arguments]

## Groovy Scripting

1. Build the uber jar in this project into Spigot MC server plugins folder.
2. Enter MC command `groovy /path/to/mc.groovy` to execute it.

If you omit `/path/to/mc.groovy` it defaults to `$HOME/mc.groovy`.
