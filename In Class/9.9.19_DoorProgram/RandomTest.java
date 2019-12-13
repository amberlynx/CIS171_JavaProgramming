/**
 *       In class Lecture Program: RandomTest
 *       Description: This program can be used for various Random variables.
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen, started September 9th, 2019
 *       Last Edited: 9.9.19
**/
import java.util.Random;

public class RandomTest
{
   public static void main(String [] args)
   {
      // Seed value, won't work if it is int (works for double)
      double randNum = Math.random(); // 0.0(inclusive) ~ 1.0 (noninclusive)
      System.out.println("Random Number: " + randNum);
      
    //  int randInt = (int)(Math.random()); // Will always give 0 because int in noninclusive
      int randInt = (int)(Math.random() * 10) + 1; // Between 0 - 9, the + 1 is used to scale
      System.out.println("Random Int: " + randInt);
      
      // At this point object must be created to get random number
      Random randObject = new Random();
      int nInt = randObject.nextInt(10) + 1; // 0(inclusive) - 10(non inclusive) = 0-9; + 1 = 1-9
      System.out.println("Random Object: " + nInt);
      
      boolean nBool = randObject.nextBoolean();
      System.out.println("True or false? " + nBool);
   }
}
