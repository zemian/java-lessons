# About ScriptingPlugin

Use Java ScriptingEngine feature to dynamically load MC plugin for faster development process.

This should allow simple modification without reloading the server. Note that scripting can 
impact performance, so it should be used with care, or sometimes might be better to port it back
into Java code.

How to get started:

1. Build this plugin jar and deploy into Minecraft plugin folders. 
   (If you want to use external ScriptingEngine such as Groovy, enable the pom.xml dependency and
   then build and deploy the "uber" or "fat" jar).
2. Enter MC command `script` to execute it.

The default script is `scripts/plugin.groovy` where MC server starts, and you may change it 
using system property: `scriptPlugin`.

The script will have access to `scriptPlugin` variable, which is the Java instance for the plugin. This object
all the information to the MC. From the script, you should return an instance of `ScriptPlugin` object.

Example of MC run:

   

## Java ScriptEngines

* Built-in JDK JavaScript engine: https://docs.oracle.com/en/java/javase/11/scripting/
* Groovy: https://groovy-lang.org/
* Ruby: https://www.jruby.org/
* Python: https://www.jython.org/

## How to Setup Groovy

To use Groovy, you need the groovy and groovy-jsr223 dependencies, and use "maven-shade-plugin"
to create one big fat jar for deployment into MC server.

An alternative way to setup plugin dependencies is to simply add it to the MC server classpath in a 
startup script. For example:

```
java -cp 'groovy.jar:groovy-jsr223.jar;spigot.jar' org.bukkit.craftbukkit.Main --nogui
```

But this will create classloading problems since the plugin classloader is different than 
the system, and you will not able to see the plugin classes. A solution to this
is to use GroovyShell instead of ScriptingEngine.
