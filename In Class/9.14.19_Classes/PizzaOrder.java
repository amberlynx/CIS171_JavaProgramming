public class PizzaOrder
{
   private Customer cust;
   private Pizza pizza;
   
   public PizzaOrder()
   {
      cust = new Customer("Sam");
      pizza = new Pizza();
   }
   public String toString() 
   {
      String str = cust + ", " + pizza.toString() + ".";
      return str;
   }   
}