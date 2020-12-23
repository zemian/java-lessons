Build a Minecraft Plugin using Maven

This plugin will add a "hello" command and send a greeting.

To build and install this plugin, you need the following:

1. Buy and create a Minecraft account from https://www.minecraft.net
2. Download and install Minecraft Server from https://www.spigotmc.org
3. Build this project jar using `mvn package` command
4. Copy the `target/hello-world-plugin-1.0-SNAPSHOT.jar` into your server plugin directory.
5. Starter your server with `java -jar spigot-1.15.2.jar`
6. Connect Minecraft client to your server
7. Test your plugin "hello" command

NOTE: If you want to build the jar directly into the Spigot server, run this:

    mvn package -Dspigotmc.home=/path/to/spigotmc-1.15

EXtra Reading:

* https://bukkit.gamepedia.com/Plugin_Tutorial
* https://www.spigotmc.org/threads/enable-debug-logging-to-console.456250/ (How MC Loggers work)