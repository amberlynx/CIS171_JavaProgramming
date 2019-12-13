/*
      Resturant Meal Receipt Java Code Example, Part 1
      This code calculates and display tax using strictly input/output methods.
      Written by Amber Sakkinen
      Date: September 3rd, 2019
*/
import java.util.Scanner;

public class Assignment1p1
{
   public static void main(String [] args)
   {
      // Tax and tip percentage values are constant & calculate resturant tip 20% & tax at 6% price of meal
      final double rateTax = .06;
      final double rateTip = .2;
      String nameResturant;
      String nameServer;
      String holdEnter;
      double amtMeal;
      double amtTax;
      double amtTip;
      double amtTotal;
      Scanner input = new Scanner(System.in);
      
      // Ask user for name of resturant, meal amount, then server's name
      System.out.println("Enter the name of the restaurant: ");
      nameResturant = input.nextLine();
      System.out.println("Enter the amount of your meal: ");
      amtMeal = input.nextFloat();
      System.out.println("Enter the name of your Server: ");
      holdEnter = input.nextLine();
      nameServer = input.nextLine();
      
      // Calculations
      amtTax = amtMeal * rateTax;
      amtTip = amtMeal * rateTip;
      amtTotal = amtMeal + amtTax + amtTip;
      
      // Give user the total
      System.out.println("Thank you for visiting " + nameResturant);
      System.out.println("Your Server was: " + nameServer);
      
      System.out.println("\n  Subtotal    $  " + amtMeal);
      System.out.println("       Tax    $  " + amtTax);
      System.out.println("       Tip    $  " + amtTip);
      System.out.println("     Total    $  " + amtTotal);
   }
}