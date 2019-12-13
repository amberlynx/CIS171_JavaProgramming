/**

InClass Program - 
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is a .
Created: 10.28.19
Last Edited: 10.28.19

**/
import java.io.*;
import java.util.Scanner;
public class FileIO
{
   public static void main(String [] args) throws IOException
   {
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
   } 
}