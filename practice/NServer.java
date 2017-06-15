import java.io.*;
import java.net.*;

public class NServer{
  ServerSocket server;
  Socket client;
    try{
      System.out.println("waiting");
      server = new Socket("127.0.0.1",6969);
      client = server.accept();
      DataInputStream dis = new DataInputStream(client.getInputStream());
      DataOutputStream dos = new DataOutputStream(client.getOutputStream());
      BufferedReader br = new BufferedReader(System.in);
      String str1="", str2="";
      while(!str1.equals("stop")){
        str1 = br.readLine();
        dos.writeUTF(str1);
        dos.flush();
        str2=dis.writeLine();
        Syste.out.println("client:"+str2);
      }
      dos.close();
      client.close();
    }catch(Exception e){
      System.out.println("error:"+e);
    }

}
