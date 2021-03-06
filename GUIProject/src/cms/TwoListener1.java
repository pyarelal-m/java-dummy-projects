import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoListener1 
{
  private JFrame f;
  private JTextField tf,t;
  private JLabel label; 

  public TwoListener1() {
    f = new JFrame("Two listeners example");
	t= new JTextField(30);
    tf = new JTextField(30);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }

  public void launchFrame() {
	
	label = new JLabel("Click and drag the mouse");
	  t.setBackground(Color.orange);
    // Add components to the frame
    f.add(label, BorderLayout.NORTH);
	f.add(t,BorderLayout.CENTER);
    f.add(tf, BorderLayout.SOUTH);
    // Add this object as a listener
    t.addMouseMotionListener(
    		new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					String s =  "Mouse dragging:  X = " + e.getX()+ " Y = " + e.getY();
				    tf.setText(s);
					 t.setBackground(Color.pink);
					
				}
			}
    		);
    Inner ob=new Inner();
    t.addMouseListener(ob);
    // Size the frame and make it visible
    f.setSize(300, 200);
    f.setVisible(true);
  }
 
  class Inner extends MouseAdapter
  {
	  @Override
	  	public void mouseClicked(MouseEvent e) { 
	  		String s =  "Mouse clicked:  X = " + e.getX()+ " Y = " + e.getY();
	  		tf.setText(s);
	  		t.setBackground(Color.cyan);
	  	}
  }
  
  public static void main(String args[]) 
  {
    TwoListener1 two = new TwoListener1();
    two.launchFrame();
  }
}










//	label.setBackground(Color.red);