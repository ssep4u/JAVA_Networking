import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-10.
 */
public class UDPClientMain {
    public static void main(String[] args) throws IOException {
        String message = "";
        while(true) {
            //input message
            System.out.println("보낼 메시지> ");
            Scanner scanner = new Scanner(System.in);
            message = scanner.nextLine();

            //make packet
            DatagramPacket dp = new DatagramPacket(
                    message.getBytes(),
                    message.getBytes().length,
                    InetAddress.getByName("localhost"),
                    1226);

            //make socket
            DatagramSocket ds = new DatagramSocket();

            //send
            ds.send(dp);

            if(message.equals("bye")) {
                break;
            }
        }
    }
}













