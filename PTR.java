import javax.swing.*;
import java.awt.event.*;

public class PTR extends JFrame
{
	JLabel jpri,jtime,jrate;
	JTextField tpri,ttime,trate;
	public PTR(){
		JPanel jp = new JPanel();
		jpri = new JLabel("Principle");
		jtime = new JLabel("Time");
		jrate = new JLabel("Rate");
		tpri = new JTextField(10);
		ttime = new JTextField(10);
		trate = new JTextField(10);
		JButton calculate = new JButton("calculate");
		JLabel interest = new JLabel("Simple Interest");
		JTextField tfinterest = new JTextField(10);

		
		jp.add(jpri);
		jp.add(tpri);
		jp.add(jtime);
		jp.add(ttime);
		jp.add(jrate);
		jp.add(trate);
		jp.add(calculate);
		jp.add(interest);
		jp.add(tfinterest);
		add(jp);
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		tfinterest.setEditable(false);
		calculate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
					double principle = Double.parseDouble(tpri.getText());
					double time = Double.parseDouble(ttime.getText());
					double rate = Double.parseDouble(trate.getText());
					double interest = (principle*time*rate)/100;
					tfinterest.setText(String.valueOf(interest));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});


	}
	public static void main(String[] args) {
		new PTR();
	}
}