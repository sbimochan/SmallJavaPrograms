
import java.io.*;
import java.util.Scanner;

public class Cont_Write {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
      Scanner input=new Scanner(System.in);
//        System.out.println("Enter a word");
//        String line=input.next();
        File file = new File("note.txt");
        FileWriter fw=new FileWriter(file,true);
        System.out.println("Enter any sentence");
        String line=" "+input.nextLine();

        fw.write(line);
        fw.close();
            System.out.println("Writing completed");
        }
        catch(Exception e){
            System.out.println("error "+e);
        }
    }
    }
