import java.util.Scanner;

public class Pseudocode2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print ("Please enter in the amount due: ");
        double amountDue = s.nextDouble();
        System.out.print ("Please enter in the amount given: ");
        double amountGiven = s.nextDouble();
        double change = amountGiven - amountDue;
        int newChange = (int) change * 100;
        
        int dollars = (int) newChange / 100;
        double changeRemainder = (change - dollars) * 100;
        int quarters = (int) changeRemainder / 25;
        
        System.out.println(quarters);
    }
}
        