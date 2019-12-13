/**

Greek Mythology Dice Game: Player Class
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is the player class to store and use player information.
Last Edited: 11.4.19

**/
public class Player
{
   private int hp;
	private String name;
	private String kingdom;
	private int highscore;
	private int score;
	
   // Gets
   public String getName() { return name; }
   public String getKingdom() { return kingdom; }   
   public int getScore() { return score; }
   public int getHighscore() { return highscore; }
   public int getHP() { return hp; }
   
   // Sets
   public void setName(String n){ name = n; }
   public void setKingdom(String k){ kingdom = k; }
   public void setScore(int s){ score = s; }
   public void setHighscore(int hs){ highscore = hs; }
   public void setHP(int hp){ this.hp = hp; }
	
   // Constructor
	public Player()
	{
		name = "Phoebe";
		kingdom = "Theebs";
		hp = 250;
		score = 0;
		highscore = 0;
	}
	
	public Player(String n, String k)
	{
		name = n;
      kingdom = k;
	}
	
	public Player(String n, String k, int hp, int s, int hs) // Player session
	{
		name = n;
		kingdom = k;
		this.hp = hp;
		score = s;
		highscore = hs;
	}
	
	public int replaceScore(int score) 
   { 
      if(score > highscore) { return highscore = score; } 
      else{ return highscore; } 
   }
	
	public String toString()
   {
      return name + " whom hails from the kingdom " + kingdom + ", your current health is " + hp + ".";
   }
}

/* 
   // Utility Methods
   public String toString() 
   {
	   String welcome = "Welcome " + playerName + ", your color is " + playerColor + ". Your starting health is " + startHealth +" and your highest score is " + highscore + ".";
	   return welcome;
   }
   
   void display()
   {
		System.out.println("Current Player Data:");
		System.out.println("Player: " + playerName);
		System.out.println("Color: " + playerColor);
		System.out.println("Score: " + score);
		System.out.println("High Score: " + highscore);
   }
}
*/











