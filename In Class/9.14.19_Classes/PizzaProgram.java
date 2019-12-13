public class PizzaProgram
{
      public static void main(String [] args)
      {
         Pizza myPizza = new Pizza();
         Pizza yourPizza = new Pizza("plain", "large", "pepperoni", "none", "black olives", 11.00);
         Pizza theirPizza = new Pizza("plain", "large", "onions", "none", "black olives");
         Customer cust = new Customer("Joe");
         PizzaOrder order1 = new PizzaOrder();
         
         System.out.println(myPizza);
         System.out.println(yourPizza);
         System.out.println(theirPizza);
         System.out.println(cust);
         System.out.println(order1);
   }
}