package cms;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Demo4 extends Frame {
	Button b1,b2,b3,b4,b5;
	public Demo4()
	{
		super("Demo Frame");
		b1=new Button("Insert");
		b2=new Button("Create");
		b3=new Button("Drop");
		b4=new Button("Update");
		b5=new Button("Delete");
		// for closing window frame
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
					dispose();
					System.exit(0);
			}
		});
		
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);
		add(b5,BorderLayout.CENTER);
		setSize(400,400);
		setVisible(true);
		// show();
	}
	public static void main(String args[])
	{
		Demo4 ob=new Demo4();
	}
}
