import java.io.*;
import java.net.*;
public class NServer {
    public static void main(String args[]) {
        ServerSocket server;
        Socket client;
        try {
            System.out.println("Waiting to connect with client");
            server = new ServerSocket(1234);
            client = server.accept();
            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1 = "", str2 = "";
            System.out.println("connected");
            while (!str1.equals("stop")) {
                str1 = br.readLine();
                dos.writeUTF(str1);
                dos.flush();
                str2 = dis.readUTF();
                System.out.println("Client:" + str2);
            }
            dos.close();
            client.close();

        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}
