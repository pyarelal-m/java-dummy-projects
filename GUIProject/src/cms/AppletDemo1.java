package cms;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletDemo1 extends Applet {
	String s="";
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.yellow);
		s+="init ";
	}
	public void start()
	{
		s+="start ";
	}
	public void stop()
	{
		s+="stop ";
	}
	public void destroy()
	{
		s+="destroy ";
	}
	public void paint(Graphics g)
	{
		g.drawString(s, 100, 100);
		g.drawRect(100, 150, 100, 150);
		g.drawOval(100, 150, 100, 150);
	}
}

/*
<applet code="AppletDemo1.class" height=300 width=400 >
</applet>

*/