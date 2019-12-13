class Personal extends Contact // Personal contacts include friends, family, and nonformal relationships
{
   private String relationship;
   
   public Personal()
   {
      String nPrefix = "Ms.";
      String nFirst = "Jane";
      String nMiddle = "Louran";
      String nLast = "Doe";
      String nSuffix = "Jr.";
      String pMobile = "456-456-3776";
      String pHome = "134-123-3567";
      String pager = "--";
      String pOther = "--";
      fax = "123123";
      birthday = "11.11.99";
      email = "janedoe@gmail.com";
      address = "1233 Old Road";
      String importantDate = "11.22.29";
      notes = "I met her today";
      relationship = "Friend";
   }
   
   public Personal(String prefix, String firstname, String middlename, String lastname, String suffix, String mobile, String home, String pgr, String other, String fax, String birthday, String email, String address, String importantdate, String notes, String relationship)
   {
      nPrefix = prefix;
      nFirst = firstname;
      nMiddle = middlename;
      nLast = lastname;
      nSuffix = suffix;
      pMobile = mobile;
      pHome = home;
      pager = pgr;
      pOther = other;
      fax = fax;
      birthday = birthday;
      email = email;
      address = address;
      importantDate = importantdate;
      this.notes = notes;
      relationship = relationship;
   }
   
   String getRelationship() { return relationship; }
   void setRelationship(String r){ relationship = r; }
   
   @Override public String toString() {
      String str="";
      return str = "Personal: " + nFirst + " " + nLast + "   Mobile Phone: " + pMobile + "   Home Phone: " + pHome;
   }
}