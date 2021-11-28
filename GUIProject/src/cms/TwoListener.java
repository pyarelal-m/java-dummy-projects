import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoListener 
implements MouseMotionListener,MouseListener //7
{
  private JFrame f;
  private JTextField tf,t;
  private JLabel label; 

  public TwoListener() {
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
    t.addMouseMotionListener(this);
    t.addMouseListener(this);
    // Size the frame and make it visible
    f.setSize(300, 200);
    f.setVisible(true);
  }

  // These are MouseMotionListener events
  public void mouseDragged(MouseEvent e) {
    String s =  "Mouse dragging:  X = " + e.getX()+ " Y = " + e.getY();
    tf.setText(s);
	 t.setBackground(Color.pink);
  }

    // Unused MouseMotionListener method.
  // All methods of a listener Interface must be implemented in 
  //the class even if they are not used.
  public void mouseMoved(MouseEvent e) { 
    String s =  "Mouse Moving:  X = " + e.getX()+ " Y = " + e.getY();
    tf.setText(s);
     t.setBackground(Color.yellow);
  }
  // These are MouseListener events
  public void mouseEntered(MouseEvent e) {
    String s = "The mouse entered";
    tf.setText(s);
	 t.setBackground(Color.blue);
  }

  public void mouseExited(MouseEvent e) {
    String s = "The mouse has left the building";
    tf.setText(s);
	 t.setBackground(Color.red);
  }


  // Unused MouseListener methods.
  public void mousePressed(MouseEvent e) {
	     String s =  "Mouse Pressed at :  X = " + e.getX()+ " Y = " + e.getY();
		    tf.setText(s);
		  t.setBackground(Color.green);
  }
  public void mouseClicked(MouseEvent e) { 
	    String s =  "Mouse clicked:  X = " + e.getX()+ " Y = " + e.getY();
	    tf.setText(s);
	   t.setBackground(Color.cyan);
  }
  public void mouseReleased(MouseEvent e) { 
     String s =  "Mouse Released at  X = " + e.getX()+ " Y = " + e.getY();
	 tf.setText(s);
	 t.setBackground(Color.magenta);
  }

  public static void main(String args[]) 
  {
    TwoListener two = new TwoListener();
    two.launchFrame();
  }
}










//	label.setBackground(Color.red);