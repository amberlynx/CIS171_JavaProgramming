import java.util.ArrayList;
import java.util.Scanner;
public class ContactList
{  
   private static ArrayList<Contact> lstContact = new ArrayList<Contact>();
   static Personal pcontact = new Personal();
   static Business bcontact = new Business();
   
   interface Message { void print(String message); } 
   private void deleteContact(String input) { if(lstContact.contains(input)) { lstContact.remove(input); } }
   
   private void viewList() 
   { 
      for(int x=0; x < lstContact.size(); ++x) { System.out.println(lstContact.get(x)); } 
      if(lstContact.isEmpty()) { System.out.println("There are no contacts to view."); }
   }
   
   private void editContact(String contact)
   {
      String field, input, cfname, clname; int selection=0;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Would you like to edit a personal or business contact?");
         contact = scan.nextLine();
      System.out.println("What is the first name of your " + contact + " contact?");
         cfname = scan.nextLine();
      System.out.println("What is the last name of your " + contact + " contact?");
         clname = scan.nextLine();
      System.out.println("Please enter a field you would like to edit:");
         field = scan.nextLine();
      
      if(field == "prefix") { selection = 1; }
      if(field == "firstname") { selection = 2; }
      if(field == "middlename") { selection = 3; }
      if(field == "lastname") { selection = 4; }
      if(field == "suffix") { selection = 5; }
      if(field == "mobile") { selection = 6; }
      if(field == "home") { selection = 7; }
      if(field == "pager") { selection = 8; }
      if(field == "other") { selection = 9; }
      if(field == "fax") { selection = 10; }
      if(field == "birthday") { selection = 11; }
      if(field == "email") { selection = 12; }
      if(field == "address") { selection = 13; }
      if(field == "importantdate") { selection = 14; }
      if(field == "notes") { selection = 15; }
      if(field == "relationship") { selection = 16; }
      if(field == "title") { selection = 17; }
      if(field == "department") { selection = 18; }
      if(field == "company") { selection = 19; }
      if(field == "work") { selection = 20; }
      if(field == "callback") { selection = 21; }
      if(field == "webaddress") { selection = 22; }
      
      if(contact.equals("personal") || contact.equals("Personal") || contact.equals("PERSONAL") || contact.equals("p"))
      {
         if(pcontact.getFirstName() == cfname && pcontact.getLastName() == clname) {
            switch(selection)
            {
               case 1:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setPrefix(input);
               break;
      
               case 2:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setFirstName(input);
               break;
               
               case 3:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setMiddleName(input);
               break;
      
               case 4:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setLastName(input);
               break;
               
               case 5:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setSuffix(input);
               break;
               
               case 6:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setMobile(input);
               break;     
               
               case 7:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setHome(input);
               break;
               
               case 8:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setPager(input);
               break; 
               
               case 9:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setOther(input);
               break;
                      
               case 10:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setFax(input);
               break;
               
               case 11:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setBirthday(input);        
               break;
               
               case 12:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setEmail(input);        
               break;
               
               case 13:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setAddress(input);        
               break;
               
               case 14:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setImportantDate(input);        
               break;
               
               case 15:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setNotes(input);        
               break;
               
               case 16:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               pcontact.setRelationship(input);
               break;
            }  
         }
      }     
      else if(contact.equals("business") || contact.equals("Business") || contact.equals("BUSINESS") || contact.equals("b"))
      {
         if(bcontact.getFirstName() == cfname && bcontact.getLastName() == clname) {
            switch(selection)
            {
               case 1:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setPrefix(input);
               break;
      
               case 2:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setFirstName(input);
               break;
               
               case 3:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setMiddleName(input);
               break;
      
               case 4:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setLastName(input);
               break;
               
               case 5:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setSuffix(input);
               break;
               
               case 6:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setMobile(input);
               break;     
               
               case 7:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setHome(input);
               break;
               
               case 8:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setPager(input);
               break; 
               
               case 9:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setOther(input);
               break;
                      
               case 10:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setFax(input);
               break;
               
               case 11:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setBirthday(input);        
               break;
               
               case 12:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setEmail(input);        
               break;
               
               case 13:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setAddress(input);        
               break;
               
               case 14:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setImportantDate(input);        
               break;
               
               case 15:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setNotes(input);        
               break;
               
               case 17:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setTitle(input);
               break;
               
               case 18:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setDepartment(input);
               break;
               
               case 19:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setCompany(input);
               break;
               
               case 20:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setWorkPhone(input);
               break;
               
               case 21:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setCallback(input);
               break;
               
               case 22:
               System.out.println("Please enter the new data for this field:" + selection);
               input = scan.nextLine();
               bcontact.setWebAddress(input);
               break;
            }
         }
      }
   }
   
