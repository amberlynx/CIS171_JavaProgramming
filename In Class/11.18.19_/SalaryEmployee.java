public class SalaryEmployee extends NewEmployee
{
   private double annualSalary;
   
   // Constructor
   public SalaryEmployee() { annualSalary = 0; }
   
   public double getSalary() { return annualSalary;}
   public void setSalary(double s) { annualSalary = s;}
   
   public double calcWeeklyPay(double annualSalary) { return annualSalary; }
   public String toString() { return "This employee has made " + calcWeeklyPay(annualSalary) + " dollars this year."; }
}