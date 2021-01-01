package zemian.commontasks.corejava;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReadLines {
    public static void main( String[] args ) throws Exception {
        String file = "readme.md";
        if (args.length > 0)
            file = args[0];
        List<String> lines = Files.readAllLines(Path.of(file));
        for (String s : lines) {
            System.out.println(s);
        }
    }
}
