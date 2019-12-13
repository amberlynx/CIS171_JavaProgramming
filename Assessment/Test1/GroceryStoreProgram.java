import java.util.Scanner;
public class GroceryStoreProgram
{
   public static void main(String [] args)
   {
      // Initalizing
      boolean scan;
      boolean keepGoing;
      double pay;
      Register selfCheckout = new Register();
      Scanner userInput = new Scanner(System.in);
      
      // Scanning Items
      System.out.println("Scan an item? True or false.");
      scan = userInput.nextBoolean();
      System.out.println("How much was the item you choose?");
      double amt = userInput.nextDouble();
      selfCheckout.recordPurchase();
      selfCheckout.setPrice(amt);
      do
      {
         System.out.println("Add more to cart? True or false.");
         scan = userInput.nextBoolean();
         
         if(scan == true)
         {
            selfCheckout.recordPurchase();
         }
         else
         {
            selfCheckout.calcSalesTax();
            selfCheckout.calcTotal();
            System.out.println("Your current subtotal is "+selfCheckout.getSubtotal()+", with a tax rate of 6% and total of "+selfCheckout.getTotal());
         }
         
      } while(scan == true);
      do
      {
      System.out.println("Would you like to scan a different item? True or false.");
      scan = userInput.nextBoolean();
      System.out.println("How much was the item you choose?");
      amt = userInput.nextDouble();
      selfCheckout.recordPurchase();
      selfCheckout.setPrice(amt);
      do
      {
         System.out.println("Add more to cart? True or false.");
         scan = userInput.nextBoolean();
         
         if(scan == true)
         {
            selfCheckout.recordPurchase();
         }
         else
         {
            selfCheckout.calcSalesTax();
            selfCheckout.calcTotal();
            System.out.println("Your current subtotal is "+selfCheckout.getSubtotal()+", with a tax rate of 6% and total of "+selfCheckout.getTotal());
         }
         
      } while(scan == true);
         System.out.println("Would you like to continue shopping? True or false.");
         keepGoing = userInput.nextBoolean();
      } while(keepGoing == true);
      
      System.out.println("You have choosen " + selfCheckout.getItemCount() + " items and the current price is " + selfCheckout.getPrice() + " with a subtotal of " + selfCheckout.getSubtotal());
      
      // Make a payment
      System.out.println("Please make your payment: ");
      pay = userInput.nextDouble();
      
      if(selfCheckout.getTotal() < pay)
      {
         selfCheckout.calcChange();
         selfCheckout.getChange();
      }
      else
      {
         System.out.println("Please pay the full amount due: " + selfCheckout.getTotal());
      }
      
      System.out.println(selfCheckout.toString());
      
   }
}