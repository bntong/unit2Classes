import javax.swing.JFrame;

/**
 * Views the circle drawn
 * 
 * @author (Tong) 
 * @version (23 September 2015)
 */
public class TargetViewer
{
    public static void main(String[] args)
    {
        // put your code here
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
       
    }

}