   // Main Program
   public static void main(String [] args)
   {
      ContactList lst = new ContactList();
      Scanner scan = new Scanner(System.in);
      Message m = message -> System.out.println(message);
      String selection="", input;
      boolean quit=false;
      m.print("Welcome to your new contact list!");
      
      do 
      {
         m.print("\nPlease make a selection: View, Add, Edit, Delete, Quit");
         selection = scan.nextLine();
         
         if(selection.equals("view") || selection.equals("View") || selection.equals("VIEW") || selection.equals("v")) 
         { 
            m.print("\nOpening contact list..\n");
            lst.viewList();
         }
         else if(selection.equals("add") || selection.equals("Add") || selection.equals("ADD") || selection.equals("a"))
         {
            m.print("\nAdd contact selected.\n");
            m.print("Would you like to add a personal or business contact?");
            selection = scan.nextLine();
            
            if(selection.equals("personal") || selection.equals("Personal") || selection.equals("PERSONAL") || selection.equals("p"))
            {
               m.print("Please enter a prefix:");
               String prefix = scan.nextLine();
               pcontact.setPrefix(prefix);
               m.print("First name:");
               String firstname = scan.nextLine();
               pcontact.setFirstName(firstname);
               m.print("Middle name:");
               String middlename = scan.nextLine();
               pcontact.setMiddleName(middlename);
               m.print("Last name:");
               String lastname = scan.nextLine();
               pcontact.setLastName(lastname);
               m.print("Suffix:");
               String suffix = scan.nextLine();
               pcontact.setSuffix(suffix);
               m.print("Mobile phone number:");
               String mobile = scan.nextLine();
               pcontact.setMobile(mobile);
               m.print("Home phone number:");
               String home = scan.nextLine();
               pcontact.setHome(home);
               m.print("Pager:");
               String pgr = scan.nextLine();
               pcontact.setPager(pgr);
               m.print("Other phone number:");
               String other = scan.nextLine();
               pcontact.setOther(other);
               m.print("Fax:");
               String fax = scan.nextLine();
               pcontact.setFax(fax);
               m.print("Birthday:");
               String birthday = scan.nextLine();
               pcontact.setBirthday(birthday);
               m.print("Email:");
               String email = scan.nextLine();
               pcontact.setEmail(email);
               m.print("Address:");
               String address = scan.nextLine();
               pcontact.setAddress(address);
               m.print("Please enter a important date to remember about this contact:");
               String importantdate = scan.nextLine();
               pcontact.setImportantDate(importantdate);
               m.print("Notes:");
               String notes = scan.nextLine();
               pcontact.setNotes(notes);
               m.print("Relationship:");
               String relationship = scan.nextLine();
               pcontact.setRelationship(relationship);
               // System.out.println(pcontact.toString());
               lstContact.add(pcontact);
               
            }
            else if(selection.equals("business") || selection.equals("Business") || selection.equals("BUSINESS") || selection.equals("b"))
            {
               m.print("Please enter a prefix:");
               String prefix = scan.nextLine();
               bcontact.setPrefix(prefix);
               m.print("First name:");
               String firstname = scan.nextLine();
               bcontact.setFirstName(firstname);
               m.print("Middle name:");
               String middlename = scan.nextLine();
               bcontact.setMiddleName(middlename);
               m.print("Last name:");
               String lastname = scan.nextLine();
               bcontact.setLastName(lastname);
               m.print("Suffix:");
               String suffix = scan.nextLine();
               bcontact.setSuffix(suffix);
               m.print("Mobile phone number:");
               String mobile = scan.nextLine();
               bcontact.setMobile(mobile);
               m.print("Home phone number:");
               String home = scan.nextLine();
               bcontact.setHome(home);
               m.print("Pager:");
               String pgr = scan.nextLine();
               bcontact.setPager(pgr);
               m.print("Other phone number:");
               String other = scan.nextLine();
               bcontact.setOther(other);
               m.print("Fax:");
               String fax = scan.nextLine();
               bcontact.setFax(fax);
               m.print("Birthday:");
               String birthday = scan.nextLine();
               bcontact.setBirthday(birthday);
               m.print("Email:");
               String email = scan.nextLine();
               bcontact.setEmail(email);
               m.print("Address:");
               String address = scan.nextLine();
               bcontact.setAddress(address);
               m.print("Please enter a important date to remember about this contact:");
               String importantdate = scan.nextLine();
               bcontact.setImportantDate(importantdate);
               m.print("Notes:");
               String notes = scan.nextLine();
               bcontact.setNotes(notes);
               m.print("Job title:");
               String title = scan.nextLine();
               bcontact.setTitle(title);
               m.print("Department:");
               String dept = scan.nextLine();
               bcontact.setDepartment(dept);
               m.print("Company:");
               String company = scan.nextLine();
               bcontact.setCompany(company);
               m.print("Work phone number:");
               String work = scan.nextLine();
               bcontact.setWorkPhone(work);
               m.print("Callback number:");
               String callback = scan.nextLine();
               bcontact.setCallback(callback);
               m.print("Web address:");
               String web = scan.nextLine();
               bcontact.setWebAddress(web);
               // System.out.println(bcontact.toString());
               lstContact.add(bcontact);
            }
         }
         else if(selection.equals("edit") || selection.equals("Edit") || selection.equals("EDIT") || selection.equals("e"))
         {
            m.print("Edit contact selected.\n");
            m.print("Enter the name of the contact you would like to edit:");
            selection = scan.nextLine();
            lst.editContact(selection);
         }
         else if(selection.equals("delete") || selection.equals("Delete") || selection.equals("DELETE") || selection.equals("d"))
         {
            m.print("Delete contact selected.\n");
            m.print("Enter the name of the contact you would like to delete:");
            selection = scan.nextLine();
            lst.deleteContact(selection);
         }
         else if(selection.equals("quit") || selection.equals("Quit") || selection.equals("QUIT") || selection.equals("q")) 
         {
            m.print("Your contacts will not be saved, are you sure you want to quit? Enter no if you would like to continue.");
            selection = scan.nextLine();
            
            if(selection.equals("no") || selection.equals("No") || selection.equals("NO") || selection.equals("n")) { quit = false; }
            else { m.print("Goodbye!"); quit = true; }
         }
         else 
         { 
            m.print("No selection made, opening contact list..\n"); 
            if(lstContact.isEmpty()) { m.print("There are no contacts to view."); }
            else { lst.viewList(); }
         }
           
      } while(quit == false);
   }
}

/* Junk Drawer

if(selection.equals("call") || selection.equals("Call") || selection.equals("CALL") || selection.equals("c"))
{
   m.print("\nEnter the number of the contact you would like to call:");
   String contact = scan.nextLine();
   lst.callContact(contact);
}

private String callContact(String contact)
{
   if(contact.matches(lstContact))
   {
      return System.out.println("Dialing " + lstContact.getName() + " at " + lstContact.getNumber() +"...");
   }
   else { System.out.println("Dialing " + contact + "..."); }
   return "";
}
*/