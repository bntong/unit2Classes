import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

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
       int  xValue = 10;
       int  yValue = 10;
        
       Ellipse2D.Double drawWhite1 = new Ellipse2D.Double(xLeft + 35, yTop + 35, 110, 110);
       Ellipse2D.Double drawBlack1 = new Ellipse2D.Double(xLeft + xValue, yTop + 40, 100, 100);
       Ellipse2D.Double drawWhite2 = new Ellipse2D.Double(xLeft + 45, yTop + 45, 90, 90);
        
       g2.draw(drawWhite1);
       g2.draw(drawBlack1);
       g2.setColor(Color.BLACK);
       g2.fill(drawBlack1);
       g2.draw(drawWhite2);
       g2.setColor(Color.WHITE);
       g2.fill(drawWhite2);

    }

}
