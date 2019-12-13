import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ButtonOld
{
   public static void main(String [] args)
   {
      JFrame frame = new JFrame("Button old way");
      Button b = new Button("Click me");
      b.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { System.out.println("Envunity"); } } );
      frame.add(b);
      frame.setSize(200,200);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}