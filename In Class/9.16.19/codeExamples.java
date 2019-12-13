/**
 *       In Class Lecture Program: Code Examples
 *       Description: These are just basic examples that were on the board
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen, started September 16th, 2019
 *       Last Edited: 9.16.19
**/

int age=100;
boolean isAdult= false;
isAdult = (age>=18) ? true : false; // This segment after ? does what the below code does ex1.1
System.out.println("Adult?" + ((age>=18) ? "yes" : "no"));

// ex1.1, either this or that; small stuff
if(age >= 18)
   isAdult = true;
else 
   isAdult = false;

switch(expression)
{
   case "Jan" case 20: case 30:
   break;
   default:
}