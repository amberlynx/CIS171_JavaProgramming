//        ABSTRACT
abstract class Shape // Contains things that you will never create an object, just lets other things that extend it use what's inside
{
   public abstract void draw();
}

class Rectangle extends Shape { public void draw() { System.out.println("Drawing Rectangle"); } }

class Circle extends Shape { public void draw() { System.out.println("Drawing Circle"); } }

class TestAbstraction
{
   public static void main(String [] args)
   {
      //Shape aShape = new Shape(); THIS IS WHAT THE TOP COMMENT REFERENCES, you cannot create object from abstract
      Shape s = new Rectangle();
      s.draw();
      //Shape c = new Circle();
      //c.draw();
      s = new Circle();
      s.draw();
   }
}

/**
      For example, a good abstract would have been animal and then extending that would be different kinds of animals such as cat, dog, bird, etc
**/



//       INTERFACE
interface InterfaceTest
{
   // Anything in here is constant(final) and public
   // Often used as template or blueprint
   final int a=26;
   void display();
}

class MyInterface implements InterfaceTest
{
   public void display()
   {
      System.out.println("In display");
      System.out.println(a);
   }
   
   public static void main(String [] args)
   {
      MyInterface myInt = new MyInterface();
      myInt.display();
      // a=22; // WILL CAUSE ERROR because it is final whether you put final or not
      System.out.println(a);
   }
}

/*
   In an abstract class you can create non abstract methods
   In interface you have to have all abstract methods, can't be changed, all public
   
   abstract = extends
   interface = implements
   
   interface used as a template
*/