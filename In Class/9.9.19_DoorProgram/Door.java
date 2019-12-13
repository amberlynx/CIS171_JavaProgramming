/**
 *       In class Peer Programming Program: DoorClass
 *       Description: This program was written in class as peer programming.
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen and Steven Kalis, started September 9th, 2019
 *       Last Edited: 9.10.19
**/

//Door class
public class Door
{
	 boolean locked;
    boolean closed;
    final String inscription;
   
  
	//Non-Default Constructor
	public Door(String s)
	{
		//sets the inscription constant to the parameter
		inscription = s;
	}	
   
	//isClosed Method
	public boolean isClosed()
	{
		return closed; 
	}
	//isLocked Method
	public boolean isLocked()
	{
		return locked;
	}
   
	//open method
	public void open()
	{
		//if the closed var is true and the locked var isnt true, make it false and "open the door"
		if(closed && !locked)
		{
			closed = false;
			System.out.println("The door was opened.");
		}
		else
		{
			//if we cant open the door, its either locked or already open
			System.out.println("ERROR - Cannot open door");
		}
	}
	//close method
	public void close()
	{
		//if the door is not closed, we can close it and set the var to true
		if(!closed)
		{
			closed = true;
			System.out.println("The door was closed.");
		}
		else
		{  //if we cant close the door, the door is probably already closed
			System.out.println("ERROR - Cannot close door");
		}
	}
	//lock method
	public void lock()
	{  //if the door isnt locked, we can lock it and set the var to true
		if(!locked)
		{
			locked = true;
			System.out.println("The door was locked!");
		}	
		else
		{  //if the door cant be locked, we display that
			System.out.println("ERROR - Cannot lock the door");
		}
	}
	//unlock method
	public void unlock()
	{  //same logic as the lock but if the door is locked we unlock it
		if(locked)
		{
			locked = false;
			System.out.println("The door was unlocked!");
		}
		else
		{
			System.out.println("ERROR - Cannot unlock this door");
		}
	}
	//readDoor method
	public String readDoor(String s)
	{
		//we take in the inscription as a parameter and return the string
		return "The door's inscription is " + s;
	}
   
   /**   SETS AND GETS   */
   public boolean getLocked(){ return locked; }
	public void setLocked(boolean l) 
	{
      locked = l;
	}
   public boolean getClosed(){ return closed; }
	public void setClosed(boolean c) 
	{
      closed = c;
	}
}