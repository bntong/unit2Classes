import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Graphics;

/**
 * A target that can be placed anywhere on the screen
 * 
 * @author (Tong) 
 * @version (22 September 2015)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop; 

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x , int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the target
     * @post    Draws the target
     *            (what the method guarantees upon completion)
     * @param    g2    the graphics context
     */
    public void draw( Graphics2D g2 )
    {
        // put your code here
        Ellipse2D.Double drawWhite = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
        Ellipse2D.Double drawBlack = new Ellipse2D.Double(xLeft + 30, yTop + 20, 10, 10);
        
        g2.draw(drawWhite);
        g2.draw(drawBlack);

    }

}
