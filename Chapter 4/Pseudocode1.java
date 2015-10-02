import java.util.Scanner;

public class Pseudocode1
{
    public static void main(String[] args)
    { 
        Scanner s = new Scanner(System.in);
        
        System.out.print ("Please enter in a ten digit number: ");
        String num = s.next();
        int length = num.length();
        
        String sub = num.substring(0 , 3);
        String sub2 = num.substring(3 , 6);
        String sub3 = num.substring(6 , length);
        
        System.out.println("The number formatted as a phone number is: " + "(" + sub + ")" + "-" + sub2 + "-" + sub3);
    }
}
        