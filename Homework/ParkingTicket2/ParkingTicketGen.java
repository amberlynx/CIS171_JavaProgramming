public class ParkingTicketGen
{
   public static void main(String[] args)
   {
      Officer myOfficer = new Officer();
      Meter myMeter = new Meter();
      Car myCar = new Car("Ford","Focus","Steel","COOL345");
      Ticket myTicket = new Ticket(myOfficer, myCar, myMeter);
   
   
   }




}