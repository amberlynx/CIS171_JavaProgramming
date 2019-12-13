/**
 *       In class Peer Programming Program: DoorProgram
 *       Description: This program was written in class as peer programming.
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen & Steven Kalis, started September 9th, 2019
 *       Last Edited: 9.10.19
**/
import java.util.Scanner;

public class DoorProgram
{
   public static void main(String [] args)
   {   
     // creating new instance of the door class because thats what worked lol
e
      //setting up a scanner for the main
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What door do we want to go to??\n-------------\nTip* give your console more room to see*\nEnter\nExit\nTreasure\n");
      String userInput;
      userInput = keyboard.nextLine();
      

      if(userInput.equals("enter") | userInput.equals("Enter"))
      {
        //if they want to go to the enter door, this sends the user to the enter door with with the myDoor argument 
        enter(myDoor);   
      }
      else if(userInput.equals("exit") | userInput.equals("Exit"))
      {
         //if they want to go to the exit door, this sends the user to the exit door with with the myDoor argument
         exit(myDoor);
      }
      else if(userInput.equals("treasure") | userInput.equals("Treasure"))
      {
         //if they want to go to the treasure door, this sends the user to the treasure door with with the myDoor argument
         treasure(myDoor);
      }
   }
   
   //Enter door method with the myDoor parameter
   public static void enter(Door myDoor)
   {
      //the enter door should be left unlocked and opened
      myDoor.setLocked(false);
      myDoor.setClosed(false);
        
      Scanner keyboard = new Scanner(System.in);
      
      //creating a string var for the user input inside of te enter method
      String choice = "";
        
      System.out.println("What will you do now?\nlock\nunlock\nopen\nclose\nislocked\nisclosed\nread door");
      
      choice = keyboard.nextLine();
      
      
      //if the user chooses to lock the door, calls the method from the Door class
      if(choice.equals("lock") | choice.equals("Lock"))
         myDoor.lock();
      //if the user chooses to unlock the door, calls the method from the Door class
      else if(choice.equals("unlock") | choice.equals("unlock"))
         myDoor.unlock();
         
      //if the user wants to check to see if the door is locked, it will call the isLocked method from the Door class
      else if(choice.equals("islocked") | choice.equals("isLocked"))
      {
         //isLocked returns a boolean so we store that in a local variable islocked
         boolean islocked = myDoor.isLocked();
         
         //if it comes back true, we will display that it is indeed locked
         if(islocked)
            System.out.println("The door apears to be locked");
         //if it comes back false, we will display that is unlocked
         else
            System.out.println("The door apears to be unlocked");   
      }
      
      //same thing with the isLocked is applied with the isClosed
      else if(choice.equals("isclosed") | choice.equals("isClosed"))
      {
         boolean isclosed = myDoor.isClosed();
         if(!isclosed)
            System.out.println("The door apears to be open");
         else
            System.out.println("The door apears to be closed");
      }
	  
      //if the user chooses open or close, it will call the method from the Door class
      else if(choice.equals("open") | choice.equals("Open"))
         myDoor.open();
      else if(choice.equals("close") | choice.equals("Close"))
         myDoor.close();
         
      //if the user wants to read the inscription on the door, it will call the readDoor method passing the constant var as an argument
      else if(choice.equals("read door") | choice.equals("Read Door"))
         System.out.println(myDoor.readDoor(myDoor.inscription));
      else
         System.out.println("Error - Input not detected");
    }
 
   //exit is similar to enter but the door is left locked and closed
   public static void exit(Door myDoor)
   {
      myDoor.locked = true;
      myDoor.closed = true;
      
      Scanner keyboard = new Scanner(System.in);
      String choice = "";
      
      System.out.println("What will you do now?\nlock\nunlock\nopen\nclose\nislocked\nisclosed\nread door");
      
      choice = keyboard.nextLine();
      
      if(choice.equals("lock") | choice.equals("Lock"))
         myDoor.lock();
      else if(choice.equals("unlock") | choice.equals("unlock"))
         myDoor.unlock();
      else if(choice.equals("islocked") | choice.equals("isLocked"))
      {
         boolean islocked = myDoor.isLocked();
         if(islocked)
            System.out.println("The door apears to be locked");
         else
            System.out.println("The door apears to be unlocked");
      }
	  
      else if(choice.equals("isclosed") | choice.equals("isClosed"))
      {
         boolean isclosed = myDoor.isClosed();
         if(!isclosed)
            System.out.println("The door apears to be open");
         else
            System.out.println("The door apears to be closed");
      }
	  
      else if(choice.equals("open") | choice.equals("Open"))
         myDoor.open();
      else if(choice.equals("close") | choice.equals("Close"))
         myDoor.close();
      else if(choice.equals("read door") | choice.equals("Read Door"))
         System.out.println(myDoor.readDoor(myDoor.inscription));
      else
         System.out.println("Error - Input not detected");
    }
  
      
   //treasure is to be the same as exit and enter, but the door is locked and open
   public static void treasure(Door myDoor)
   {
     myDoor.locked = true;
     myDoor.closed = false;
      
      Scanner keyboard = new Scanner(System.in);
      String choice = "";
      
      System.out.println("What will you do now?\nlock\nunlock\nopen\nclose\nislocked\nisclosed\nread door");
      
      choice = keyboard.nextLine();
      
      if(choice.equals("lock") | choice.equals("Lock"))
         myDoor.lock();
      else if(choice.equals("unlock") | choice.equals("unlock"))
         myDoor.unlock();
      else if(choice.equals("islocked") | choice.equals("isLocked"))
      {
         boolean islocked = myDoor.isLocked();
         if(islocked)
            System.out.println("The door apears to be locked");
         else
            System.out.println("The door apears to be unlocked");
      }
	  
      else if(choice.equals("isclosed") | choice.equals("isClosed"))
      {
         boolean isclosed = myDoor.isClosed();
         if(!isclosed)
            System.out.println("The door apears to be open");
         else
            System.out.println("The door apears to be closed");
      }
	  
      else if(choice.equals("open") | choice.equals("Open"))
         myDoor.open();
      else if(choice.equals("close") | choice.equals("Close"))
         myDoor.close();
      else if(choice.equals("read door") | choice.equals("Read Door"))
         System.out.println(myDoor.readDoor(myDoor.inscription));
      else
         System.out.println("Error - Input not detected");
    }
}
