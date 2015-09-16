

/**
 * The class Door has a certain state and a certain name that distinguishes it from other doors 
 * 
 * @author Tong 
 * @version 10 September 2015
 */
public class Door
{
    /** specifies the state of the door */
    private String state;
    
    /** specifies what kind of door it is ;*/
    private String name;

    /**
     * Default constructor for objects of class Door that specifies the state and name of the door.
     */
    public Door( String state )
    {
        // initialise instance variables
        name = this.getName;
        state = this.getState;
        
    }

    /**
     *                
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public String getName()
    {
        // put your code here
        return this.name;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   newName   the new name of the door
     * @return  description of the return value
     */
    public void setName(String newName)
    {
        // put your code here
        this.name = newName;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void setState(String newState)
    {
        // put your code here
        this.state = newState;
    }

}
