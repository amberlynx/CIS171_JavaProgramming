/**

Password Program
Author: Amber Sakkinen <alsakkinen@hawkmail.hfcc.edu>
Description: This is a password requirement verification program.
Created: 10.8.19
Last Edited: 10.20.19

**/
import java.util.Scanner;
public class Password
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
		boolean validate = false;
		boolean verifyLength = false;
		boolean verifyUpper = false;
		boolean verifyLower = false;
		boolean verifyNumber = false;
		boolean verifySpecial = false;
      boolean restrictYear = false;
      char c;
      int x=0;
      int year=0;
		
	   do{

		   System.out.println("Password Requirements: \n");
	      System.out.println("Over 10 Characters");
		   System.out.println("One Lower Case Letter");
		   System.out.println("One Number");
			System.out.println("One Special Character  \n");
						   
	      System.out.println("Please enter a password:");
		   String pswrd = input.nextLine();
         
		   if(pswrd.length()>=10 && pswrd.length()<=35) { verifyLength = true; }
         else { verifyLength = false; }
      
         for(x=0; x < pswrd.length() - 1; x++)
         {
            c = pswrd.charAt(x);
            if(Character.isDigit(c))
            {        
               verifyNumber = true;
            }
            else if(Character.isUpperCase(c))
            { 
               verifyUpper = true;
            }
            else if(Character.isLowerCase(c))
            { 
               verifyLower = true;
            }
            else
            {
               verifySpecial = true;
            }
            
            // Check for 4 digits in a row
            if(year >= 1950 && year <= 2020) { restrictYear = true; } // Check for year - not functional    
          }
		
	      if(verifyLength == true && verifyUpper == true && verifyLower == true && verifyNumber == true && verifySpecial == true && restrictYear == false)
		   {
			   System.out.println("Password has been accepted!");
			   validate = true;
		   }
		   else
		   {
			   System.out.println("Password unacceptable. Please try again.");
			   validate = false;
		   }
         
	   } while(validate == false);  
   }
}