import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;


public class Javabio extends JFrame{
	Connection con;
	public Javabio(){
		JPanel jp = new JPanel();
		
		JLabel jname = new JLabel("name");
		JTextField tname = new JTextField(30);
		JLabel jphone = new JLabel("phone");
		JTextField tphone = new JTextField(30);
		JButton insert = new JButton("insert");
		JButton display = new JButton("display");
		JLabel j1 = new JLabel("id to delete");
		JTextField j2 =  new JTextField(2);
		JButton delete = new JButton("delete");
		jp.add(jname);
		jp.add(tname);
		jp.add(jphone);
		jp.add(tphone);
		jp.add(insert);
		jp.add(display);

		jp.add(j1);
		jp.add(j2);
		jp.add(delete);

		add(jp);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//jdbc
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			String path="jdbc:mysql://localhost:3306/javabio";
			con = DriverManager.getConnection(path,"root","");

		}catch(Exception e){
			System.out.print(e);
		}
		insert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
					

					System.out.println("Connected database successfully...");
					//step 3 execute query
					System.out.println("Inserting records into the table...");
					Statement stmt;
					stmt = con.createStatement();
					String insert ="insert into `tbl_bio` (name,phone)values('"+tname.getText()+"','"+tphone.getText()+"')";
					stmt.executeUpdate(insert);
					
					JOptionPane.showMessageDialog(null,"Data inserted");

				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		display.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
					

					System.out.println("Connected database successfully...");
					//step 3 execute query
					System.out.println("diplaying records from the table...");
					 String read ="select * from `tbl_bio`";
					 Statement stmt;
					 stmt = con.createStatement();
					 	stmt.executeQuery(read);

					 	//step 4 extract data
					ResultSet rs = stmt.executeQuery(read);

					
					while(rs.next()){
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String phone = rs.getString("phone");

						//displaying result
						System.out.println("id:"+id);
						System.out.println("name:"+name);
						System.out.println("phone"+phone);
					}
					

				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
					
					Statement stmt;
					stmt= con.createStatement();
					String delete="Delete from `tbl_bio` where id="+j2.getText()+"";
					stmt.executeUpdate(delete);
					System.out.println("tuple deleted of id:"+j2.getText());
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		});
	}
	public static void main(String[] args) {
		new Javabio();
	}
}