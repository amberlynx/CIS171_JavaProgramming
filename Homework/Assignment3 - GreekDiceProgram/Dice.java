/**

Greek Mythology Dice Game: Dice Class
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is the dice class for rolling a number.
Last Edited: 11.2.19

**/
public class Dice
{
   private int roll;
   
   public Dice() { roll = 1; }
   
   public int roll() { return roll = (int)(Math.random() * 6) + 1; }
   
   public int getRoll() { return roll; }
   public int setRoll(int roll) {return roll;}
}