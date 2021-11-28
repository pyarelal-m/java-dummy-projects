package cms2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo implements ItemListener {
    JPanel cards; //a panel that uses CardLayout
    final static String BUTTONPANEL = "Card with JButtons";
    final static String TEXTPANEL = "Card with JTextField";
    
   
    private  void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CardLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
	   JPanel comboBoxPane = new JPanel(); //use FlowLayout
		comboBoxPane.setLayout(new FlowLayout());

		String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
        
        //Create the "cards".
        JPanel card1 = new JPanel();
		card1.setLayout(new GridLayout(2,2));
        card1.add(new JButton("Button 1"));
        card1.add(new JButton("Button 2"));
        card1.add(new JButton("Button 3"));
        

        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));
        
        //Create the panel that contains the "cards".  
		// Pane is having cardlayout
        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);  // place card1 with name 'Card with JButton'
        cards.add(card2, TEXTPANEL);    // place card2 with name 'Card with JTextField' 

		// add  cardlayout panel and comboBoxpanel into frame
        frame.add(comboBoxPane, BorderLayout.NORTH);
        frame.add(cards, BorderLayout.CENTER);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {

		CardLayoutDemo cl = new CardLayoutDemo();
		cl.createAndShowGUI();       
    }



	public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
//						where           // take item from combobox u selected type cast to string and display that name card
    }    
    
}
