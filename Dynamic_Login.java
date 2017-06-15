import javax.swing.*;
import java.awt.*; //abstract window key
import java.awt.event.*; //click haru ko lagi
import java.sql.*;
public class Dynamic_Login extends JFrame{
  public Dynamic_Login() {  //class ko name ra method ko name same so it is called constructor
    //swing frameword should be done in constructor
    JPanel jp=new JPanel();
    JLabel j1=new JLabel("Username");
    JLabel j11=new JLabel("Password");
    final JTextField un=new JTextField(20);
    final JPasswordField psw=new JPasswordField(20);
    JButton log = new JButton("Login");
      log.addActionListener(new ActionListener(){  //JButton login ko
        public void actionPerformed(ActionEvent ae){  //ae is object
          try{
            Class.forName("com.mysql.jdbc.Driver"); //loads the driver
            Connection con; //connects java to mysql
            Statement stmt; //insert query exectute
            PreparedStatement pstmt; //select query
            ResultSet rs; //matches the query to db
            String str=("jdbc:mysql://localhost:3306/javaclass"); //put in lib/ext
            con=DriverManager.getConnection(str,"root",""); // str sanga connection garne
            //stmt=con.createStatement();
            //JOptionPane.showMessageDialog(null,"Connected");
            pstmt=con.prepareStatement("select * from `login` where `Username`='"+un.getText()+"' and `Password`='"+psw.getText()+"'");
            // pstmt.setString(1,un.getText());
            // pstmt.setString(2,psw.getText());
            rs=pstmt.executeQuery();
            if(rs.next())
            {
              JOptionPane.showMessageDialog(null,"Login successful");
            }
            else{
              JOptionPane.showMessageDialog(null,"Invalid");
            }
            }
          catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e);
          }
        }
      });

    JButton can=new JButton("Reset");
      can.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
          un.setText("");
          psw.setText("");
        }
      });
    jp.add(j1);
    jp.add(un);
    jp.add(j11);
    jp.add(psw);
    jp.add(log);
    jp.add(can);
    add(jp);     //yo add ra mathi ko add are different
    //kunai panig object baata call vayeko chaina so JFrame ko add ho.
    setVisible(true);   //method of JFrame because siddhai calling.
    setSize(300,300);
    setTitle("Login Page");
    setDefaultCloseOperation(EXIT_ON_CLOSE); //without object close vaako cha vaney extends JFrame ko class ho

  }
  public static void main(String[] args) {
    new Dynamic_Login(); //constructor call garna lai object banauna pardaina.
  }
}
//value maa single quote. column name maa side quot
