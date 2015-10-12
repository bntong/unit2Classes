import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int dayOrNight; /* indicates if it is day or night */
    private long startTime; /* base time for animation */
    
    final int TIME_DAY = 1; /* constant for day */
    final int TIME_NIGHT = 2; /* constant for night */
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    public CityscapeComponent( int _dayOrNight )
    {
        dayOrNight = _dayOrNight;
        startTime = System.currentTimeMillis();
    }
        
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        
        // initialize objects to be drawn
        int x = getWidth(); /* gets the width of the canvas */
        int y = getHeight()-300; /* gets the height of the canvas */
        Building building1 = new Building(10,y,dayOrNight);     
        SkyObject skyobject1 = new SkyObject(1300, 300, dayOrNight, startTime);
        Sky sky1 = new Sky(dayOrNight);
        
        // draws the cityscape objects
        sky1.draw(g2);
        building1.draw(g2);
        skyobject1.draw(g2);
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
                        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
