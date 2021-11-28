package cms;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JApplet;
public class One extends JApplet
{
	String s="";
	public void init()
	{
		s+=" init method ";
		System.out.println("Init");
		setForeground(Color.yellow);
		setBackground(Color.red);
	}
	public void start()
	{
		System.out.println("start");
		s+=" start method ";
	}
	public void stop()
	{
		System.out.println("stop");
		s+=" stop method ";
	}
	public void destroy()
	{
		System.out.println("destroy");
		s+=" destroy method ";
	}
	public void paint(Graphics g)
	{
		System.out.println("paint");
		s+=" paint method ";
		g.drawString(s,100,100);
		g.drawRect(100,150,100,100);
		g.drawOval(100,150,100,100);
		g.fillOval(100,250,100,100);		
	}
    }                                                            


