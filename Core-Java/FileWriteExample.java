// File: FileWriteExample.java
import java.io.*;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(input);
            System.out.println("Data has been written to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
