import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

/**
 * A digital representation of the SkyObject, and represents the sun or the moon
 * 
 * @author (Tong) 
 * @version (22 September 2015)
 */
public class SkyObject
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft; /* starting x coordinate of the sky object */
    private int yTop; /* starting y coordinate of the sky object */
    private int dayOrNight; /* indicates if it is day or night */
    private long startTime; /* base time for animation */
    
    final int TIME_DAY = 1; /* constant for day */
    final int TIME_NIGHT = 2; /* constanf for night */
    /**
     * Default constructor for objects of class SkyObject
     */
    public SkyObject(int x , int y , int _dayOrNight , long _startTime)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        dayOrNight = _dayOrNight;
        startTime = _startTime;
    }

    /**
     * Creates the sky object - day is sun, night is moon
     *
     * @post    creates the sky object - day is sun, night is moon
     *            (what the method guarantees upon completion)
     * @param    g2    graphics context
     */
    public void draw( Graphics2D g2)
    {
        // put your code here
        int centerx = xLeft + 35;
        int centery = yTop + 35;
        long elapsedTime = System.currentTimeMillis() - startTime;
        
        if (elapsedTime < 45000)
        {
            centerx = xLeft + 35 - (int) (40*elapsedTime/1000);
            centery = yTop + 35 - (int) (20*elapsedTime/1000);
        }
        Ellipse2D.Double drawSkyObject = new Ellipse2D.Double(centerx , centery , 100 , 100);
        
        if (dayOrNight == TIME_DAY)
            g2.setColor(Color.YELLOW);
        else        
            g2.setColor(Color.GRAY);
        
        g2.draw(drawSkyObject);
        g2.fill(drawSkyObject);
    }
    
}
