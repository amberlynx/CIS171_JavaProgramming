enum Operator { ADD,SUBTRACT,MULTIPLY,DIVIDE; }

public class EnumsWithoutFunctions
{
   public static void main(String [] args)
   {
      int num1=10, num2=20, result=10;
      
      Operator operator = Operator.MULTIPLY;
      switch(operator)
      {
         case ADD:
            result = num1 + num2;
            break;
         case MULTIPLY:
            result = num1 * num2;
            break;
      }
      System.out.println(result);
   }
}