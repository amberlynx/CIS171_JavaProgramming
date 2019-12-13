/**
 *       Homework Program: Patient Charges Program - Procedure Class
 *       Description: This code creates a class for a medical procedure.
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen, started September 4th, 2019
 *       Last Edited: 9.10.19
 *       Key: proc = procedure
**/
public class Procedure
{
   private String procName;         // Name of Procedure
	private String procDate;         // Date of Procedure
	private String procPractitioner; // Name of Practitioner who performed Procedure
	private double procCharges;      // Charges for Procedure
   
   public Procedure()
   {
      
   }
   public Procedure(String pn, String pd, String pp, double pc)
   {
     procName = pn;
     procDate = pd;
     procPractitioner = pp;
     procCharges = pc;
   }
      
   public String getProcName(){ return procName; }
	public void setProcName(String pn) 
	{
      procName = pn;
	}
   
   public String getProcDate(){ return procDate; }
	public void setProcDate(String pd) 
	{
      procDate = pd;
	}
   
   public String getProcPractitioner(){ return procPractitioner; }
	public void setProcPractitioner(String pp) 
	{
      procPractitioner = pp;
	}
   
   public double getProcCharges(){ return procCharges; }
	public void setProcCharges(double pc) 
	{
      procCharges = pc;
	}
}