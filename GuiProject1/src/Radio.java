import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="Radio" width=300 height=450>
</applet>
*/

public class Radio extends JApplet implements ActionListener
{
    JTextField t1 = new JTextField(10);
    public void init()
    {
      setLayout(new FlowLayout());
      JRadioButton b1=new JRadioButton("Java Script");
      b1.addActionListener(this);
      add(b1);

      JRadioButton b2=new JRadioButton("VB Script");
      b2.addActionListener(this);
      add(b2);

      JRadioButton b3=new JRadioButton("DHTML");
      b3.addActionListener(this);
      add(b3);

      ButtonGroup bg = new ButtonGroup();
      bg.add(b1);
      bg.add(b2);
      bg.add(b3);

      add(t1);
    }
    public void actionPerformed(ActionEvent e)
    {
				t1.setText(e.getActionCommand());
    }
}



