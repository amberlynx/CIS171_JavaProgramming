/*

Java Test 2 - Pizza.java
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This program is the pizza class for Test 2, it will create the pizza.
Created: 11.11.19
Last Edited: 11.11.19

*/
import java.util.ArrayList;
public class Pizza
{
   private String pSize;
   private double pPrice;
   ArrayList<String> topping = new ArrayList<>();
   
   public Pizza()
   {
      pSize = "Small";
      pPrice = 0;
      topping.add("no toppings");
   }
   
   public String getSize() { return pSize; }
   public double getPrice() { return pPrice; }
   public ArrayList getTopping() { return topping; }
   
   public void setSize(String s) { pSize = s; }
   public void setPrice(double p) { pPrice = p; }
   public void setTopping(String t) { topping.add(t); }
   
   public String toString()
   {
      //int num = 0;
      //for()
      //{
         //++num;
         return (/*num + ": " +*/ pSize + " pizza with " + topping.toString());  
      //}
   }
}