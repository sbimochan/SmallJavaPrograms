import javax.swing.*;
import java.awt.*;

public class Bio extends JFrame{
  public Bio(){
    JPanel jp = new JPanel();
    JButton jb = new JButton();
    jp.add(jp);
    jp.add(jb);
    add(jp);
    setVisible(true);
    setSize(300,400);
    setTitle("filter by ktm");
  }
  public static void main(String[] args) {
    new Bio();
  }
}
// Error is this:
// Bio.java:4: error: invalid method declaration; return type required
