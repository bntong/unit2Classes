

/**
 *  A class that represents a vending machine that is able to hold cans of soda. In addition,
 * customers are able to insert tokens in order to buy them.
 * 
 * @author Tong
 * @version 17 September 2015
 */
public class VendingMachine
{
    /** specifies the number of cans in the vending machine */
    private int numCans;
    
    /** specifies how many tokens are in the vending machine */
    private int numTokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        // initialise instance variables
        numCans = 10;
        numTokens = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void insertToken()
    {
        // put your code here
        numTokens +=1;
        numCans -=1;
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
    public int fillUp(int cans)
    {
        // put your code here
        numCans += cans;
        return numCans;
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
    public int getCanCount()
    {
        // put your code here
        return numCans;
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
    public int getTokenCount()
    {
        // put your code here
        return numCans;
    }

}
