import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {

            //1. Create instance of ServerSocket and  bind it with the port address
            ServerSocket ss = new ServerSocket(5000);

            //2. Listen for connection from client and accept it
            Socket s = ss.accept();

            //3. getInput/Output stream of the socket.
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);


            //4. Read data from client using inputstream 
            String clientMessage = in.readLine();
            System.out.println("Client says "+ clientMessage);

            //5. Send response back to client
            out.println("Hey Client, I am server.");
            
            //6. close the connection;
            in.close();
            out.close();
            s.close();
            ss.close();

            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
