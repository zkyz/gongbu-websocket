import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-13.
 */
public class WebSocket {
    public static void main(String... args) throws Exception {
        ServerSocket server = new ServerSocket(5959);

        while (true) {
            Socket client = server.accept();

            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());


        }
    }
}
