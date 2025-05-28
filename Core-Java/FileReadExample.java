// File: FileReadExample.java
import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            System.out.println("Contents of output.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Could not read the file: " + e.getMessage());
        }
    }
}
