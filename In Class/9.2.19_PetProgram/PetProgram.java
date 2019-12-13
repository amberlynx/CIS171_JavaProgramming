public class PetProgram
{
   public static void main(String [] args)
   {
      Pet myPet = new Pet("Titus.");
      // myPet.setName("Ekko.");
      System.out.println("My dog " + myPet.getName());
      Pet myOtherPet = new Pet();
      System.out.println("My other dog " + myOtherPet.getName());
   }
}