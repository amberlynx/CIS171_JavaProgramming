abstract class Contact 
   { /* TOADD: Picture, Ringtone */ 
      String nPrefix, nFirst, nMiddle, nLast, nSuffix, pMobile, pHome, pager, pOther, fax, birthday, email, address, importantDate, notes; 
      
      String getPrefix() { return nPrefix; }
      String getFirstName() { return nFirst; }
      String getMiddleName() { return nMiddle;}
      String getLastName() { return nLast; }
      String getSuffix() { return nSuffix; }
      String getMobile() { return pMobile; }
      String getHome() { return pHome; }
      String getPager() { return pager; }
      String getOther() { return pOther;}
      String getFax() { return fax; }
      String getBirthday() { return birthday; }
      String getEmail() { return email; }
      String getAddress() { return address; }
      String getImportantDate() { return importantDate; }
      String getNotes() { return notes; }
      
      void setPrefix(String pre) { nPrefix = pre; }
      void setFirstName(String f) { nFirst = f; }
      void setMiddleName(String m) { nMiddle = m; }
      void setLastName(String l) { nLast = l; }
      void setSuffix(String s) { nSuffix = s; }
      void setMobile(String pm) { pMobile = pm; }
      void setHome(String ph) { pHome = ph; }
      void setPager(String p) { pager = p; }
      void setOther(String po) { pOther = po; }
      void setFax(String f) { fax = f; }
      void setBirthday(String b) { birthday = b; }
      void setEmail(String e) { email = e; }
      void setAddress(String a) { address = a; }
      void setImportantDate(String id) { importantDate = id; }
      void setNotes(String n) { notes = n; }
   }