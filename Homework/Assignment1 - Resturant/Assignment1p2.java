/*
      Resturant Meal Receipt Java Code Example, Part 2
      This code calculates and displays tax information in GUI message boxes.
      Written by Amber Sakkinen
      Date: September 3rd, 2019
*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assignment1p2
{
   public static void main(String [] args)
   {
      final double rateTax = .06;
      final double rateTip = .2;
      String nameResturant;
      String nameServer;
      String holdEnter;
      String stringMeal;
      double amtMeal;
      double amtTax;
      double amtTip;
      double amtTotal;
      Scanner input = new Scanner(System.in);
      
      nameResturant = JOptionPane.showInputDialog(null, "Enter the name of the restaurant: ");
      stringMeal = JOptionPane.showInputDialog(null, "Enter the amount of your meal: ");
      nameServer = JOptionPane.showInputDialog(null, "Enter the name of your Server: ");
      
      amtMeal = Double.parseDouble(stringMeal);
      amtTax = amtMeal * rateTax;
      amtTip = amtMeal * rateTip;
      amtTotal = amtMeal + amtTax + amtTip;
      
      
      
      JOptionPane.showMessageDialog(null, "Thank you for visiting " + nameResturant 
                                          + "\n Your Server was: " + nameServer 
                                          + "\n\n Subtotal     $  " + amtMeal
                                          + "\n   Tax          $  " + amtTax
                                          + "\n   Tip          $  " + amtTip 
                                          + "\n   Total        $  " + amtTotal);
   }
}