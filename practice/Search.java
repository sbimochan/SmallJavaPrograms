import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class Search extends JFrame{
	public Search(){
		JPanel jp = new JPanel();
		JTextField txt = new JTextField(20);
		JButton btn = new JButton("GO");

		jp.add(txt);
		jp.add(btn);

		btn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						Class.forName("com.mysql.jdbc.Driver");
						String path = ("jdbc:mysql://localhost:3306/hcoe");
						Connection con = DriverManager.getConnection(path, "root", "");

						PreparedStatement pstmt;	//select query
						ResultSet rs;				//matches query

						pstmt = con.prepareStatement("select * From `insert` where `Username`=? ");
						pstmt.setString(1, txt.getText());	//sets up parameter
						rs = pstmt.executeQuery();

						if(rs.next()){
							String a;
							a = rs.getString("Username") + "    " + rs.getString("Firstname") + "     " + rs.getString("Lastname"); 
							JOptionPane.showMessageDialog(null, a);
						}
						else{
							JOptionPane.showMessageDialog(null, "Value not found");
						}

					}
					catch(Exception e){
						System.out.println(e);
					}
				}
			}
		);
		add(jp);

		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		new Search();
	}
}