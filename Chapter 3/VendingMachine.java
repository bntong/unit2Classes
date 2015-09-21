

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
    public VendingMachine(int cans)
    {
        // initialise instance variables
        numCans = cans;
        numTokens = 0;
    }

    /**
     * A method that inserts tokens into the vending machine
     *
     * @post    inserts tokens into the vending machine
     *            (what the method guarantees upon completion)
     * @param    token    specifies the amount of tokens inserted into the vending machine
     */
    public void insertToken(int token)
    {
        // put your code here
        numTokens += token;
        numCans -= token;
    }
    

    /**
     * A method that fills up the vending machine with cans
     *
     * @pre     Cans must be positive
     *          (what the method assumes about the method's parameters and class's state)
     * @post    fills up the vending machine with cans
     *          (what the method guarantees upon completion)
     * @param   cans   specifies the amount of cans to be filled into the vending machine
     * @return  description of the return value
     */
    public int fillUp(int cans)
    {
        // put your code here
        numCans += cans;
        return numCans;
    }
    

    /**
     * A method that gets the amount of cans in the vending machine
     *
     * @post    gets the amount of cans in the vending machine
     *          (what the method guarantees upon completion)
     * @return  returns the amount of cans currently in the vending machine
     */
    public int getCanCount()
    {
        // put your code here
        return numCans;
    }
    

    /**
     * A method that gets the amount of tokens currently in the vending machine
     *
     * @post    gets the amount of tokens currently in the vending machine
     *          (what the method guarantees upon completion)
     * @return  returns the number of tokens currently in the vending machine
     */
    public int getTokenCount()
    {
        // put your code here
        return numTokens;
    }

}
