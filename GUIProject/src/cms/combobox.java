package cms;

cmscmscms//Apple  combobox      date 3/8/00


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
/*<applet code=combobox width=50 height=50></applet>*/

public class combobox extends JFrame implements ItemListener
{
 JComboBox c;
 JTextField t;
 public combobox()
  {
    c=new JComboBox();
	t=new JTextField();
    c.addItem("RED");
    c.addItem("YELLOW");
    c.addItem("BLUE");
    c.addItem("GREEN");
   add(c,BorderLayout.NORTH);
   add(t,BorderLayout.CENTER);
   c.addItemListener(this);
   setSize(400,400);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

public void itemStateChanged(ItemEvent e) //parameter
 {
	 if(e.getSource()==c)
	 {
//	 c.getSelectedIndex()==0)
 if (c.getSelectedItem()=="RED")
  {
  t.setBackground (Color.red);
		t.setText((String)c.getSelectedItem());
  }
else  if (c.getSelectedItem()=="YELLOW")
  {
  t.setBackground (Color.yellow);
  		t.setText((String)c.getSelectedItem());
  }
else if (c.getSelectedItem()=="BLUE")
  {
  t.setBackground (Color.blue);
  		t.setText((String)c.getSelectedItem());
  }
 else if (c.getSelectedItem()=="GREEN")
    {
	t.setBackground (Color.green);
			t.setText((String)c.getSelectedItem());
	}

	 }
  }
  public static void main(String args[])
	{
		combobox ob=new combobox();
  }
}

/* now create html file as belo & save as actionbutton.html
<html><body bgcolor=black>
<applet code=combobox width=605 height=275>
</applet></body>
</html>
then u can see in IE.  otherwise in dos type appletviwer combobox.java
then u can see in appletviewer   */