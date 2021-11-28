package cms;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Demo7  implements ActionListener{
	JFrame f;
	JButton b1,b2;
	JTextField t1;
	JLabel l1;
	public Demo7()
	{
		f=new JFrame("Demo Frame");
		b1=new JButton("Click");
		b2=new JButton("Demo");
		t1=new JTextField(30);
		l1=new JLabel("Click the button and see ");
			// for closing window frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		f.setLayout(new FlowLayout());
		f.add(l1);
		f.add(t1);
		f.add(b1);
		f.add(b2);
		f.setSize(400,400);
		f.setVisible(true);
		// show();
	}
	public static void main(String args[])
	{
		Demo7 ob=new Demo7();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1)
			{
				b1.setText("Button Clicked");
				t1.setText("Manjiri");
			}
		
	}
}
