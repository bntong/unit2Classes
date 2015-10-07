import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

/**
 * A digital representation of the sun
 * 
 * @author (Tong) 
 * @version (22 September 2015)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x , int y)
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
        
        Ellipse2D.Double drawSun = new Ellipse2D.Double(xLeft + 35 , yTop + 35 , 50 , 50);
        
        g2.draw(drawSun);
        g2.setColor(Color.YELLOW);
        g2.fill(drawSun);
    }

}
