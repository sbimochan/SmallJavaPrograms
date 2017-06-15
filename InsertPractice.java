import java.util.*;
import java.sql.*;

class InsertPractice{
  public static void main(String args[]){
    System.out.println("enter text");
    Scanner scan= new Scanner(System.in);
    String line = scan.nextLine();
    try{
      Connection con;
      Statement stmt;
      Class.forName("com.mysql.jdbc.Driver");
      String path="jdbc:mysql://localhost:3306/javaclass";
      con=DriverManager.getConnection(path,"root","");
      stmt=con.createStatement();
      stmt.executeUpdate("insert into `inserttable` (name)values('"+line+"')");
    }catch(Exception e){
      System.out.println("ERRORRRRR:"+e);
    }
  }
}
