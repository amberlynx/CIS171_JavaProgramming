public class Register
{
   private double price;
   private int itemCount;
   private double subtotal;
   private double salesTax=.6;
   private double total;
   private double payment;
   private double change;

   public Register()
   {
      price = 0;
      itemCount = 0;
      subtotal = 0;
      salesTax = 0;
      total = 0;
      payment = 0;
      change = 0;
   }
   
   public Register(double p, int ic, double sub, double st, double ttl)
   {      
      price = p;
      itemCount = ic;
      subtotal = sub;
      salesTax = st;
      total = ttl;
   }
   
   public double getPrice(){return price;}
   public int getItemCount(){return itemCount;}
   public double getSubtotal(){return subtotal;}
   public double getSalesTax(){return salesTax;}
   public double getTotal(){return total;}
   public double getPayment(){return payment;}
   public double getChange(){return change;}
   
   public void setPrice(double p){price = p;}
   public void setItemCount(int ic){itemCount = ic;}
   public void setSubtotal(double sub){subtotal = sub;}
   public void setSalesTax(double st){salesTax = st;}
   public void setTotal(double ttl){total = ttl;}
   public void setPayment(double pay){payment = pay;}
   public void setChange(double c){change = c;}



   public void recordPurchase()
   {
      ++itemCount;
      total = (price * itemCount) + total;
   }
   
   public void recievePayment(double pay)
   {
      // total = payment - total;
      // return total;
      // OR
      payment = pay;
      if(!(payment==0))
      {
         System.out.println("Your payment for " + payment + " has been processed. Thank you!");
      }
   }
   
   public double calcChange()
   {
      change = total - payment;
      return change;
   }
   
   public double calcSalesTax()
   {
      subtotal = (price * itemCount);
      return subtotal;
   }
   
   public double calcTotal()
   {
      total = (subtotal * salesTax) - payment;
      return total;
   }
   
   public String toString()
   {
      String str = "Items: "+itemCount+"\nSubtotal: "+subtotal+"\nSales Tax: "+salesTax+"\nTotal: "+total+"\nPayment: "+payment+"\nChange due: "+change+"\nThank you for using the self checkout, have a good day!";
      return str;
   }
}