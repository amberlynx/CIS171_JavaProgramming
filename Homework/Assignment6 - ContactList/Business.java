class Business extends Contact // Business contacts include work, and any formal relations 
{
   private String title, department, company, pWork, pCallback, webAddress;
   
   public Business()
   {
      nPrefix = "Ms.";
      nFirst = "Jane";
      nMiddle = "Louran";
      nLast = "Doe";
      nSuffix = "Jr.";
      pMobile = "456-456-3776";
      pHome = "134-123-3567";
      pager = "--";
      pOther = "--";
      this.fax = "123123";
      this.birthday = "11.11.99";
      this.email = "janedoe@gmail.com";
      this.address = "1233 Old Road";
      importantDate = "11.22.29";
      this.notes = "I met her today";
      title = "CEO";
      department = "Head";
      company = "Boss Lady Inc.";
      pWork = "111-222-5534";
      pCallback = "000-111-1111";
      webAddress = "bosslady.com";
   }
   
   public Business(String prefix, String firstname, String middlename, String lastname, String suffix, String mobile, String home, String pgr, String other, String fax, String birthday, String email, String address, String importantdate, String notes, String title, String dept, String company, String work, String callback, String web)
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
      this.fax = fax;
      this.birthday = birthday;
      this.email = email;
      this.address = address;
      importantDate = importantdate;
      this.notes = notes;
      this.title = title;
      department = dept;
      this.company = company;
      pWork = work;
      pCallback = callback;
      webAddress = web;
   }
   
   String getTitle() { return title; }
   String getDepartment() { return department; }
   String getCompany() { return company;}
   String getWork() { return pWork; }
   String getCallback() { return pCallback; }
   String getWebAddress() { return webAddress; }
   
   void setTitle(String t) { title = t; }
   void setDepartment(String d) { department = d; }
   void setCompany(String c) { company = c; }
   void setWorkPhone(String wp) { pWork = wp; }
   void setCallback(String cb) { pCallback = cb; }
   void setWebAddress(String wa) { webAddress = wa; }
   
   @Override public String toString() {
      String str="";
      return str = "Business: " + nFirst + " " + nLast + "   Mobile Phone: " + pMobile + "   Home Phone: " + pHome;
   }
}