/**

InClass: Array List Example
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This program shows how to use the java.util.ArrayList import.
Created: 10.9.19
Last Edited: 10.9.19

**/
import java.util.ArrayList;
public class ArrayListExample
{
   public static void main(String [] args)
   {
      // By default Array list will hold 10 items; will add to compacity if it goes over, puts in new location with 20
      ArrayList<String> myList = new ArrayList<String>();
      myList.add("CIS125");
      myList.add("CIS170");
      myList.add("CIS171");
      myList.add("CIS230");
      
      System.out.println("My list contains: " + myList); // Computer uses toString method on list
      System.out.println("The size of my list is: " + myList.size());
      
      for(int x=0; x < myList.size(); ++x)
      {
         System.out.println(" " + myList.get(x)); // Displays each item in list; uses x as index
      }
      
      for(String course : myList)
      {
         System.out.print(" " + course); // Prints on the same line
      }
      
      myList.add(0, "CIS100");
      myList.add(1, "CIS112");
      System.out.println("\n Schedule change: " + myList);
      myList.remove("CIS112");
      System.out.println("\n Schedule change: " + myList);
      
      myList.remove(2);
      String myCourse = "CIS171";
      if(myList.contains(myCourse)) { System.out.println("Found!"); }
      else { System.out.println("Not Found."); }
      
      if(myList.isEmpty()) { System.out.println("Empty"); }
      else { System.out.println("Full"); }
      myList.clear();
      if(myList.isEmpty()) { System.out.println("Empty"); }
      else { System.out.println("Full"); }
      
      ArrayList<String> myList = new ArrayList<String(50); // Initialize with 50 spaces in memory
   }
}