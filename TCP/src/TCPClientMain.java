import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TCPClientMain {
    public static void main(String[] args) throws IOException {
        //input message
        String message = "";
        while(true) {
            Scanner scanner = new Scanner(System.in);
            message = scanner.nextLine();

            //make socket
            Socket socket = new Socket("localhost",1019);

            //make writer
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            //write
            writer.println(message);

            if (message.equals("bye")) {
                break;
            }
        }
    }
}
