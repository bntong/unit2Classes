import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * The overall building shape for the the city. Its height and width can be changed.
 * 
 * @author (Tong) 
 * @version (2 October 2015)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int x , int y)
    {
        // initialise instance variables
        xLeft = x;                
        yTop = y;
    }

    /**
     * Draws the building
     * 
     * @post      Draws the building
     *            (what the method guarantees upon completion)
     * @param    g2    the graphics context
     */
    public void draw( Graphics2D g2)
    {
        // put your code here
        int xValue = 100;
        int yValue = 10;
        
        Rectangle body = new Rectangle(xLeft+35, yTop, 100, 200);
        g2.draw(body);
        g2.setColor(Color.BLACK);
        g2.fill(body);
        
    }
    }
    

