/**

Greek Mythology Dice Game: Game Class
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is the main dice program.
Last Edited: 11.4.19

   Current working version is Greek mythology
**/
import java.util.Random;
public class Game
{
   Dice dice1 = new Dice();
   Dice dice2 = new Dice();
   int health = 250;
   Random random = new Random();
   int randArrayMonster = (int)(Math.random() * 29);
   int randArrayCreature = (int)(Math.random() * 45);
   int randArrayDeity = (int)(Math.random() * 77);
   int randArrayLocation = (int)(Math.random() * 20);
   
   // google how to count elements of array and insert into random function so that only have 1 random function
   private String[] greekMonster = {"Cerberus", "Chimera", "Minotaur", "Scylla", "Medusa", "Sphinx", "Lernaean Hydra", "Pegasus",
                                    "Siren", "Harpy", "Centaur", "Cyclopes", "Gorgon", "Ladon", "Polyphemus", "Echidna", "Nemean Lion",
                                    "Satyr", "Python", "Argus Panoptes", "Orthrus", "Ichthyocentaurs", "Giants", "Griffin", "Stymphalian birds",
                                    "Phoenix", "Manticore", "Arachne", "Typhon"}; // References: https://www.google.com/search?q=list+of+monsters+in+greek+mythology&rlz=1C1KDEC_enUS870&oq=list+of+monsters+in+greek&aqs=chrome.0.0j69i57j0l2.7518j0j9&sourceid=chrome&ie=UTF-8
   
   private String[] creature = {"Deer Woman", "Gilled Antelope", "single peanut", "Goldhorn", "Bake-kujira", "Ceffyl Dwr", "Encantado", "Kelpie", "Kushtaka", "Selkie",
                                "Anansi", "Arachne", "Khepri", "Tsuchigumo", "Mymecoleon", "Myrmidons", "Chupacabra", "Camazotz", "Vetala", "Bugbear", "Callisto", "Adarna",
                                "Aethon", "Alkonost", "Alicanto", "Hoodwink", "Chamrosh", "Banshee", "Griffin", "Harpy", "Hræsvelgr", "Allocamelus", "Adlet", "Amarok",
                                "Asena", "Black Dog", "Beast of Gevaudan", "Cerberus", "Scorpion", "Itsumade", "Hawk", "Eagle", "Scorpion", "Giant Spider", "bugs"};
                                // Reference: https://en.wikipedia.org/wiki/List_of_legendary_creatures_by_type
   
   private String[] greekDeity = {"Zeus","Cronus","Ares","Hephaestus","Hermes","Apollo","Dionysus","Hypnos","Uranus","Helios","Aether",
								          "Asclepius","Momus","Crius","Atlas","Eros","Prometheus","Kratos","Zelus","Coeus","Plutus","Deimos",
								          "Morpheus","Geras","Oneiros","Heperus","Hyperion","Castor","Pollux","Lapetus","Anemoi","Phobos",
							             "Phosphorus","Priapus","Moros","Phanes","Hymen","Chronos","Aristaeus","Caerus","Astraeus","Lelantos",
								          "Adonis","Zagreus","Neikea","Ourea","Porus","Ponos","Phrike","Enyalius","Palici","Anteros","Homados",
								          "Polemos","Kydoimos","Koalemos","Melicertes","Agathodaemon","Alexiares","Anicetus","Phthonus","Eleos",
								          "Nomos","Harpocrates","Aion","Phobetor","Pluto","Epiales","Lacchus","Penthus","Corus","Aegipan","Epiphron",
								          "Phantasos","Horme","Comus","Telesphorus"}; // References: https://www.google.com/search?q=list+of+greek+gods+and+goddesses&rlz=1C1KDEC_enUS870&oq=list+of+greek+gods+and&aqs=chrome.0.0j69i57j0l4.8631j0j7&sourceid=chrome&ie=UTF-8
                            
   private String[] greekLocation = {"Aeaea", "Arcadia","Athens", "Aulis","Calydon", "Colchis","Corinth", "Crete","Delphi", "Iolcus",
                                     "Ithaca", "Lerna", "Lycia", "Mount Olympus", "Nemea", "Sparta", "Tauris", "The Underworld", "Thebes",
                                     "Troy"}; // References: https://www.greekmythology.com/Myths/Places/places.html
                                     
