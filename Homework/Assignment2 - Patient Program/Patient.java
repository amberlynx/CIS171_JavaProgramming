/**
 *       Homework Program: Patient Charges Program - Patient Class
 *       Description: This code creates a class for patient information.
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen, started September 4th, 2019
 *       Last Edited: 9.10.19
**/
public class Patient
{
	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String phnPatient;
	private String iceContact;
	private String phniceContact;
	
   public Patient()
   {
      
   }
   public Patient(String nf, String nm, String nl, String ad, String cy, String st, String zc, String phnp, String ic, String phnic)
   {
     nameFirst = nf;
     nameMiddle = nm;
     nameLast = nl;
     address = ad;
     city = cy;
     state = st;
     zipcode = zc;
     phnPatient = phnp;
     iceContact = ic;
     phniceContact = phnic;
   }
      
	public String getnFirst(){ return nameFirst; }
	public void setnFirst(String nf) 
	{
      nameFirst = nf;
	}
   
	public String getnMiddle(){ return nameMiddle; }
	public void setnMiddle(String nm) 
	{
      nameMiddle = nm;
	}
   
	public String getnLast(){ return nameLast; }
	public void setnLast(String nl) 
	{
      nameLast = nl;
	}
   
	public String getAddress(){ return address; }
	public void setAddress(String ad) 
	{
      address = ad;
	}
   
	public String getCity(){ return city; }
	public void setCity(String cy) 
	{
      city = cy;
	}
   
	public String getState(){ return state; }
	public void setState(String st) 
	{
      state = st;
	}
   
	public String getZip(){ return zipcode; }
	public void setZip(String zc) 
	{
      zipcode = zc;
	}
   
	public String getphnPatient(){ return phnPatient; }
	public void setphnMain(String phnp) 
	{
      phnPatient = phnp;
	}
   
	public String getICEContact(){ return iceContact; }
	public void setICEContact(String ic) 
	{
      iceContact = ic;
	}
   
	public String getICEContactphn(){ return phniceContact; }
	public void setICEContactphn(String phnic) 
	{
      phniceContact = phnic;
	}
}