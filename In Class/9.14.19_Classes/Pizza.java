public class Pizza
{
   private String crust;
   private String size;
   private String topping1;
   private String topping2;
   private String topping3;
   private double price;
   
   private void calcPrice()
   {
      switch(size.charAt(0))
      {
         case 'S': case 's':
            price = 6.99;
            break;
         case 'M': case 'm':
            price = 8.99;
            break;
         case 'L': case 'l':
            price = 10.99;
            break;
         default:
            size = "Medium";
            price = 8.99;
      }
      
      if(!(topping1 == "none")){ price += .75; }
      else if(!(topping2 == "none")) { price += .75; }
      else if(!(topping3 == "none")) { price += .75; }
      
      if(!(crust == "plain")) { price += .50; }
      else if(!(crust == "plain")) { price += .50; }
      else if(!(crust == "plain")) { price += .50; }
   }
   
   // Constructors
   public Pizza()
   {
      crust = "garlic cheese";
      size = "medium";
      topping1 = "turkey bacon";
      topping2 = "basil";
      topping3 = "onion";
      price = 8.99;
   }   
   public Pizza(String crust, String size, String top1, String top2, String top3, double price)
   {
      this.crust = crust;
      this.size = size;
      topping1 = top1;
      topping2 = top2;
      topping3 = top3;
      this.price = price;
   }
   public Pizza(String crust, String size, String top1, String top2, String top3)
   {
      this.crust = crust;
      this.size = size;
      topping1 = top1;
      topping2 = top2;
      topping3 = top3;
      this.calcPrice();
   }
   
   // Utility Methods
   public String toString()
   {
      String str = "You ordered a " + size + " " + crust + " pizza with " + topping1 + " " + topping2 + " " + topping3 + " for a total of $" + price;
      return str;
   }
}