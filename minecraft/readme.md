Minecraft is a sandbox video game developed by Mojang. The game was created by Markus "Notch" Persson 
in the Java programming language. (https://en.wikipedia.org/wiki/Minecraft)

See https://www.minecraft.net/

You need to purchase a Java Edition of the Game, which gives you an account id to login and start 
the Game. The game can be play as standalone with the computer. Or you can start the Game as a client
to connect to Minecraft server to play with multi-players online.

For Minecraft server, you can either get the "Vanilla" server from official Mojang, or you may use
one of the OpenSource one such as the Spigot. It's through one such as Spigot server that you
can add custom plugins. (Or they call this the server side Mods.)

## How to setup Spigot Minecraft Server

1. Download [BuildTool.jar](https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar)
2. Run: `java -jar BuildTools.jar`
    NOTE: The build will take several minutes, and when it's done, you should have a `spigot.jar` file.
3. Run: `java -Xms2G -Xmx2G -XX:+UseG1GC -jar spigot.jar nogui`
    NOTE: If you don't have that much memory, then lower it (eg: `500M`).
4. After the Spigot server has been run the first time, folders and config files will be created. You will
    need to edit the `eula.txt` license file to append the following to work:
   ```
   eula=true
   ```
   You may optionally modify the `server.properties` and `ops.json`
5. Restart the Spigot server and your server should be ready.

## How to connect to Minecraft Server

1. Start your Minecraft game (one you purchased with an account).
2. Login with your account.
3. Ensure you start a client that match to the version of your server.
4. Start the game then go into "Multiplayers" playing mode. 
6. Your default local running Spigot server should appear in the list. 
   If you changed the server port, then you need to manually create a connection.

Once connected to the server, you may start playing normally.

Ref:
* https://www.spigotmc.org/wiki/buildtools
* https://www.spigotmc.org/wiki/spigot-installation/

## How to write your own Spigot Server plugins

1. Create a Java project, and add Spigot API jar as dependency
2. Write a plugin class that extends `org.bukkit.plugin.java.JavaPlugin` class
3. Build your project into a jar
4. Copy your project jar into Spigot server `plugins` folder

## What is Spigot? CraftBukkit? Bukkit? Vanilla? Forge?

(Source: https://www.spigotmc.org/wiki/what-is-spigot-craftbukkit-bukkit-vanilla-forg/)

Vanilla

The Vanilla software is the original, untouched, unmodified Minecraft server software created and distributed
directly by Mojang. Due to it's many bugs, laggy reports, and lack of configuration, Vanilla has been the subject to
much criticism. The advantage of Vanilla however, is that everything must be defined by command blocks giving the
owner of the server ultimate control over everything. This is a great example of what hard work and the imagination
can achieve. Vanilla can be found at https://minecraft.net/en-us/download/server

Bukkit

Bukkit is an API that allows programmers to make plugins for server software. API stands for Application Program
Interface and it is a set of subroutine definitions, protocols, and tools for building application software as
defined by Wikipedia. To get Bukkit just use the maven repository.

CraftBukkit

CraftBukkit is lightly modified version of the Vanilla software allowing it to be able to run Bukkit plugins.
CraftBukkit prides itself to be able to offer many configurable features that Vanilla simply doesn't have.
CraftBukkit is much more optimized than Vanilla sometimes making it less laggy. CraftBukkit is known for its ability
to run Bukkit plugins, fixing of certain Vanilla errors, bugs and exploits. To get CraftBukkit legally however
requires the SpigotMC BuildTools. (See https://www.spigotmc.org/wiki/buildtools/)

Spigot

Spigot is the most popular used Minecraft server software in the world. Spigot is a modified version of
CraftBukkit with hundreds of improvements and optimizations that can only make CraftBukkit shrink in shame.
To get Spigot legally however requires the SpigotMC BuildTools. (See https://www.spigotmc.org/wiki/buildtools/)

Forge

Forge is well known for being able to use Forge Mods which are direct modifications to the Minecraft program code.
In doing so, Forge Mods can change the gaming-feel drastically as a result of this. Sometimes, people are confused
by what the difference between Forge Mods and Bukkit Plugins are. Here is something confusing, they are both mods.
Forge Mods are direct modifications to the Minecraft program code while Bukkit Plugins are modifications that use
the already-coded Minecraft properties to perform certain functions. For this very reason, Forge Mods generally
require the Client to have to same Forge Mod as the Server. This is where Bukkit Plugins become advantageous,
they do not require client-side plugins (there are some exceptions however). Forge can be found
at https://files.minecraftforge.net/

## Additional Refs

* https://en.wikipedia.org/wiki/Minecraft
* https://www.tutorialspoint.com/yaml/yaml_basics.htm
* https://hub.spigotmc.org/javadocs/bukkit/

## Java Remote Debugging

Add the following to the java command options where you start Spigot MC server:

```
-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
```

Now you may use your IDE to attach a "Remote Debug" session to the server!
