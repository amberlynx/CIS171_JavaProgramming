/**

InClass: Using arrays and examples
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is an array program for working and testing arrays.
Created: 10.9.19
Last Edited: 10.9.19

**/
public class Arrays
{
   public static void main(String [] args)
   {
      int[] temp;
      temp = new int[5];
      temp[0]=10;
      temp[1]=20;
      temp = new int[10]; // AVOID THIS! Will memory leak, makes old array garbage and you won't be able to access data at old postions
      float[] rates = new float[10];
      final int SIZE = 5;
      int[] temps = new int[SIZE];
      double[] rent = {550.00, 780.00, 950.00};
      int temp[], rates, counts; // 1 array and 2 variables
      int[] temp, rates, counts; // 3 arrays
   
      mySize = temp.length;
   
      for(int x=0; x < mySize; ++x)
      {
         rates[x]=0;
      }
   
      // Whatever data type array is variable must be same type; ie. if array is float currentRate must be float
      for(float currentRate : rates) // rates is name of array (array reference)
      {
         currentRate=0;
         System.out.println("The current rate is " + currrentRate);
      }
   
      for(Pizza onePizza : orders) { onePizza.display(); } // Easier to read but both are efficient
      for(Pizza onePizza : orders) { onePizza.setQty(5); }
      
      // Another way of above for loop
      for(int x=0; x < orders.length; ++x){ orders[x].display(); }
      for(int x=0; x < orders.length; ++x){ orders[x].setQty(5); }
      
      float[] amts, rates;
      amts = new float[5];
      rates = new float[5];
      amts = rates; // Another memory leak but could be used if needed
   }
}