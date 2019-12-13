import javax.swing.*;
import java.awt.event.*;
public class RadioButtonExample extends JFrame implements ActionListener
{
   JRadioButton rb1, rb2;
   JButton b;
   
   RadioButtonExample()
   {
      rb1 = new JRadioButton("Pizza");
      rb1.setBounds(100,50,100,30);
            
      rb2 = new JRadioButton("Popcorn");
      rb2.setBounds(100,100,100,30);
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(rb1); bg.add(rb2);
      
      b = new JButton("Choose!");
      b.setBounds(100,150,80,30);
      b.addActionListener(this);
      
      add(rb1); add(rb2); add(b);
      
      setSize(300,300);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   } // end constructor
   
   public void actionPerformed(ActionEvent e)
   {
      if(rb1.isSelected()) JOptionPane.showMessageDialog(this, "Pizza is awesome!");
      else if (rb2.isSelected()) JOptionPane.showMessageDialog(this, "Popcorn, my favorite!");
      else JOptionPane.showMessageDialog(this, "Nothing?");
   }
   
   public static void main(String [] args)
   {
      new RadioButtonExample();
   }
} // end RadioButtonExample Class