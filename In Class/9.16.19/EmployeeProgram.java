public class EmployeeProgram
{
   public static void main(String [] args)
   {
      Address addr1 = new Address("123 Oak St", "Dearborn", "MI", "48128");
      Employee emp1 = new Employee(111, "Joe", addr1, 45000);
      
      emp1.display();
   }
}