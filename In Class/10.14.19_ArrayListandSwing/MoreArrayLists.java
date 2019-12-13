/**

InClass Program: MoreArrayLists
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is an in class example program using array lists.
Created: 10.14.19
Last Edited: 10.14.19

**/
import java.util.ArrayList;
class MoreArrayLists
{
   public static void main(String [] args)
   {
      ArrayList<Integer> myList = new ArrayList<>(); // Array list is more efficient but array list is more versitile
      int num = 26;
      myList.add(num); // Autoboxing
      System.out.println(myList.get(0));
      
      int x = myList.get(0); // Unboxing
      System.out.println(x);
      
      ArrayList<Employee> emps = new ArrayList<Employee>();
      emps.add(new Employee("Rick", "Grimes", 18500));
      emps.add(new Employee("Daryl", "Dixon", 145000));
      emps.add(new Employee("Maggie", "Green", 150000));
      System.out.println(emps);
      // My attempt: emps.get(2) = set.Employee("Maggie", "Rhee");
      //Employee e = emps.get(2);
      //e.setLastName("Rhee");
      //System.out.println(emps);
      emps.get(2).setLastName("Rhee"); // Most efficient
      System.out.println(emps);
   }
}
   
// class inside another class is called nesting and it must be private
class Employee
{
      private String first;
      private String last;
      private double salary;
      
      public String setLastName(String l)
      {
         last = l;
         return last;
      }
        
      public Employee(String f, String l, double s)
      {
         first = f;
         last = l;
         salary = s;
      }
            
      public String toString()
      {
         return (first + " " + last + "'s, salary is " + salary);
      }
}
      
