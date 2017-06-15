import java.awt.event.*;
import javax.swing.*;
public class EventListenerexample extends JFrame implements ActionListener {
public EventListenerexample(){
JButton btn = new JButton("Click Me");
add(btn);
btn.addActionListener(this); //registering the event handler
setSize(100, 100);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "Hello");
}
public static void main(String[] args) {
new EventListenerexample();
}
}