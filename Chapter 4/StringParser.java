import java.util.Scanner;

public class StringParser
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print ("Please enter in a number between 1,000 and 999,999: ");
        String num = s.next();
        int index = num.indexOf(",");
        int length = num.length();
        
        String sub = num.substring(0 , index);
        String sub2 = num.substring(index + 1 , length);
        
        System.out.println("The number without a comma is: " + sub + sub2);
    }
}
        