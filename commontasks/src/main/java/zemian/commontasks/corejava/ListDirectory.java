package zemian.commontasks.corejava;

import java.io.*;
public class ListDirectory {
    public static void main(String[] args) {
        File dir = new File("commontasks");
        for (final File file : dir.listFiles()) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file);
            } else {
                System.out.println("File: " + file);
            }
        }
    }
}