	private String[] greekKingdom = {"Troy", ""};
	
	private String[] greekWaterBody = {"lagoon"};
   
   /**
            The game is based off of two dice, first comment is first die second is second die roll; Start with 250 health
            
 .  2  -  Walk the path               // If other roll is higher than 6 you get attacked -20hp
 .  3  -  Gather herbs in the meadow  // If less than 6 +5hp if higher than 6 +15hp, if 12 Demeter gives you a bussel of grains +45hp
 .  4  -  Go swimming in the lagoon   // If less than 7 you get attacked! -15hp if higher you find a pearl +25hp
 .  5  -  Visit the town              // if less than 4 you get a disease -35hp, if higher someone gives you a gift +25hp
 .  6  -  Visit a fae garden          // If less than 3 you made them angry -35hp, if greater than 3 they give you blessings +40hp
 .  7  -  Drink a health potion       // +50hp
 .  8  -  Visit temple of the gods    // if health is higher than 150 you've angered the gods -35hp if lower than they take pity upon you +30hp
 .  9  -  Ride a griffin              // Weeeeee!
 . 10  - Fight a wyvern              // if less than 6 -35hp
   11  -  Athena the Goddess decided to join you on your journey // if higher than 10 Ares also joins, if 12 Aphrodite gives you a kiss
 .  12  -  Fight the sworn dragon     // If second roll is less than 9 -75hp otherwise you win the fight n
**/
   public void firstRoll()
   {  	
     dice1.setRoll(dice1.roll() + dice2.roll());
     
     if(dice1.getRoll() == 1)
	  {
	      System.out.println("You take a walk through the woods and end up in " + greekLocation[randArrayLocation]);
     }
     
     else if(dice1.getRoll() == 2)
	  {
		   System.out.println("You hunt down a " + greekMonster[0]);
	  }
     
	  else if(dice1.getRoll() == 3)
	  {
		   System.out.println("The harp begins to play...");
	  }
     
	  else if(dice1.getRoll() == 4)
	  {
		   System.out.println("You arrive at " + greekKingdom[0]);
	   }
      
	  else if(dice1.getRoll() == 5)
	  {
        // rand --> if 7 < you go swimming
		  System.out.println("You go fishing in " + greekWaterBody[0]);
	  }
     
	  else if(dice1.getRoll() == 6)
	  {
		  System.out.println("You take a walk through the woods and end up in " + greekLocation[randArrayLocation]);
	  }
     
	  else if(dice1.getRoll() > 7)
	  {
        System.out.println("You approach the shimmering water as it laps on the shore...");
	  } 
     
	  else if(dice1.getRoll() == 8)
	  {
	     System.out.println("You drink a health potion.");
	  }
     
	  else if(dice1.getRoll() == 9)
	  {
		  System.out.println("You meet " + greekDeity[randArrayDeity]);
	  }
     
	  else if(dice1.getRoll() == 10)
	  {
		  System.out.println("You gather herbs in the meadow.");
	  }
     
	  else if(dice1.getRoll() == 11)
	  {
		  System.out.println("You approach an extraordinary nest...");
	  }
     
	  else // If roll is 12
	  {
         System.out.println("You have reached the boss's domain, you must fight the dragon.");
      }
	}
   
