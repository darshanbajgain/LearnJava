# Client Side

1. Create a Socket, connect it to the server's IP address and port.

    ```java
    Socket s = new Socket("localhost", 5000);
    ```
    - Here we used localhost as we are using in same system.

2. Create input/output stream for the client side socket;

    - get output stream to send a data to server;

    ```java
    PrintWriter out = new PrintWriter(s.getOutputStream(),true);
    ```

    - get input stream to receive data back from server.

    ```java
    BufferedReader in = new BufferedReader ( new InputStreamReader(s.getInputStream()) ); 
    
    ```

3. Send data to the server using outputstream.

   ```java 
   out.println("Hello Server!!!, I am client"); 
   ```

4. Read data from the server using inputstream,

    ```java
    String serverResponse = in.readLine(); System.out.println("Server says: " + serverResponse);
    ```

5. Close connection;
   ```java
    in.close();
    out.close();
    s.close();
  
    ```



------------------------------------------------------------

# Server Side


1. Create a ServerSocket instance & bind it to a specific port number.

    ```java
    ServerSocket ss = new ServerSocket(5000);
    ```

    - Waiting for connections from clients.

    ```java
    System.out.println("Waiting for connection...");
    ```

2. Listen for connections from the client, accept it, and establish a connection.

    ```java
    Socket s = ss.accept();
    ```

3. Create input/output stream of the socket to send/receive data.

    - Get input stream to receive data.

    ```java
    BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
    ```

    - Get output stream to send data.

    ```java
    PrintWriter out = new PrintWriter(s.getOutputStream(), true);
    ```

4. Read data sent by the client and send a response back to the client.

    - Read data from the client.

    ```java
    String clientMessage = in.readLine();
    System.out.println("Client says: " + clientMessage);
    ```

    - Send a response back to the client.

    ```java
    out.println("Hello, Client!");
    ```

5. Close connection.

    ```java
    in.close();
    out.close();
    s.close();
    ss.close();
    ```

This README.md file outlines the steps involved in the server-side code for establishing a socket connection, sending and receiving data to/from the client, and closing the connections.
