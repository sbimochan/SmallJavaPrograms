import java.io.*;
import java.net.*;
public class NClient {
    public static void main(String args[]) {

        Socket client;
        try {
            System.out.println("Waiting to connect with server");
            client = new Socket("localhost", 1234);
            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1 = "", str2 = "";
            System.out.println("connected");
            while (!str1.equals("stop")) {
                str1 = br.readLine();
                dos.writeUTF(str1);
                //dos.flush();
                str2 = dis.readUTF();
                System.out.println("Server" + str2);
            }
            dos.close();
            client.close();
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}
