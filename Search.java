import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Search extends JFrame{
  public Search(){
    JPanel jp = new JPanel();
    JLabel j1 = new JLabel("Search");
    JTextField jtext = new JTextField();
    JButton  go = new JButton();
    jp.add(jp);
    jp.add(j1);
    jp.add(jtext);
    jp.add(go);
    add(jp);
    setVisible(true);
    setSize(300,350);
    setTitle("Search page");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
    new Search();
  }
}
