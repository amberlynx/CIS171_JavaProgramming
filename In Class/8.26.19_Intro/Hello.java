// Amber Sakkinen, First Java Example, In-Class   August 26th, 2019
// Class Header, MUST have the same name as file
public class Hello
{
                              // String means String class not variable declaration
                                        // args means arguemnents, doesn't have to be args but that's the standard
      public static void main(String [] args)
      {
         boolean testme = true;
         int num = 22; // Won't allow use in function without value unless its a global variable
         // Reserved word, final, for a constant
         final double PI = 3.14159265359;
         
         System.out.println(PI);
         System.out.println(num);
         System.out.println(testme);
                    // println means print line which is a function
         System.out.println("Welcome back to the programming routine."); // Think of it having a /n at the end 
         System.out.print("This is a print."); // Whereas this will continue to print on the same line without the declaration
      }
}

/*
   Standard Naming rules:
      Only start with letter, never symbols or numbers
      Symbols allowed but no spaces
      No reserved words
      Isn't limited to english, code can be written in other languages
      Try to stay lower case unless seperating words, camelCase is preferred
      NEVER ALL CAPS, All caps are reserved for constants
*/

/**
      Javadoc comment example, will be formatted properly by Java itself
*/