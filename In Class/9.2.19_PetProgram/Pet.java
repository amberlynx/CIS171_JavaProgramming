public class Pet
{
   // If not initialized Java automatically uses null
   private String name = "Bingo";
   private String petType;
   private int age = 0;
   private double weight;
   
   //*** Methods 
   public void setName(String n) 
   {
      name = n;
   }
   public String getName(){ return name; }
   
   public void setPetType(String pt) 
   {
      petType = pt;
   }
   public String getPetType(){ return petType; }
   
   public void setAge(int a) 
   {
      age = a;
   }
   public int setAge(){ return age; }
   
   public void setWeight(double w) 
   {
      weight = w;
   }
   public double getWeight(){ return weight; }
   
   //*** Constructor
   public Pet(String n)
   {
      name = n;
   }
   public Pet() // Default Constructor
   {
      name = "Akamaru.";
   }
   
} // endClass: Pet