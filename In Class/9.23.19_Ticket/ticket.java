public class ticket
{
   private double fine;
   private String ticketDate;
   private int overdue;
   private int meterTime;
   
   //** Gets */
   public String getMake() { return make; }
   public String getModel() { return model; }   
   public String getColor() { return color; }
   public String getLicensePlateNum() { return license; }
   public String getMeterNum() { return meterNum; }
   public String getMeterTime() { return meterTime; }
   public String getPoliceName() { return officerName; }
   public String getPoliceBadge() { return badge; }
   
   //** Calculate time  */
   for(meterTime > meter.purchasedTime)
   {
      if(meterTime < 60)
      {
         fine += 25.00;
      }
      else
      {
         fine += 10.00;
      }
      
    }
   
   //** Constructor */
   public ticket(double f, String td, int od)
   {
      fine = f;
      ticketDate = td;
      overdue = od;
   }  
   
   //** Utility Methods */
   public String toString()
   {
      String ticketInfo = "TICKET ISSUE DATE: " + ticketDate +
                          "\n CAR INFORMATION \n Make: " + car.make +
                          "\t Model: " + car.model + "\n Color: " + car.color +
                          "\t License Plate Number: " + car.license +
                          "\n METER INFORMATION AT TIME OF TICKET" +
                          "\n Meter Number: " + meter.meterNum +
                          "\n Time overdue: " + overdue +
                          "\n\n OFFICER: " + officer.officerName +
                          "\n Badge Number: " + officer.badge;
	   return ticketInfo;
   }
}






   //** Sets
 //  public void setMake(String make){ this.make = make; }
 //  public void setModel(String model){ playerColor = c; }
 //  public void setColor(String color){ score = s; }
 //  public void setLicensePlateNum(int license){ highscore = hs; }
 //  public void setMeterNum(int meterNum){ currentHP = hp; }
  // public void setMeterTime(int meterTime) { currentHP = startHealth; }
//   public void setPoliceName(String officerName) { currentHP = startHealth; }
//   public void setPoliceBadge(String badge) { currentHP = startHealth; }
   