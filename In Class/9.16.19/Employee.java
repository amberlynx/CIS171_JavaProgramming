public class Employee
{
   private String name;
   private Address address;
   private int empNumber;
   private double salary;
   
   public Employee(int num, String n, Address addr, double sal)
   {
      empNumber = num;
      name = n;
      address = addr;
      salary = sal;
   }
   
   void display()
   {
      System.out.println(empNumber + " " + name);
      System.out.println(address);
      System.out.println("Salary: " + salary);
   }
}