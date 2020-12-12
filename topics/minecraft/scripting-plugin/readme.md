# About ScriptingPlugin

Use Java ScriptingEngine feature to dynamically load MC plugin for faster development process.

This should allow simple modification without reloading the server. Note that scripting can 
impact performance, so it should be used with care, or sometimes might be better to port it back
into Java code.

How to get started:

1. Build this plugin jar and deploy into Minecraft plugin folders. 
   (If you want to use external ScriptingEngine such as Groovy, enable the pom.xml dependency and
   then build and deploy the "uber" or "fat" jar).
2. Enter MC command `script /path/to/script.extension` to execute it.

The `/path/to/script.extension` value is optional and if not given, it will use `$HOME/mc.js`.
The file `extension` is also used to initialize the Java ScriptingEngine. For example you.
may use `mc.groovy` if you decide to change the ScriptingEngine.

The script will have access to the following variables bindings in global scope:

* `sender`
* `command`
* `label`
* `strings`

These are the parameters passed into the `CommandExecutor.onCommand()` instance method.

## JDK Nashorn ScriptingEngine

JDK 6 - JDK 8 has a built-in JavaScript engine using the Rhino project

* https://docs.oracle.com/javase/7/docs/technotes/tools/index.html#scripting
* https://docs.oracle.com/javase/7/docs/technotes/tools/share/jrunscript.html
* https://docs.oracle.com/javase/7/docs/technotes/tools/share/jsdocs/allclasses-noframe.html
* https://developer.mozilla.org/en-US/docs/Mozilla/Projects/Rhino
* http://mozilla.github.io/rhino/javadoc/index.html
* https://developer.mozilla.org/en-US/docs/Mozilla/Projects/Rhino/Shell

JDK 8 to 14 the built-in JavaScript engine has been replaced by Nashorn project. 
An new command tool `jjs` has been added. 
Nashorn provides a 100% support of ECMAScript 5.1
Note that JDK11 is the LTS release.
* https://docs.oracle.com/en/java/javase/14/scripting/
* https://docs.oracle.com/en/java/javase/14/nashorn/
* https://docs.oracle.com/en/java/javase/14/docs/specs/man/jjs.html
* https://developer.oracle.com/databases/nashorn-javascript-part1.html

Starting JDK 15, Nashorn has been removed from JDK as separate project now.
Note that the `jrunscript` command is still avaiable in JDK 15, but it's experimental.
* https://github.com/openjdk/nashorn
* https://search.maven.org/artifact/org.openjdk.nashorn/nashorn-core/15.0/jar
* https://mail.openjdk.java.net/pipermail/nashorn-dev/2020-October/007557.html
* https://docs.oracle.com/en/java/javase/15/docs/specs/man/jrunscript.html

## Other ScriptingEngines

* https://groovy-lang.org/
* https://www.jruby.org/
* https://www.jython.org/

