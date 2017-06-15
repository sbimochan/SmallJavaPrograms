import java.io.*;
public class File_Write{
 public static void main(String args[]){
   try{
     File file = new File("hcoe.txt");
     FileWriter fw=new FileWriter(file);
     String line = "Hello HCOE fjkdlsajkl";
     fw.write(line);
     fw.close();
     System.out.println("writing complete");
   }
   catch(Exception e)
   {
     System.out.println("Error"+e);
   }
 }
}
