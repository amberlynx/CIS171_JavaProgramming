public class Ticket {

   private Officer officer;
   private Car vehicle;
   private Meter meter;
   private double fine = 25;
   
   Ticket(Officer p, Car c, Meter m){
   
      officer = p;
      vehicle = c;
      meter = m;
   
   }
   
   public void createTicket(){
   
      int minutesParked = meter.getMeterTime();
      int minutesPaid = meter.getPurchasedTime();
      int minutesOver = minutesParked - minutesPaid;
      
      while(minutesOver - 60 > 0){
         fine += 10;
         minutesOver -= 60;
      }
   }
   
   public String toString(){
      
      String str = "Ticket:\nVehicle Model: " + vehicle.getModel() + "\nVehicle Make: " + vehicle.getMake() + "\nLicence Plate: " + vehicle.getPlateNum() + "\nMinutes Paid: " + meter.getPurchasedTime() + "\nMinutes Parked: " + meter.getMeterTime() + "\nFine: " + fine + "\nAssigned By: " + officer.getName() + "\nBadge Number: " + officer.getBadgeNum();
      return str;
   }

}