   public void secondRoll(Dice dice1, Dice dice2, Player player1, Player player2)
   {
      if(dice1.getRoll() == 2)
	   {
         dice2.setRoll(dice2.roll() + dice1.getRoll());
         
         if(dice2.getRoll() > 6)
         {
            health -= 20;
            player1.setHP(player1.getHP() - health);
         }
         else
         {
             // adventure
             health -= 5;
         }
      }
      
      if(dice1.getRoll() == 2)
	   {
         dice2.roll();
         
         if(dice2.getRoll() > 6)
         {
            health -= 20;
            player1.setHP(player1.getHP() - health);
         }
         else
         {
             // adventure
             health -= 5;
         }
      }
     
	  else if(dice1.getRoll() == 3) // If roll is 3
	  {  
         dice2.roll();
         
         if(dice2.getRoll() > 7)
         {
             System.out.println("You feel refreshed.");
             health += 15;
         }
         else
         {
             System.out.println("You pass out.");
             //random
             // if rand = 1 -> you get robbed! -10hp
             // if rand = 2 -> someone left a gold purse next to you! +15hp 
         }
	  }
     
	  else if(dice1.getRoll() == 4) // If roll is 4
	  {
         dice2.roll();
         
         if(dice2.getRoll() > 7)
         {
             System.out.println("An old woman approaches.");
             // random
             // if rand = 1 -> she gives you an old card that later brings you misfortune! -20hp
             // if rand = 2 -> she pulls out a small crystal ball and says your future looks bright! +35hp
             // if rand = 3 -> she pulls out a small crystal ball and says your future looks bleek! -35hp
             // if rand = 4 -> she pulls out a small crystal ball and says your future looks really unfortunate! +55hp
             // if rand = 5 -> she pulls out a small crystal ball and says your future looks stunning! +75hp
         }
         else
         {
             System.out.println("You get a disease.");
             health -= 45;   
         }
	   }
      
	  else if(dice1.getRoll() == 5) // If roll is 5
	  {
         dice2.roll();
         
        if(dice2.getRoll() > 7)
        {
            System.out.println("A fish bites your line!");
            health += 25;
        }
        else
        {
            System.out.println("A water hydra attacks you!");
            health -= 75;
        }
	  }
     
	  else if(dice1.getRoll() == 6) // If roll is 6
	  {
         dice2.roll();
         
        if(dice2.getRoll() > 7)
        {
            System.out.println("You get a disease.");    
        }
        else
        {
            System.out.println("You get a disease.");
        }
	  }
     
	  else if(dice1.getRoll() > 7) // If roll is 7
	  {
         dice2.roll();
         
         if(dice2.getRoll() > 7)
         {
		      System.out.println("Hunt a " + creature[randArrayCreature] + "...");
            System.out.println("You cook and eat it!");
            health += 25;
         }
         else
         {
             System.out.println("A " + greekMonster[randArrayMonster] + " attacks!");
             health -= 70;
         }
	  } 
     
	  else if(dice1.getRoll() == 8) // If roll is 8
	  {
         dice2.roll();
         
		   System.out.println("You are feeling rejuvinated!");
         health += 50;
	  }
     
	  else if(dice1.getRoll() == 9) // If roll is 9
	  {
        dice2.roll();
         
		  System.out.println("You meet " + greekDeity[randArrayDeity]);

        if(dice2.getRoll() > 7)
        {
            System.out.println("You get a disease.");
        }
        else
        {
            System.out.println(" ");
        }
	  }
     
	  else if(dice1.getRoll() == 10) // If roll is 10
	  {
        dice2.roll();
         
		  System.out.println("You gether herbs in the meadow.");

        if(dice2.getRoll() == 12)
        {
            System.out.println("Demeter crosses your path and grants you her blessing.");
            health += 77;
        }
        else if(dice2.getRoll() < 7)
        {
            System.out.println("The field is bountiful, you gather many herbs this day.");
            health += 15;
        }
        else
        {
            System.out.println("You only find a few herbs, but a " + creature[randArrayCreature] + " approaches you calmly and you pet them.");
            health += 5;
        }
	  }
     
	  else if(dice1.getRoll() == 11) // If roll is 11
	  {
        dice2.roll();

		  if(dice2.getRoll() > 7)
        {
            System.out.println("Aboard a griffin you ride ");
        }
        else
        {
            System.out.println("Fight a wyvern!");
            health -= 75;
        }
	  }
     
	  else // If roll is 12
	  {
        dice2.roll();

         if(dice2.getRoll() <= 11)
         {
            System.out.println("It strikes you down, you've lost this battle.");
            health -= 75;
         }
         else
         {
            System.out.println("You win!");
            //end game
         }
      }
	} 
}

