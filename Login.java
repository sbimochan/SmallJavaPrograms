import javax.swing.*;
import java.awt.*; //abstract window key
import java.awt.event.*; //click haru ko lagi
public class Login extends JFrame{
  public Login() {  //class ko name ra method ko name same so it is called constructor
    //swing frameword should be done in constructor
    JPanel jp=new JPanel();
    JLabel j1=new JLabel("Username");
    JLabel j11=new JLabel("Password");
    final JTextField un=new JTextField(20);
    final JPasswordField psw=new JPasswordField(20);
    JButton log = new JButton("Login");
      log.addActionListener(new ActionListener(){  //JButton login ko
        public void actionPerformed(ActionEvent ae){  //ae is object
            String user,pass;
            user=un.getText();
            pass=psw.getText();
            if(user.equals("admin")&& pass.equals("admin")){
              JOptionPane.showMessageDialog(null,"Login Successful");
            }else{
              JOptionPane.showMessageDialog(null,"Invalid Login");
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
    new Login(); //constructor call garna lai object banauna pardaina.
  }
}
