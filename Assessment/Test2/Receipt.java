/*

Java Test 2 - Receipt.java
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This program is the receipt creator for Test 2, Pizza program.
Created: 11.11.19
Last Edited: 11.11.19

*/
import java.util.ArrayList;
public class Receipt
{
   Pizza pizzaOrder = new Pizza();
   ArrayList<Pizza> orderList = new ArrayList<Pizza>();
   private double subtotal;
   private double taxrate = .06;
   private double tax;
   private double total;
   
   public double getSubtotal() { return subtotal; }
   
   public Receipt()
   {
      subtotal = 0;
      tax = 0;
      total = 0;
   }
   
   public void sizeSelection()
   {
      if(pizzaOrder.getSize() == "small") { pizzaOrder.setPrice(5.00); }
      else if(pizzaOrder.getSize() == "medium") { pizzaOrder.setPrice(8.00); }
      else if(pizzaOrder.getSize() == "large") { pizzaOrder.setPrice(11.00); }
      else { System.out.println("Invalid size selection."); } 
   }
   
   public double addTopping() { return subtotal += 1; }
   
   public double calcTax() { return tax = subtotal * taxrate; }
   
   public double fillTotal()
   {
      calcTax();
      return total = tax + subtotal;
   }
   
   public String numberPizza(ArrayList orderList)
   {
      for(int x=0; x < orderList.size(); ++x)
      {
         String numbered;
         int count=0;
         ++count;
         return numbered = count +": " + orderList.get(x);
      }
      return " -- ";
   }
   
   public String toString()
   {
      sizeSelection();
      return ("Ekko Pizza!\n" + "--------------\n" + numberPizza(orderList) + "\nSubtotal: $" + subtotal + "\nTax: $" + calcTax() + "\nTotal Due: $" + fillTotal()); 
   }
}