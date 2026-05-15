import java.io.*;
import java.net.*;

class EchoServer {

    public static void main(String args[]) {

        try {

            // Create Server Socket
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Server is waiting for client...");

            // Accept client connection
            Socket socket = server.accept();

            System.out.println("Client connected.");

            // Input and Output Streams
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            // Read message from client
            String msg = in.readLine();

            System.out.println("Client Message: " + msg);

            // Echo message back
            out.println("Echo from Server: " + msg);

            // Close connections
            socket.close();
            server.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}