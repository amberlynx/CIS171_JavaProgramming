import javax.swing.*;
import java.awt.event.*;
public class ComboBoxExample extends JFrame implements ActionListener
{
   JFrame f;
   JLabel label;
   final String languages[] = {"C", "C++", "C#", "Java", "Python"};
   JComboBox<String> cb; // without <String> will not compile, it needs to know what data type its holding
   
   ComboBoxExample()
   {
      f = new JFrame("Languages");
      label = new JLabel();
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setSize(400,100);
      
      JButton b = new JButton("Show");
      b.setBounds(200,100,75,20);
      b.addActionListener(this);
      
      cb = new JComboBox<>(languages);
      cb.setBounds(50,100,90,20);
      
      JButton close = new JButton("Close");
      close.setBounds(50,200,95,30);
      f.add(close);
      close.addActionListener(new CloseListener());
      
      f.add(cb); f.add(label); f.add(b);
      
      f.setLayout(null);
      f.setSize(350,350);
      f.setVisible(true);
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   } // end constructor
   
   public void actionPerformed(ActionEvent e)
   {
      String data = "Language Selected: " + cb.getItemAt(cb.getSelectedIndex());
      label.setText(data);
   }
   
   public class CloseListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         if(e.getActionCommand().equals("Close"))
         {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit?", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION) System.exit(0);
         }
      }
   }
   
   public static void main(String [] args)
   {
      new ComboBoxExample();
   }
}