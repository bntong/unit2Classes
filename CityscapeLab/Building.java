import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GradientPaint;

/**
 * The overall building shape for the the city. Its height and width can be changed.
 * 
 * @author (Tong) 
 * @version (2 October 2015)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft; /* x coordinate of building */
    private int yTop; /* y coordinate of building */
    private int dayOrNight; /* indicates if it is day or night */
    
    final int TIME_DAY = 1; /* constant for day */
    final int TIME_NIGHT = 2; /* constanf for night */
    /**
     * Default constructor for objects of class Building
     */
    public Building(int x , int y, int _dayOrNight)
    {
        // initialize instance variables
        xLeft = x;                
        yTop = y;
        dayOrNight = _dayOrNight;
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
        Color windowColor;
        
        if (dayOrNight == TIME_DAY)
            windowColor = Color.WHITE;
        else
            windowColor = Color.YELLOW;
                       
        Rectangle window1 = new Rectangle(xLeft+35+25, yTop+120, 20,30);
        Rectangle window2 = new Rectangle(xLeft+35+25+20+10, yTop+120, 20,30);
        Rectangle window3 = new Rectangle(xLeft+35+25, yTop+120+50, 20,30);
        Rectangle window4 = new Rectangle(xLeft+35+25+20+10, yTop+120+50, 20,30);
        Rectangle window5 = new Rectangle(xLeft+35+25, yTop+120+50+50, 20,30);
        Rectangle window6 = new Rectangle(xLeft+35+25+20+10, yTop+120+50+50, 20,30);
        
        Rectangle body1 = new Rectangle(xLeft+35, yTop+100, 100, 200);
        Rectangle body2 = new Rectangle(xLeft + 190 , yTop, 180 , 300);
        Rectangle body3 = new Rectangle(xLeft + 240 , yTop-200, 90 , 500);
        Rectangle body4 = new Rectangle(xLeft + 280 , yTop-400, 20 , 500);
        Rectangle body5 = new Rectangle(xLeft + 440, yTop-100 , 180 , 400);
        
        // First building from the left
        g2.draw(body1);
        g2.setColor(Color.BLACK);
        g2.fill(body1);
        
        // Layer 1 of second building
        g2.setColor(Color.BLACK);
        g2.draw(body2);
        g2.fill(body2);
        
        // Layer 2 of second building
        g2.draw(body3);
        g2.setColor(Color.BLACK);
        g2.fill(body3);
        
        // Layer 3 of second building
        g2.draw(body4);
        g2.setColor(Color.BLACK);
        g2.fill(body4);
        
        // Third building from the left
        g2.draw(body5);
        g2.setColor(Color.BLACK);
        g2.fill(body5);
        
        // Drawing Windows for the first building
        g2.draw(window1);
        g2.setColor(windowColor);
        g2.fill(window1);        
        g2.draw(window2);
        g2.setColor(windowColor);
        g2.fill(window2);        
        g2.draw(window3);
        g2.setColor(windowColor);
        g2.fill(window3);        
        g2.draw(window4);
        g2.setColor(windowColor);
        g2.fill(window4);        
        g2.draw(window5);
        g2.setColor(windowColor);
        g2.fill(window5);        
        g2.draw(window6);
        g2.setColor(windowColor);
        g2.fill(window6);
        
        // Drawing windows for the third building
        for (int column = 0; column<4; column++)
        {
            int body5x = xLeft + 440;
            int body5y = yTop-100;
            for (int i = 0; i<7; i++)
            {
                int windowsx = body5x+20+column*40;
                int windowsy = body5y+15+50*i;
                Rectangle body5Window = new Rectangle(windowsx,windowsy,20,30);
                g2.draw(body5Window);
                g2.setColor(windowColor);
                g2.fill(body5Window);
            }
        }
        // End Draw Windows
        
    }
    }
    

