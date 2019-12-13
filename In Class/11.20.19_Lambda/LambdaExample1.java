class LambdaExample1
{
   interface functionInterface { void sayMessage(String message); }
   interface functionInterface2 { int operation(int a, int b); }
   
   int operate(int a, int b, functionInterface2 fobj) { return fobj.operation(a,b); }
   
   public static void main(String [] args)
   {
      functionInterface fobj = message -> System.out.println(message);
      fobj.sayMessage("Hello Lambda!");
      fobj.sayMessage("Goodbye for now!");
      
      functionInterface2 add=(x,y) -> x + y;
      functionInterface2 multiply=(x,y) -> x * y;
      LambdaExample1 myObj = new LambdaExample1();
      System.out.println(myObj.operate(5,2,add));
      System.out.println(myObj.operate(5,2,multiply));
      fobj.sayMessage("");
   }
}