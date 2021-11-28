package cms2;

import java.awt.*;
import javax.swing.*;

 public class BoxLayoutDemo 
{
 private JFrame f;
 private JButton b1, b2, b3, b4, b5;

 public BoxLayoutDemo() 
 {
 f = new JFrame("BoxLayout Example");
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 b1 = new JButton("Button 1");
 b2 = new JButton("Button 2");
 b3 = new JButton("Button 3");
 b4 = new JButton("Button 4");
 b5 = new JButton("Button 5"); 
 }
public void launchFrame() 
 {	
//	f.setLayout(new BoxLayout(f.getContentPane(),BoxLayout.X_AXIS));//Y_AXIS,
f.setLayout(new BoxLayout(f.getContentPane(),BoxLayout.Y_AXIS));//Y_AXIS,
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.pack();
	//f.setSize(400,400);
	f.setVisible(true);
 }	
 public static void main(String args[]) 
  {
//	 BoxLayoutDemo b = new BoxLayoutDemo();
//	b.launchFrame();
		javax.swing.SwingUtilities.invokeLater(
				new Runnable() 
				{
				//Schedule for the event-dispatching thread:
				//creating,showing this app's GUI.
					public void run() 
						{
								 BoxLayoutDemo b = new BoxLayoutDemo();
								b.launchFrame();
						}
				}		);
  }
}













/*
b1.setAlignmentX(Component.CENTER_ALIGNMENT);
b2.setAlignmentX(Component.CENTER_ALIGNMENT);
b3.setAlignmentX(Component.CENTER_ALIGNMENT);
b4.setAlignmentX(Component.CENTER_ALIGNMENT);
b5.setAlignmentX(Component.CENTER_ALIGNMENT);
*/