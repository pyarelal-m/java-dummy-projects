package cms;

import java.applet.Applet;
import java.awt.*;
public class Demo2 extends Applet {
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		b1=new Button("Insert");
		b2=new Button("Create");
		b3=new Button("Drop");
		b4=new Button("Update");
		b5=new Button("Delete");
		setLayout(new BorderLayout());
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);
		add(b5,BorderLayout.CENTER);
	}
	
}

