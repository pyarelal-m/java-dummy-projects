import java.awt.*;
import javax.swing.*;

public class FrameWithPanel 
{
  private JFrame f;
  private JButton b,b1;
  private JTextField t;

  public FrameWithPanel(String title) {
    f = new JFrame(title);
	b=new JButton("Demo");
	b1=new JButton("Screen Demo");
	t=new JTextField(30);
	t.setEditable(false);	// disabling text componet for editing
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void launchFrame() {
	  f.setLayout(null);   // Layout null means no layout is applied
	 b.setBounds(10,20,100,40);   // place component JButton b at x axis =10 ,y axis =20 , width = 100 , height = 40
	 f.add(b);
    f.setSize(600,600);
    f.setBackground(Color.blue);
	// generating panel screen 
    JPanel pan = new JPanel();
	pan.setLayout(new FlowLayout());  // on panel u can apply layouts
	pan.add(b1);  // in panel u can add componetns
	pan.add(t);
    pan.setSize(300,300);
    pan.setBackground(Color.yellow);
	pan.setBounds(10,70,300,300);
    f.add(pan);
    f.setVisible(true);
  }

  public static void main(String args[]) {
    FrameWithPanel guiWindow =
        new FrameWithPanel("Frame with Panel");
    guiWindow.launchFrame();
  }
}
