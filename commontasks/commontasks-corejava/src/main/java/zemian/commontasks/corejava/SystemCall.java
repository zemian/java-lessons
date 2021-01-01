package zemian.commontasks.corejava;

import java.io.*;

public class SystemCall {
    public static void main(String[] args) throws Exception {
        String command = "ls -la";
        Process process = Runtime.getRuntime().exec(command);
        process.waitFor();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line=reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }
    }
}
