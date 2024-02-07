import java.io.*;
import java.net.*;
/*
 * URLConnection class is a part of java.net package.
 * URLConnection class represents the communication between our program and outside world using URLs.
 * It helps to fetch data from internet or other local resources using URLs.
 * URLConnection is a abstract class, we can't create instance of this class directly.
 * We use openConnection() on a URL object.
 * 
 *      URL url = new URL( " https//:example.com " );
 *      URLConnection con = url.openConnection();
 * 
 * URLConnection class is protocol independent, it can be used with various protocols like
 * HTTPS, HTTP, FTP etc. There is HttpURLConnection class, subclass of URLConnection specially 
 * tailored for HTTP Connections.
 */

public class URLConnectionExample {

    public static void main(String[] args) {
        try {

            // Create a URL object for the website you want to fetch data from
            URL url = new URL("https://darshanbajgain.github.io");

            // Open a connection to the URL
            URLConnection con = url.openConnection();

            // Create a BufferedReader to read data from the connection
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            // Read and print each line of data from the connection
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //close reader
            reader.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
