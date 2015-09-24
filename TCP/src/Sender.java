import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-21.
 */
public class Sender extends Thread {
    Socket socket;
    DataOutputStream out;

    Sender(Socket socket) throws IOException {
        this.socket = socket;
        //make DataOutputStream
        out = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        //input message
        Scanner scanner = new Scanner(System.in);
        while(out != null) {
            String message = scanner.nextLine();

            //writeUTF(message)
            try {
                out.writeUTF(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
