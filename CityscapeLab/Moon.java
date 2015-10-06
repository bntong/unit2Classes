import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

/**
 * A digital representation of the Moon
 * 
 * @author (Tong) 
 * @version (22 September 2015)
 */
public class Moon
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Moon
     */
    public Moon(int x , int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw( Graphics2D g2)
    {
        // put your code here
        int xavalue = 10;
        int yValue = 10;
        
        Ellipse2D.Double drawMoon = new Ellipse2D.Double(xLeft + 35 , yTop + 35 , 50 , 50);
        
        g2.draw(drawMoon);
        g2.setColor(Color.GRAY);
        g2.fill(drawMoon);
    }

}
