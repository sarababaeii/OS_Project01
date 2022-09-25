import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            // connecting to the server socket
            Socket socket = new Socket("127.0.0.1", 6013);
            InputStream inputStream = socket.getInputStream();
            BufferedReader bin = new BufferedReader(new InputStreamReader(inputStream));

            // reading the data from the socket
            String line;
            while ((line = bin.readLine()) != null) {
                System.out.println(line);
            }

            socket.close();
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
