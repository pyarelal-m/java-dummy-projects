package cms;

import java.applet.Applet;
import java.awt.*;
public class Demo3 extends Applet {
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		b1=new Button("Insert");
		b2=new Button("Create");
		b3=new Button("Drop");
		b4=new Button("Update");
		b5=new Button("Delete");
		setLayout(new GridLayout(3,2));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}
