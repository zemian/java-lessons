Use Java Scripting feature (Groovy) to dynamically load MC plugin for faster development process.

This should allow simple modification without reloading the server. But scripting impact performance
greatly so it should be used with care.

## Setup

1. Build the uber jar in this project into Spigot MC server plugins folder.
2. Enter MC command `groovy /path/to/mc.groovy` to execute it.

If you omit `/path/to/mc.groovy` it defaults to `$HOME/mc.groovy`.
