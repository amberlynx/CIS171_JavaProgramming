/**
 *       In Class Lecture Program: Address Program
 *       Description: This code demonstrates agregation 
 *       Link: --
 *       Email: alsakkinen@hawkmail.hfcc.edu
 *       Written by Amber Sakkinen, started September 16th, 2019
 *       Last Edited: 9.16.19
**/
public class Address
{
   private String street;
   private String city;
   private String state;
   private String zipCode;
   
   public Address(String street, String city, String state, String zipCode)
   {
      this.street = street;
      this.city = city;
      this.state = state;
      this.zipCode = zipCode;
   }
   
   public String toString()
   {
      String str = "Address: " + street + " City: " + city + ", " + zipCode + " State: " + state;
      return str;
   }
}