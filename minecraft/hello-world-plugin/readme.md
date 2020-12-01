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

## What is Spigot? CraftBukkit? Bukkit? Vanilla? Forge?

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
* https://www.spigotmc.org/wiki/what-is-spigot-craftbukkit-bukkit-vanilla-forg/

## Java Remote Debugging

Add the following to the java command options where you startup Spigot MC server:

```
-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
```

Now you may use your IDE to attach a "Remote Debug" session to the server!
