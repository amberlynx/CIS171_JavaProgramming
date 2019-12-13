import java.io.*;
import java.util.Scanner;
public class ReadUsingScanner
{
   public static void main(String [] args) throws Exception // Everytime you are using files
   {
      File file = new File("test.txt");
      Scanner s = new Scanner(file);
      String newString;
      int i;
      double x;
      
      //s.useDelimiter(",");
      
      while(s.hasNext())
      {
         //newString = s.next();
         //System.out.println(newString);
         if(s.hasNextInt())
         {
            i = s.nextInt();
            System.out.println("Int -> " + i);
         }
         else if(s.hasNextDouble())
         {
            x = s.nextDouble();
            System.out.println("Double -> " + x);
         }
         else
         {
            newString = s.next();
            System.out.println(newString);
         }
      }
   }
   
   
}