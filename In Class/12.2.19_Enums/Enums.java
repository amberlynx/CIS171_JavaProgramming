enum Operator
{ 
   ADD { @Override int execute(final int num1, final int num2) { return num1 + num2; } },
   SUBTRACT { @Override int execute(final int num1, final int num2) { return num1 - num2; } },
   DIVIDE { @Override int execute(final int num1, final int num2) { return num1 / num2; } },
   MULTIPLY { @Override int execute(final int num1, final int num2) { return num1 * num2; } };
   abstract int execute(int num1, int num2);
};

public class Enums
{
   public static void main(String [] args)
   {
      int num1=10, num2=20, result=10;
      
      Operator operator = Operator.MULTIPLY;
      result = operator.execute(num1,num2);
      System.out.println(result);
   }
}