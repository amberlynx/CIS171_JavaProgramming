/*

Java Test 2 Study Guide
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This program covers what will be on the Java Test 2.
Created: 11.4.19
Last Edited: 11.6.19

*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class JavaTest2StudyGuide
{   
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      
      // Array list using objects
      ArrayList<Candy> candy = new ArrayList<Candy>();
      candy.add(new Candy("Snickers", 1));
      candy.add(new Candy("Reeses", 2));
      candy.add(new Candy("Hersheys", 3));
      //System.out.println(candy);
      candy.toString();
      
      // Exceptions
      try
      {
         int myArray[] = new int[7];
         myArray[10] = 22;
         System.out.println("Trying...");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("Index out of bounds: " + e.getMessage());
      }
      catch(ArithmeticException e)
      {
         System.out.println("Math Issue: " + e.getMessage());
      }
      catch(Exception e)
      {
         System.out.println("General Exception: " + e.getMessage());
      }
      //finally // Optional, not necessary
      //{
         //System.out.println("Finally!");
      //}
      System.out.println("Program continuing...");
      
      while(true)
      {
         try
         {
            System.out.println("Please enter a number: ");
            String num = input.nextLine();
            int numberCheck = Integer.parseInt(num);
         }
         catch(NumberFormatException e)
         {
            System.out.println("Wrong data type: " + e.getMessage());
            continue;
         }
         
         if(e=null)
         {
            System.out.println(num);
            break;
         }
      }
   
      // File reading and writing (will require the exceptions)
      
      // Output Hello to data.txt
      PrintWriter userfile = new PrintWriter("data.txt"); // Open
      userfile.println("Hello!");
      userfile.close(); // Close - if you don't close you can lose data to the buffer
      
      // Typed input with exception
      Scanner keyboard = new Scanner(System.in);
      PrintWriter userfile2;
      try
      {
         System.out.println("Enter filename:");
         String filename = keyboard.nextLine();
         userfile2 = new PrintWriter(filename);
         System.out.println("Enter something here");
         String finput = keyboard.nextLine();
         userfile2.println(finput);
         userfile2.close();
      }
      catch(Exception e)
      {
         System.out.println("Exception caught");
      }
      
      // Quick writer
      FileWriter fw = new FileWriter("myData.txt", true);
      PrintWriter myNewFile = new PrintWriter(fw);
      myNewFile.println("Why hello there..");
      myNewFile.close();     
      
      // Read file
      File rf = new File("myData.txt");
      if(!rf.exists()) { System.out.println("File does not exist!"); }
      else
      {
         System.out.println("File exists!");
         Scanner readFile = new Scanner(rf);
         while(readFile.hasNext())
         {
            String line = readFile.nextLine();
            System.out.println(line);
         }
      }
      
      String content = "This is my string";
      
      // Buffered file write
      try(FileWriter writer = new FileWriter("bufferedFile.txt"); BufferedWriter bw = new BufferedWriter(writer))
      {
         bw.write(97);//content);
      }
      catch(Exception e)
      {
         System.out.println("End");
      }
      
     // FileWriter fw = new FileWriter(file);
     // BufferedWriter bw = new BufferedWriter(fw);
     // PrintWriter pw = new PrintWriter(bw);

   
      // GUI -> Listeners 
   }
}
                            /* Classes */
class Candy
{
   private String name;
   private int count;
     
   public Candy()
   {
      name = "Chocolate";
      count = 1;
   }
   
   public Candy(String n, int c)
   {
      name = n;
      count = c;
   }
      
   public String toString()
   {
      return ("You currently have " + count + " " + name + ".");
   }
}