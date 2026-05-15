import java.io.*;
import java.net.*;

class EchoClient {

    public static void main(String args[]) {

        try {

            // Connect to server
            Socket socket = new Socket("localhost", 5000);

            // Input from keyboard
            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));

            // Input and Output Streams
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // Send message
            System.out.print("Enter Message: ");

            String msg = userInput.readLine();

            out.println(msg);

            // Receive echoed message
            String response = in.readLine();

            System.out.println("Server Reply: " + response);

            // Close socket
            socket.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}