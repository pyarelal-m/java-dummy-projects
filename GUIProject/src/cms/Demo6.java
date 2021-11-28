package cms;
import java.awt.*;
import javax.swing.*;
public class Demo6  {
	JFrame f;
	JButton b1;
	JTextField t1;
	JLabel l1;
	public Demo6()
	{
		f=new JFrame("Demo Frame");
		b1=new JButton("Click");
		t1=new JTextField(30);
		l1=new JLabel("Click the button and see ");
			// for closing window frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.add(l1);
		f.add(t1);
		f.add(b1);
		f.setSize(400,400);
		f.setVisible(true);
		// show();
	}
	public static void main(String args[])
	{
		Demo6 ob=new Demo6();
	}
}
