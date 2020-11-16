import java.io.*;


public class ReadTextFile {
    public static void main(String[] args) throws Exception {
        String file = "basic/Hello.java";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
