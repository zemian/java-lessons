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

## Java ScriptEngines

* Built-in JDK JavaScript engine: https://docs.oracle.com/en/java/javase/11/scripting/
* Groovy: https://groovy-lang.org/
* Ruby: https://www.jruby.org/
* Python: https://www.jython.org/

## How to Setup Groovy

To use Groovy, you need the groovy and groovy-jsr223 dependencies. 

MC plugins dependencies can be package as big fat jar, but there is problem loading jsr223 
for ScriptEngine discovery. An alternative way to setup plugin dependencies is to 
simply add it to the MC server classpath in a startup script.

For example:

```
java -cp 'groovy.jar:groovy-jsr223.jar;spigot.jar' org.bukkit.craftbukkit.Main --nogui
```
