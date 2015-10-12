import java.util.Scanner;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 120;
   
    
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
            JFrame frame = new JFrame();
            frame.setSize(1500 /* x */, 800 /* y */);
            frame.setTitle("Cityscape");
            frame.getContentPane().setBackground(Color.GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
        Scanner s = new Scanner(System.in);
        int dayOrNight = 1;
        while (true)
        {
            // get the user input: day or night
            System.out.print ("Is it day or night? Please enter 1 for day, and 2 for night: ");
            String num = s.next();
            
            // validates the user input
            try            
            {
                dayOrNight = Integer.parseInt(num);
                if (dayOrNight != 1 && dayOrNight != 2)
                {
                    System.out.print ("Invalid input, please enter 1 or 2:\n");
                }
                else
                    break;
            }
            catch(Exception e)
            {
                System.out.print ("Invalid input, please try again:\n");
            }
        }
        // a frame contains a single component; create the Cityscape component and add it to the frame
         CityscapeComponent component = new CityscapeComponent( dayOrNight );
         frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
         frame.setVisible(true);
        
        // animate the cityscape
         for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
         {
             component.nextFrame();
             Thread.sleep( 100 );
         }
         
            }
        }
      
    
   

