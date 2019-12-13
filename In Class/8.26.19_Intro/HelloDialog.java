// Imports must be outside of classes, preferably at the top
import javax.swing.JOptionPane;
import java.lang; // Not necessary but this holds the java package

public class HelloDialog
{
   public static void main(String [] args)
   {
      // Shows message in dialog box instead of command line, by giving it the value null it puts the box in the center
      JOptionPane.showMessageDialog(null, "Hey! Pay attention!");   
   }
}