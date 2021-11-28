package cms;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Demo5  {
	Frame f;
	Button b1,b2;
	public Demo5()
	{
		f=new Frame("Demo Frame");
		b1=new Button("Insert");
		b2=new Button("Create");
			// for closing window frame
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
					f.dispose();
					System.exit(0);
			}
		});
		
		f.add(b1,BorderLayout.EAST);
		f.add(b2,BorderLayout.WEST);
		
		f.setSize(400,400);
		f.setVisible(true);
		// show();
	}
	public static void main(String args[])
	{
		Demo5 ob=new Demo5();
	}
}
