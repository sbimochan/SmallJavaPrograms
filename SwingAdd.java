import javax.swing.*;
import java.awt.event.*;

public class SwingAdd extends JFrame{
	public SwingAdd(){
		JPanel jp = new JPanel();
		JLabel j1 = new JLabel("Enter first number");
		JLabel j2 = new JLabel("Enter second");
		JTextField first = new JTextField(20);
		JTextField second = new JTextField(20);
		JLabel jr = new JLabel("result");
		JTextField  result = new JTextField(20);
		JButton add = new JButton("Add 'em");
		


		jp.add(j1);
		jp.add(first);
		jp.add(j2);
		jp.add(second);
		jp.add(add);
		jp.add(jr);
		jp.add(result);
		result.setEditable(false);
		add(jp);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
					int num1 = Integer.parseInt(first.getText());
					int num2 = Integer.parseInt(second.getText());
					int result2 = num1 + num2;
					result.setText(String.valueOf(result2));
				}
				catch(Exception e){
					System.out.println("error"+e);
				}
			}
		});

	}
	public static void main(String[] args) {
		new SwingAdd();
	}
}