/*

public class Game
{
   public Game()
   {
      String[] locations = {"Enchanted Forest", "Agartha", "Alfheim", "Annwn", "Asgard", "Arcadia", "Atlantis", "Avalon", "Baltia", "Brahmapura", "Camelot",
                       "Cockaigne", "Elysian Fields", "Feather Mountain", "Garden of the Hesperides", "Hyperborea", "Irkalla", "Jabulqa", "Jabulsa",
                       "Jotunheim", "Kingdom of Reynes", "Kingdom of Saguenay", "Kitezh", "Lake Svetloyar", "Kunlun Mountain", "Kvenland", "Kyöpelinvuori",
                       "Honduras", "Laestrygon", "Lake Parime", "Lemuria", "Lintukoto", "Lyonesse", "Meropis", "Mount Olympus", "Mount Penglai", "Mu",
                       "Muspelheim", "Niflheim", "Norumbega", "Nysa", "Paititi", "Pohjola", "Ram Setu", "Quivira", "Scholomance", "Himalayas", "Shambhala", 
                       "Shangri-La", "Sodom", "Gomorrah", "Suddene", "Svartalfaheimr", "Themiscyra", "Thule", "Valhalla", "Vanaheimr", "Westernesse", "Yomi",
                       "Zerzura", "Mystic Lake", "Flower Garden", "Fae Garden", "a Treehouse"};
                       // Reference: 
                 
                 
    //  String[] creatures = {"Deer Woman", "Gilled Antelope", "single peanut", "Goldhorn", "Bake-kujira", "Ceffyl Dwr", "Encantado", "Kelpie", "Kushtaka", "Selkie",
    //                   "Anansi", "Arachne", "Khepri", "Tsuchigumo", "Mymecoleon", "Myrmidons", "Chupacabra", "Camazotz", "Vetala", "Bugbear", "Callisto", "Adarna",
    //                   "Aethon", "Alkonost", "Alicanto", "Hoodwink", "Chamrosh", "Banshee", "Griffin", "Harpy", "Hræsvelgr", "Allocamelus", "Adlet", "Amarok",
    //                   "Asena", "Black Dog", "Beast of Gevaudan", "Cerberus", "Scorpion", "Itsumade", "Hawk", "Eagle", "Scorpion", "Giant Spider", "bugs"};
                       // Reference: https://en.wikipedia.org/wiki/List_of_legendary_creatures_by_type


      String[] deity = {"Athena", "Ares", "Apollo", "Aphrodite", "Buddha", "Zeus", "Shiva", "Cronos", "Apollo", "Horus", "Krishna", "Odin", "Thor", "Prometheus", 
                        "Trinity", "Re", "Dionysus", "Hades", "Cronus", "Artemis", "Muse", "Anubis", "Vishnu", "Osiris", "Heracles", "Kali", "Persephone", "Loki", 
                        "Hermes", "Baccus", "Fenrir", "Achelous", "Aeolus", "Aether", "Alastor", "Apollo", "Set", "Asclepius", "Atlas", "Attis", "Boreas", "Caerus",
                        "Castor", "Cerus", "Chaos", "Charon", "Crios", "Cronus", "Dinlas", "Deimos", "Dionysus", "Erebus", "Eros", "Eurus", "Glaucus", "Helios", "Hephaestus",
                        "Heracles", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                        // References: https://www.britannica.com/topic-browse/Religion/Spiritual-Beings-and-Deities
                                    // https://greekgodsandgoddesses.net/gods/             

   }
}

            The game is based off of two dice, first comment is first die second is second die roll; Start with 250 health
            
   2  -  Walk the path               // If other roll is higher than 6 you get attacked -20hp
   3  -  Gather herbs in the meadow  // If less than 6 +5hp if higher than 6 +15hp, if 12 Demeter gives you a bussel of grains +45hp
   4  -  Go swimming in the lagoon   // If less than 7 you get attacked! -15hp if higher you find a pearl +25hp
   5  -  Visit the town              // if less than 4 you get a disease -35hp, if higher someone gives you a gift +25hp
   6  -  Visit a fae garden          // If less than 3 you made them angry -35hp, if greater than 3 they give you blessings +40hp
   7  -  Drink a health potion       // +50hp
   8  -  Visit temple of the gods    // if health is higher than 150 you've angered the gods -35hp if lower than they take pity upon you +30hp
   9  -  Ride a griffin              // Weeeeee!
   10  - Fight a wyvern              // if less than 6 -35hp
   11  -  Athena the Goddess decided to join you on your journey // if higher than 10 Ares also joins, if 12 Aphrodite gives you a kiss
   12  -  Fight the sworn dragon     // If second roll is less than 9 -75hp otherwise you win the fight n

             
// If location is the Garden of the Hesperides, you win
// If location = Quivira +75hp, Scholomance -66hp
// If location is Irkalla, you lose
for (rollFirst == 2)
{
   if(rollSecond > 6)
   {
	System.out.println("You have been attacked by a " + creature + " and you have lost 20 health points!");
	Player.currentHP = Player.currentHP - 20hp;
   }
   else
   {
	System.out.println("You made it safely to " + location);
   }
}

for (rollFirst == 3)
{
   if(rollSecond < 6)
   {
	System.out.println("You have gathered a few herbs. +5hp");
	Player.currentHP = Player.currentHP + 5;
   }
   else if(rollSecond > 6)
   {
	System.out.println("You have gathered many herbs. +15hp");
	Player.currentHP = Player.currentHP + 15;
   }
   else if(rollSecond == 12)
   {
	System.out.println("Demeter grants you her blessings for your gatherings. +45hp");
	Player.currentHP = Player.currentHP + 45;
   }
}

for (rollFirst == 4)
{
   if(rollSecond < 7)
   {
	System.out.println("You have been attacked by a " + creature + " and you have lost 15 health points!");
	Player.currentHP = Player.currentHP - 15;
   }
   else
   {
	System.out.println("You found a pearl whilst swimming in the lagoon. +25hp");
	Player.currentHP = Player.currentHP + 25;
   }
}

for (rollFirst == 5)
{
   if(rollSecond < 4)
   {
	System.out.println("You have contracted a disease while walking through town, you have lost 35 health points!");
	Player.currentHP = Player.currentHP - 35;
   }
   else
   {
	System.out.println("While walking through town, a townsfolk grants you a gift. +25hp");
	Player.currentHP = Player.currentHP + 25;
   }
}

for (rollFirst == 6)
{
   if(rollSecond < 3)
   {
	System.out.println("You have made the fae angry, you have lost 35 health points!");
	Player.currentHP = Player.currentHP - 35;
   }
   else
   {
	System.out.println("The fae grant you their blessings for visiting their garden. +40hp");
	Player.currentHP = Player.currentHP + 40;
   }
}

for (rollFirst == 7)
{
   System.out.println("You found a health potion! +50hp");
   Player.currentHP = Player.currentHP + 50;
}

for (rollFirst == 8)
{
   if(playerHealth > 150)
   {
	System.out.println("You have angered the gods and you have lost 35 health points!");
	Player.currentHP = Player.currentHP - 35;
   }
   else
   {
	System.out.println("The gods have taken pity upon you. +30hp");
	Player.currentHP = Player.currentHP + 30;
   }
}

for (rollFirst == 9)
{
   System.out.println("You take a ride on the back of a griffin. Weeeeee!");
}

for (rollFirst == 10)
{
   if(rollSecond > 6)
   {
	System.out.println("You have been attacked by a wyvern and you have lost 35 health points!");
	Player.currentHP = Player.currentHP - 35;
   }
}

for (rollFirst == 11)
{
   if(rollSecond > 6)
   {
	System.out.println("You have been attacked by a " + creature + " and you have lost 75 health points!");
	Player.currentHP = Player.currentHP - 75;
   }
   else
   {
	System.out.println("You made it safely to " + location);
   }
}

for (rollFirst == 12)
{
   if(rollSecond > 6)
   {
	System.out.println("You have gone head to head to battle the sworn dragon and you have lost 75 health points!");
	Player.currentHP = Player.currentHP - 75;
   }
   else
   {
	System.out.println("You beat the dragon and saved the kingdom! You win!");
   }
}

*/