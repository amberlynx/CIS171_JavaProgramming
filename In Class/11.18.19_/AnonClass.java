//       ANONOYMOUS - class with no name
public class AnonClass
{
   public static void main(String [] args)
   {
      Dog myDog = new Dog();
      myDog.someDog();
      Dog yourDog = new Dog() { public void someDog() { System.out.println("An anonymous dog."); } }; // Subclass (anon)
      yourDog.someDog();
   }
}

class Dog { public void someDog() { System.out.println("My Dog"); } }