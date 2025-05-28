// File: ChatClient.java
import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (true) {
            System.out.print("Client: ");
            writer.println(console.readLine());
            System.out.println("Server: " + reader.readLine());
        }
    }
}
