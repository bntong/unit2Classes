public class DistanceConverter
{
   public static void main(String[] args)
   {
      final static double INCHESINFOOT = 12;
      final static double FEETINYARDS = 3;
      
      double yards = 1;
      double feet = yards * FEETINYARDS;
      double inches = feet * INCHESINFOOT;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}