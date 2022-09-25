import java.io.*;
import java.net.*;
import java.util.Date;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(6013);

            // listening for connections
            while (true) {
                Socket client = socket.accept();
                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);

                // writing the data to the socket
                pout.println(new Date().toString());

                client.close();
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
