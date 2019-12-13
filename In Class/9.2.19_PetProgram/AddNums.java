public class AddNums
{
   public static void main(String [] args)
   {
      addNumbers();
      addNumbers(5,10);
   }
   public static void addNumbers() // * This line is a Header 
   {
      int num1=2, num2=5;
      System.out.println(num1 + "+" + num2 + " equals " + (num1+num2));
   }
   public static void addNumbers(int num1, int num2)
   {
     System.out.println(num1 + "+" + num2 + " equals " + (num1+num2));
   } // endClass
}