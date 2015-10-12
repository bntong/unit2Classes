import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GradientPaint;

/**
 * The sky of the city
 * 
 * @author (Tong) 
 * @version (2 October 2015)
 */
public class Sky
{
    // instance variables - replace the example below with your own
    private int dayOrNight; /* indicates if it is day or night */
    
    final int TIME_DAY = 1; /* constant for day */
    final int TIME_NIGHT = 2; /* constant for night */

    /**
     * Constructor for objects of class Sky
     */
    public Sky(int _dayOrNight)
    {
        // initialise instance variables
        dayOrNight = _dayOrNight;
    }

    /**
     * 
     * @param  g2   graphics context 
     */
    public void draw( Graphics2D g2)
    {
        // put your code here
        GradientPaint redtowhite; 
        
        // sets the gradient color
        if (dayOrNight == TIME_DAY)
            redtowhite = new GradientPaint(800,0,Color.WHITE,800,1500,Color.CYAN);
        else
            redtowhite = new GradientPaint(800,0,Color.BLACK,800,1500,Color.BLUE);
        
        // start drawing gradient    
        g2.setPaint(redtowhite);
        g2.fill(new Rectangle(0,0,1500,800));
    }
}
