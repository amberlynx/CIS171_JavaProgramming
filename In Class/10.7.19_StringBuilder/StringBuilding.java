import java.util.Scanner;
public class StringBuilding
{
   public static void main(String [] args)
   {
      String str1, str2;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      str1 = input.nextLine();
      System.out.println("Enter another string: ");
      str2 = input.nextLine();
      
      if(str1.equals(str2)) System.out.println("Same");
      else System.out.println("Different");
      
      StringBuilder eventString = new StringBuilder("Programming Gaming Event");
      StringBuilder myString = null;
      myString = new StringBuilder(8);
      int myCapacity = myString.capacity();
      System.out.println("Capacity is " + myCapacity);
      
      myString.append("Java");
      System.out.println(myString);
      myString.insert(1, "Python");
      System.out.println(myString);
      
     // myString = "Goodbye";
      
   }
}