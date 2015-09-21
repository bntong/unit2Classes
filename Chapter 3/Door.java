

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
        this.name() = "Front";
        this.state() = "Open";
        
    }

    /**
     *  This method gets the name of the door                 
     * @post    gets the name of the door
     *            (what the method guarantees upon completion)
     * @return   returns the name of the door
     */
    public String getName()
    {
        // put your code here
        return this.name;
    }
    

    /**
     * This method sets the name of the door
     *
     * @post    this method sets the name of the door
     *          (what the method guarantees upon completion)
     * @param   newName   the new name of the door
     */
    public void setName(String newName)
    {
        // put your code here
        this.name = newName;
    }
    

    /**
     * This method sets the state of the door
     *
     * @post    this method sets the state of the door
     *          (what the method guarantees upon completion)
     * @param   newState   the new state of the door
     */
    public void setState(String newState)
    {
        // put your code here
        this.state = newState;
    }
    

    /**
     * This method gets the state of the door
     *
     * @post    this method gets the state of the door
     *          (what the method guarantees upon completion)
     * @return  returns the state of the door
     */
    public String getState()
    {
        // put your code here
        return this.state;
    }

}
