/**
 *       In Class Lecture Program: BankAccount Class
 *       Description: This code sets up a class to get balance for bank account number.
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen, started September 11th, 2019
 *       Last Edited: 9.16.19
**/
public class BankAccount
{
   private double balance;
   private int acctNumber;
   private static int lastAssignedNumber = 1000;
   
   public BankAccount()
   {
      balance = 50.00;
      lastAssignedNumber++;
      acctNumber=lastAssignedNumber;
   }
   
   public BankAccount(double balance)
   {
      this.balance = balance;
      acctNumber = ++lastAssignedNumber;
   }
   
   public double getBalance(){ return balance;}
   public void setBalance(double b){ balance = b;}
   public int getAcctNumber(){ return acctNumber;}
   
   public BankAccount(int acctNumber, double balance)
   {
      this.acctNumber = acctNumber;
      this.balance = balance;
   }
   
   public BankAccount copy()
   {
      BankAccount copiedAccount = new BankAccount(acctNumber, balance);
      return copiedAccount;
   }
   
   public BankAccount (BankAccount acct2) // Questionable method, not sure if it's correct but it works
   {
      acct2 = acct2;
   }
   
   // Utility Methods
   public String toString()
   {
      String str = "Account Number: " + acctNumber + "\t Balance: $ " + balance;
      return str;
   }
   public boolean equals(BankAccount acct2)
   {
      acct2.balance = 84792.55;
      boolean isEqual;
      if(this.acctNumber == acct2.acctNumber)
         isEqual = true;
      else
         isEqual = false;
      return isEqual;
   }
}