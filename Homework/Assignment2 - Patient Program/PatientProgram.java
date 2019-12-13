/**
 *       Homework Program: Patient Charges Program - Main Application
 *       Description: This code uses patient information to determine charges for a treatment.
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen, started September 4th, 2019
 *       Last Edited: 9.11.19
**/
import java.util.Scanner;

public class PatientProgram
{
   public static void main(String [] args)
   {
	  String nFirst;
	  String nMiddle;
	  String nLast;
	  String pAddress;
	  String pCity;
	  String pState;
	  String pZipcode;
	  String pPhone;
	  String eContact;
	  String eContactphn;
     String holdEnter;
     Scanner input = new Scanner(System.in);
     Patient infoPatient = new Patient();
	  Procedure firstProcedure = new Procedure();
	  Procedure secondProcedure = new Procedure();
	  Procedure thirdProcedure = new Procedure();
	  
     System.out.println("Enter patient first name: ");
     nFirst = input.nextLine();
     infoPatient.setnFirst(nFirst);
      
     System.out.println("Enter patient middle name: ");
	  nMiddle = input.nextLine();
     infoPatient.setnMiddle(nMiddle);
     
     System.out.println("Enter patient last name: ");
     nLast = input.nextLine();
     infoPatient.setnLast(nLast);
      
	  System.out.println("Enter patient street address: ");
	  pAddress = input.nextLine();
     infoPatient.setAddress(pAddress);
     
	  System.out.println("Enter patient city: ");
	  pCity = input.nextLine();
     infoPatient.setCity(pCity);
     
	  System.out.println("Enter patient state: ");
	  pState = input.nextLine();
     infoPatient.setState(pState);
     
	  System.out.println("Enter patient zipcode: ");
	  pZipcode = input.nextLine();
     infoPatient.setZip(pZipcode);
     
	  System.out.println("Enter patient phone number: ");
	  pPhone = input.nextLine();
     infoPatient.setphnMain(pPhone);
     
	  System.out.println("Enter emergency contact name: ");
	  eContact = input.nextLine();
     infoPatient.setICEContact(eContact);
     
	  System.out.println("Enter emergency contact phone number: ");
	  eContactphn = input.nextLine();
     infoPatient.setICEContactphn(eContactphn);
	  
	  firstProcedure.setProcName("Physical Examination");
	  firstProcedure.setProcDate("9.10.19");
	  firstProcedure.setProcPractitioner("Dr.Jones");
	  firstProcedure.setProcCharges(250.00);
	  
	  secondProcedure.setProcName("X-ray");
	  secondProcedure.setProcDate("9.11.19");
	  secondProcedure.setProcPractitioner("Dr.Hamood");
	  secondProcedure.setProcCharges(500.00);
	  
	  thirdProcedure.setProcName("Blood Test");
	  thirdProcedure.setProcDate("9.11.19");
	  thirdProcedure.setProcPractitioner("NP Reginardo");
	  thirdProcedure.setProcCharges(200.00);
  
     double totalCharges = firstProcedure.getProcCharges() + secondProcedure.getProcCharges() + thirdProcedure.getProcCharges();
	  
	  System.out.println("Patient: " + infoPatient.getnFirst() + " " + infoPatient.getnMiddle() + " " + infoPatient.getnLast());
	  System.out.println("Patient Address: " + infoPatient.getAddress() + " " + infoPatient.getCity() + ", " + infoPatient.getZip() + ", " + infoPatient.getState());
	  System.out.println("Patient Phone: " + infoPatient.getphnPatient());
	  System.out.println("Emergency Contact Information: " + infoPatient.getICEContact() + "  ICE Phone Number: " + infoPatient.getICEContactphn());
	  System.out.println("\n First Procedure: " + firstProcedure.getProcName() + ", " + firstProcedure.getProcDate() + ", " + firstProcedure.getProcPractitioner() + ", $" + firstProcedure.getProcCharges());
	  System.out.println(" Second Procedure: " + secondProcedure.getProcName() + ", " + secondProcedure.getProcDate() + ", " + secondProcedure.getProcPractitioner() + ", $" + secondProcedure.getProcCharges());
	  System.out.println(" Third Procedure: " + thirdProcedure.getProcName() + ", " + thirdProcedure.getProcDate() + ", " + thirdProcedure.getProcPractitioner() + ", $" + thirdProcedure.getProcCharges());
	  System.out.println("   Total Charges:   $" + totalCharges);
   }
}