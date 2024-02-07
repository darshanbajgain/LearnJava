import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try {

            // 1. Create a socket and connect it to server Ip address and port
            Socket s = new Socket("localhost", 5000);

            // 2. getinput/output stream for client socket for send /recieve data.

            // getoutputstream
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            // getinputstream
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            // 3. Send data to the server using output stream.
            out.println("Hello Server, I am the client.");

            // 4. Read the response from the server using input stream.
            String serverResponse = in.readLine();
            System.out.println("Server says: " + serverResponse);

            // 5. Close the connection
            in.close();
            out.close();
            s.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}