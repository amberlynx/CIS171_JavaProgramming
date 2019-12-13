/*
      Basic overview of core concepts, using variables and basic functions and taking in and outputting data.
*/

import java.util.Scanner;
import javax.swing.JOptionPane; // Pulls in GUI

public class inputIntro
{
   public static void main(String [] args)
   {
                         // Will give a string = Test25
      System.out.println("Test" + 2 + 5);
                        // The () will add the numbers
      System.out.println("Test" + (2 + 5));
      byte littleInt = 22; // Going over 127 will give an error, byte max is 127
      System.out.println(littleInt);
      
  // Problematic    short littleShort = 32,000; // Max would be 32,767 for short
  // Problematic    System.out.println(littleShort);
  
      long longDebt = 22540969256125L; // The L declares it is long because it will throw an error for being larger than int
      // It could be l but it looks like a 1 so its better to have L
      // Max for long is 9,223,372,036,854,775,808
      
      boolean wantPizza = true;
      int age = 2;
      boolean isAdult = (age >= 18); // Relational Expression
      System.out.println(isAdult);
      
      float num = 2.549F; // Also can use lower case f but F is better
      String name = "Joe"; // String is not a data type but instead it is a class; refer to as String Object
      char myLine = '\n';
      char myQuote = '\"';
      System.out.println("Hello " + name + myLine + "You rock" + myQuote);
      
      // Scanner class
      Scanner keyboard = new Scanner(System.in); // new means new instance of object; new Scanner is a Constructor
      System.out.println("Enter a byte: ");
      byte inbyte = keyboard.nextByte();
      System.out.println("Your byte is " + inbyte);
      
      
      System.out.println("Enter a float: ");
      float infloat = keyboard.nextFloat();
      System.out.println("Your float is " + infloat);
      
      
      // Often a problem can occur because of the enter key
      System.out.println("Enter a string: ");
      String message = keyboard.nextLine();
      String key = keyboard.nextLine();
      System.out.println(message + key);
      
      
      char inital;
      System.out.println("Enter your initials: ");
      message = keyboard.nextLine();
      inital = message.charAt(0); // charAt is string function
      System.out.println(inital);
      
      
      // GUI
      name = JOptionPane.showInputDialog("Enter your name");
      JOptionPane.showMessageDialog(null, "Hello " + name);
      
      
      String input;
      int num1;
      int num2;
      input = JOptionPane.showInputDialog("Enter a number");
      num1 = Integer.parseInt(input);
      input = JOptionPane.showInputDialog("Enter a number");
      num2 = Integer.parseInt(input);
      System.out.println(num2);
      System.out.printf("\n %8.2f", 123.456);
                           // %5d would reserve 5 spaces, %-5d would do it on the other side
                           
      String myFormat = String.format("\n Hey %d \t %.2f, 26, 1.275"); // Takes in format and puts all of it into string
      JOptionPane.showMessageDialog(null, myFormat);      
   }
}