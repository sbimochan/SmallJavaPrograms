import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Register extends JFrame{
   public Register(){
    JPanel jp = new JPanel();
    JLabel j1 = new JLabel("Firstname");
    JLabel j2 = new JLabel("Lastname");
    JLabel j3 = new JLabel("Username");
    JLabel j4 = new JLabel("Password");
    JLabel j5 = new JLabel("Confirm Password");
    JTextField fn = new JTextField(20);
    JTextField ln = new JTextField(20);
    JTextField un = new JTextField(20);
    JPasswordField pw = new JPasswordField(20);
    JPasswordField cpw = new JPasswordField(20);
    JButton log = new JButton("Login");
    JButton res = new JButton("Reset");

    jp.add(j1);
    jp.add(fn);
    jp.add(j2);
    jp.add(ln);
    jp.add(j3);
    jp.add(un);
    jp.add(j4);
    jp.add(pw);
    jp.add(j5);
    jp.add(cpw);
    log.addActionListener(
    new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        try{
          String fname,lname,uname,pass,cpass;
          fname=fn.getText();
          lname=ln.getText();
          uname=un.getText();
          pass =pw.getText();
          cpass=cpw.getText();
          Connection con;
          Class.forName("com.mysql.jdbc.Driver");
          String path = ("jdbc:mysql://localhost:3306/javaclass");
          Statement stmt;
          con=DriverManager.getConnection(path,"root","");
          stmt=con.createStatement();
          if(pass.equals(cpass)){
            stmt.executeUpdate("insert into register(firstname,lastname,username,password)values('"+fname+"','"+lname+"','"+uname+"','"+pass+"')");
            JOptionPane.showMessageDialog(null,"inserted");
          }else{
            JOptionPane.showMessageDialog(null,"insert password again");
          }
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,"error"+e);
        }
        
      }
    }
    );
    res.addActionListener(
        new ActionListener(){
          public void actionPerformed(ActionEvent ae){
            un.setText("");
            pw.setText("");
            fn.setText("");
            ln.setText("");
            cpw.setText("");
          }
    }
    );

    jp.add(log);
    jp.add(res);

    add(jp);
    setVisible(true);
    setSize(300,350);
    setTitle("Signup page");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
    new Register();
  }
}
