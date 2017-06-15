import java.awt.BorderLayout;
import javax.swing.*;

public class Border extends JFrame{
	JButton left,right,up,down,center;
	public Border(){
		setLayout(new BorderLayout());
		left = new JButton("LEFT");
		right = new JButton("RIGHT");
		up = new JButton("UP");
		down = new JButton("DOWN");
		center = new JButton("CENTER");
		add(left,BorderLayout.WEST);
		add(right,BorderLayout.EAST);
		add(up,BorderLayout.NORTH);
		add(down,BorderLayout.SOUTH);
		add(center,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new Border();
	}
}