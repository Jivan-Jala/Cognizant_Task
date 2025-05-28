// File: ChatServer.java
import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = reader.readLine()) != null) {
            System.out.println("Client: " + input);
            System.out.print("Server: ");
            writer.println(console.readLine());
        }

        clientSocket.close();
        serverSocket.close();
    }
}
