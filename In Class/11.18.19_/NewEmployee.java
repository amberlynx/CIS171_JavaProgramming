public class NewEmployee
{
   private String name;
   private String socSecNum;
   private String jobTitle;
   private String address;
   private String phone;
   private int age;
   private int startYear;
   private double totalPay;
      
   public static void main(String [] args)
   {
      
   }
   
   // Constructor
   public NewEmployee() {}
   
   public String getName() { return name;}
   public String getSSN() { return socSecNum;}
   public String getTitle() { return jobTitle;}
   public String getAddress() { return address;}
   public String getPhone() { return phone;}
   public int getAge() { return age;}
   public int getStartYear() { return startYear;}
   public double getTotalPay() { return totalPay;}
   
   public void setName(String n) { name = n;}
   public void setSSN(String ssn) { socSecNum = ssn;}
   public void setTitle(String title) { jobTitle = title;}
   public void setAddress(String addr) { address = addr;}
   public void setPhone(String p) { phone = p;}
   public void setAge(int a) { age = a;}
   public void setStartYear(int sy) { startYear = sy;}
   public void setTotalPay(double t) { totalPay = t;}

   public String toString()
   {
      return "";
   }
}