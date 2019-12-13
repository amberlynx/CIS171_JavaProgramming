/**

Greek Mythology Dice Game
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is the main dice program.
Last Edited: 11.4.19

**/
import java.util.Scanner;
public class DiceGame
{
   public static void main(String [] args)
   {
	  Scanner input = new Scanner(System.in);
	  Player player1 = new Player();
     Player player2 = new Player();
     Game theGame = new Game();
	  boolean playing = true;
     String roll = "";
	  int player=0;
     int currentScore=0;
      
      System.out.println("Welcome player, what is your name?");
      player1.setName(input.nextLine());
      player++;
	  
      System.out.println("Which kingdom will you choose?");
      player1.setKingdom(input.nextLine());
      
      System.out.println("Will another player be joining you on your journey?");
      String anotherPlayer = input.nextLine();
      if(anotherPlayer.equals("yes"))
      {
         System.out.println("Welcome player 2, what is your name?");
         player2.setName(input.nextLine());
         player++;
		 
		 System.out.println("Which kingdom will you choose?");
         player2.setKingdom(input.nextLine());
      }
	  
		do{ // Play the game
			if(player == 1)
			{
				System.out.println("\n" + player1.getName() + " roll the dice! Type roll or q to quit");
				roll = input.nextLine();
            
				if(roll == "roll" || roll == "ROLL" || roll == "Roll" || roll == "r")
            {
               theGame.firstRoll();
               System.out.println("\n" + player1.getName() + " roll the dice to find out what happens next!");
				   roll = input.nextLine();
               if(roll == "roll" || roll == "ROLL" || roll == "Roll" || roll == "r")
               {
                  theGame.secondRoll(theGame.dice1, theGame.dice2, player1, player2);
                  //if(currentScore > player1.getHighscore())
				      //{
					      //player1.replaceScore(currentScore);
				      //}
                  //player1.toString();
               }
               else
               {
                  System.out.println("Sorry invalid answer, please try again.");
               }
            }
            else if(roll == "q")
            {
               playing = false;
               break;
            }
			}
			else if(player == 2)
			{
            // Player 1's turn
            System.out.println("\n" + player1.getName() + " roll the dice! Type roll or q to quit");
				roll = input.nextLine();
            
				if(roll == "roll" || roll == "ROLL" || roll == "Roll" || roll == "r")
            {
               theGame.firstRoll();
               System.out.println("\n" + player1.getName() + " roll the dice to find out what happens next!");
				   roll = input.nextLine();
               if(roll == "roll" || roll == "ROLL" || roll == "Roll" || roll == "r")
               {
                  theGame.secondRoll(theGame.dice1, theGame.dice2, player1, player2);
                  //if(currentScore > player1.getHighscore())
				      //{
					      //player1.replaceScore(currentScore);
				      //}
                  //player1.toString();
               }
               else
               {
                  System.out.println("Sorry invalid answer, please try again.");
               }
            }
            else if(roll == "q")
            {
               playing = false;
               break;
            }
            
            // Player 2's turn
				System.out.println("\n" + player2.getName() + " roll the dice! Type roll or q to quit");
            roll = input.nextLine();
               
            if(roll == "roll" || roll == "ROLL" || roll == "Roll" || roll == "r")
            {
               theGame.firstRoll();
               System.out.println("\n" + player2.getName() + " roll the dice to find out what happens next!");
				   roll = input.nextLine();
               if(roll == "roll" || roll == "ROLL" || roll == "Roll" || roll == "r")
               {
                  playing = true;
                  theGame.secondRoll(theGame.dice1, theGame.dice2, player1, player2);
                  //if(currentScore > player2.getHighscore())
				      //{
					      //player2.replaceScore(currentScore);
				      //}
                  //player2.toString();
               }
               else
               {
                  System.out.println("Sorry invalid answer, please try again.");
               }
            }
            else if(roll == "q")
            {
               playing = false;
               break;
            }
         }
		} while(playing == true);
	}
   
   
   public void displayPlayerInfo(Scanner input, int player, Player player1, Player player2) // Display player info
   {
	  String save = "";
     
	  if(player == 1)
	  {
		   System.out.println(player1.getName() + ", your score is " + player1.getScore() + " with a high score of " + player1.getHighscore() + ". Would you like to save your game progress? Yes or no");
		   save = input.nextLine();
		   if(save == "yes" || save == "Yes" || save == "YES")
		   {
			   System.out.println("Game has run into a 404 error and cannot currently be saved. Sorry!");
            System.out.println("We still await your return hero!");
		   }
		   else
		   {
			   System.out.println("Your game will not be saved.");
            System.out.println("We await your return hero!");
		   }
	  }
	  else
	  {
        System.out.println(player1.getName() + " hailing from the kingdom " + player1.getKingdom() + ", your score is " + player1.getScore() + " with a high score of " + player1.getHighscore() + ". Would you like to save your game progress? Yes or no:");
		  save = input.nextLine();
		  if(save == "yes" || save == "Yes" || save == "YES")
		  {
		     System.out.println("Game has run into a 404 error and cannot currently be saved. Sorry!");
		  }
		  else
		  {
		     System.out.println("Your game will not be saved.");
		  }
      
		  System.out.println("\n" + player2.getName() + " hailing from the kingdom " + player2.getKingdom() + ", your score is " + player2.getScore() + " with a high score of " + player2.getHighscore() + ". Would you like to save your game progress? Yes or no:");
		  save = input.nextLine();
		  if(save == "yes" || save == "Yes" || save == "YES")
		  {
			   System.out.println("Game has run into a 404 error and cannot currently be saved. Sorry!");
            System.out.println("We still await your return heroes!");
		  }
		  else
		  {
			   System.out.println("Your game will not be saved.");
            System.out.println("We await your return heroes!");
		  }
	  }
  }
}


/*    JUNK DRAWER
			
			Player.toString;
			if(gameEnd)
			{
				Player.display();
			}
				
		}


public void getPlayerHP(int health, int player, Player player1, Player player2) // Manage player health
   { 
      if(player == 1)
      {
         player1.setHP(player1.getHP() - health);
      }
      else if(player == 2)
      {
         player2.setHP(player1.getHP() - health);
      }
      else
      {
         System.out.println("There is only code for 2 players.");
      }
   }


*/