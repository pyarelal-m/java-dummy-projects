//  applet       checkbox      date 3/8/00


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
/*<applet code=checkbox width=50 height=50></applet>*/

public class checkbox extends JFrame implements ItemListener
{
 JCheckBox  b,b1,b2;
 JTextField t1;
 public checkbox()
  {
	 setLayout(new FlowLayout());
    b=new JCheckBox("SQLStar");
    b1=new JCheckBox("Aptech");
	b2=new JCheckBox("NIIT");
    t1=new JTextField(20);

   add(b);													//method to add in applet.
   add(b1);
   add(b2);
   add(t1);
   b.addItemListener(this);                  //to set entire class path
   b1.addItemListener(this);
   b2.addItemListener(this);
   t1.requestFocus();  // blink or focus cursor at textfield t1
   setSize(400,400);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
public void itemStateChanged(ItemEvent e) //parameter
 {
   
		  if (e.getSource()==b)
			{
                                if(e.getStateChange()==e.SELECTED)
                                {
                                    t1.setText (b.getText());
                                }
							if(e.getStateChange()==e.DESELECTED)
                                {
     										t1.setText ("");
                              }							
                                
		    }
		  else if (e.getSource()==b1)
			{
                            if(e.getStateChange()==e.SELECTED)
                                {
     										t1.setText (b1.getText());
                              }
							if(e.getStateChange()==e.DESELECTED)
                                {
     										t1.setText ("");
                              }							
             }
		  else if (e.getSource()==b2)
			{
                               if(e.getStateChange()==e.SELECTED)
                               {
									t1.setText (b2.getText());
                              }
							if(e.getStateChange()==e.DESELECTED)
                                {
     										t1.setText ("");
                              }							
		    }

//
 }
 public static void main(String args[])
	{
		checkbox ob=new checkbox();
 }
}


/* now create html file as belo & save as checkbox.html
<html>
<body bgcolor=black>
<applet code=checkbox width=605 height=275>
</applet>
</body>
</html>
then u can see in IE.  otherwise in dos type appletviwer checkbox.java
then u can see in appletviewer
if u want to accept all three values, make conct using String
*/
