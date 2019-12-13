import java.util.Scanner;
public class ExceptionExample
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      
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
      finally // Optional, not necessary
      {
         System.out.println("Finally!");
      }
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
   }
}