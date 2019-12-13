public class HourlyEmployee extends NewEmployee
{
   private double hours;
   private double rate;
   
   // Constructor
   public HourlyEmployee() 
   {
      hours = 0;
      rate = 0;
   }
   
   public double getHours() { return hours; }
   public double getRate() { return rate; }

   public void setHours(double h) {hours = h;}
   public void setRate(double r) {rate = r;}
   
   public double calcWeeklyPay(double hours, double rate) { return totalPay = hours * rate; }
   
   public String toString() { return NewEmployee.toString() + " has made " + calcWeeklyPay(hours, rate) + " dollars this week."; }
}