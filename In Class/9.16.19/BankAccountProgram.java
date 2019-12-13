/**
 *       In Class Lecture Program: BankAccount Program
 *       Description: This code gives user bank account based on account number.
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen, started September 11th, 2019
 *       Last Edited: 9.16.19
**/
import java.text.DecimalFormat; // In order to format decimals

public class BankAccountProgram
{
  public static void main(String [] args)
  {
      BankAccount mine = new BankAccount();
      BankAccount yours = new BankAccount();
      BankAccount theirs = new BankAccount();
      
      System.out.println("My account Number: " + mine.getAcctNumber());
   //   System.out.printf("\n My balance: $ %.2f" + mine.getBalance()); // uses printf function from C library
      
  //    String result = String.format("%.2f, yours.getBalance()");
      System.out.println("Your account Number: " + yours.getAcctNumber());
   //   System.out.println("\n Your balance: $" + result);
      
      DecimalFormat df = new DecimalFormat("$ #,##0.00"); // Can be #.00 making the number optional; instead of 0.05 will result .05
      System.out.println("Their account Number: " + theirs.getAcctNumber());
      System.out.println("\n Their balance: " + df.format (theirs.getBalance()));
      
      System.out.println(mine.toString()); // Shows memory location
      System.out.println(mine); // Calls toString method that was created
      if(mine.equals(yours))
         System.out.println("Same");
      else
         System.out.println("Different");
      System.out.println(yours);
      
      BankAccount copied = theirs.copy();
      System.out.println(copied);
      BankAccount ours = new BankAccount(yours);
      System.out.println(ours);
  }
}