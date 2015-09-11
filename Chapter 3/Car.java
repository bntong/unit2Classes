

/**
 * The class Car has a certain fuel efficiency and a certain amount of fuel in the gas tank. A Car may be driven a specified distance which redues the amount of gas in the tank.
 * 
 * @author Tong 
 * @version 10 September 2015
 */
public class Car
{
    /** specifies the fuel efficiency of the car in units of miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** specifies the amount of fuel in the gas tank in units of gallons */
    private double fuelInTank;

    /**
     * Default constructor for objects of class Car that specifies the fuel efficiency of the car.
     */
    public Car( double fuelEfficiency )
    {
        // initialise instance variables
        fuelInTank = 0.0;
        fuelEfficiency = fuelEfficiency;
    }

    /**
     * Simulates driving the car the specified distance in miles and reduces the amount of fuel in the car's tank.
     *
     * @pre       the specified distance cannot consume more than the fuel available in the tank.
     *              (what the method assumes about the method's parameters and class's state)
     * @param     distance      the spcified distance to drive in miles
     */
    public void drive( double distance )
    {  
        fuelInTank -= distance / fuelEfficiency;
    }
    
    /**
     * Returns the number of gallons of gas in the car's tank.
     
     * @return  Returns the number of gallons of gas in the car's tank.
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }
    
    /**
     * Increments the fuel stored in the car's tank by the specified amount in gallons.
     *
     * @pre     gallonsOfGas must be positive

     * @param   gallonsOfGas  amount in gallons to increment the fuel in the car's tank

     */
    public void addGas(double gallonOfGas)
    {
        fuelInTank += gallonOfGas;
    }

}
