import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ButtonNew
{
   public static void main(String [] args)
   {
      JFrame frame = new JFrame("Button new way");
      Button b = new Button("Click me");
      b.addActionListener( e -> System.out.println("Hey") ); // ActionListener only contains actionPerformed, it is an interface
      frame.add(b);
      frame.setSize(200,200);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}