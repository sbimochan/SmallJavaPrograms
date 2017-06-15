import java.io.*;
public class File_Read{
  public static void main(String args[]){
    try {
      File file= new File("nepal.txt");
      FileReader fr=new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String lime;
      while((lime=br.readLine())!=null){
        System.out.println(lime);
      }
    }catch(Exception e){
      System.out.println("error"+e);

    }
  }
  }
