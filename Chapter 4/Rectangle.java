import java.util.Scanner;

public class Rectangle
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        double a, b, c;
        
        System.out.print ("Enter the length of the rectangle: ");
        a = s.nextDouble();
        
        System.out.print ("Enter the width of the rectangle: ");
        b = s.nextDouble();
        
        double perimeter = (2*a)+(2*b);
        double area = a*b;
        double diagonal = Math.sqrt(Math.pow(a , 2) + Math.pow(b, 2));
        
        System.out.println("\nThe area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The length of the diagonal is: " + diagonal);
    }
}