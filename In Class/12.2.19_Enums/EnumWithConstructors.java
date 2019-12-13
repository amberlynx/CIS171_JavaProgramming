enum Weekdays
{
   SUNDAY("Sunday Relax", true),
   MONDAY("Mondays Stink!"),
   TUESDAY("Tuesday"),
   WEDNESDAY("Wednesday, halfway there!"),
   THURSDAY("Thursday"),
   FRIDAY("Friday fun day!"),
   SATURDAY("Saturday, sleep in!", true);
   
   private String daysGreeting;
   private boolean isWeekend;
   
   // 2 constructors = overloading
   Weekdays(final String greeting) { daysGreeting = greeting; }
   Weekdays(final String greeting, final boolean weekend)
   {
      daysGreeting = greeting;
      isWeekend = weekend;
   }
   
   public String getGreeting() { return daysGreeting; }
   public boolean isWeekend() { return isWeekend; }   
} 
public class EnumWithConstructors
{
   public static void doWeekendStuff(){ System.out.println("Sleep"); }
   public static void doWeeklyStuff(Weekdays w){ System.out.println("Have to work"); }
   
   public static void main(String [] args)
   {
      Weekdays weekday = Weekdays.MONDAY;
      System.out.println(weekday.getGreeting());
      if(weekday.isWeekend()) { doWeekendStuff(); }
      else { doWeeklyStuff(weekday); }
   }
}
