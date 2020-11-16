import java.io.*;
import java.util.UUID;

public class WriteTextFile {
    public static void main(String[] args) throws Exception {
        String file = "temp/test.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                String line = UUID.randomUUID().toString();
                writer.write(line + "\n");
            }
        }
    }
}
