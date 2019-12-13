class AnimalInheritance
{
   public static void main(String [] args)
   {
      Puppy p = new Puppy();
      p.cry();
      p.bark();
      p.eat();
      
      System.out.println("\n");
      
      Animal test = new Dog();
      //Animal test = new Puppy();
      Animal a = new Animal();
     // p = (Puppy) test;
      p.cry();
      p.bark();
      p.eat();
      
      System.out.println("\n\n");
      
      if(p instanceof Animal) { System.out.println("Animal Class"); }
      else if(p instanceof Dog) { System.out.println("Dog Class"); }
      else if(p instanceof Puppy) { System.out.println("Puppy Class"); }
      
      System.out.println("\n");
      
      if(p instanceof Puppy) { System.out.println("Puppy Class"); }
      else if(p instanceof Dog) { System.out.println("Dog Class"); }
      else if(p instanceof Animal) { System.out.println("Animal Class"); }
      
      System.out.println("\n");
      
      if(test instanceof Puppy) { System.out.println("Puppy Class"); }
      else if(test instanceof Dog) { System.out.println("Dog Class"); }
      else if(test instanceof Animal) { System.out.println("Animal Class"); }
      
   }
} // End main class
// Classes
class Animal { void eat(){System.out.println("Chewing.."); } }
class Dog extends Animal { void bark() { System.out.println("Woof, woof!"); } }
class Puppy extends Dog
{
   @Override public void eat() { System.out.println("Eating hastily.."); }
   void cry() { System.out.println("Whining.."); }
}