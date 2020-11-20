
/**
 * This class definition is a blueprint for the driver class that converts
 * one unit to all the other remaining units (i.e. insert meters and receive
 * the other converted units along with it)
 *
 * @author Samuel Phillips
 * @version 09/07/18
 */
public class MeasurementConverter
{
    
    // Fields are made private and are stated below:
    private double amount;
    private double inches;
    private double feet;
    private double yards;
    private double centimeters;
    private double meters;
   
    // Constants for all the inch conversions are below:
    private final double INCHES_TO_FEET = 0.0833333;
    private final double INCHES_TO_YARDS = 0.0277778;
    private final double INCHES_TO_CENTIMETERS = 2.54;
    private final double INCHES_TO_METERS = 0.0254;
    
    // Constants for all the feet conversions are below:
    private final double FEET_TO_METERS = 0.3048;
    private final double FEET_TO_INCHES = 12;
    private final double FEET_TO_YARDS = 0.333333;
    private final double FEET_TO_CENTIMETERS = 30.48;
    
    // Constants for all the yards conversions are below:
    private final double YARDS_TO_METERS = 0.9144;
    private final double YARDS_TO_CENTIMETERS = 91.44;
    private final double YARDS_TO_INCHES = 36;
    private final double YARDS_TO_FEET = 3;
    
    // Constants for all the centimeters conversions are below:
    private final double CENTIMETERS_TO_YARDS = 0.0109361;
    private final double CENTIMETERS_TO_METERS = 0.01;
    private final double CENTIMETERS_TO_FEET = 0.0328084;
    private final double CENTIMETERS_TO_INCHES = 0.393701;
    
    // Constants for all the meter conversions are below:
    private final double METERS_TO_CENTIMETERS = 100;
    private final double METERS_TO_INCHES = 39.3701;
    private final double METERS_TO_FEET = 3.28084;
    private final double METERS_TO_YARDS = 1.09361;
  
  /**
  * No-args constructor method that sets all the doubles to 0: 
  **/ 
  public MeasurementConverter()
  {
      amount = inches = feet = yards = centimeters = meters = 0;
      
    }
    
    /**
    * Constructor method that contains all the arguments used inthe methods below it:
    * @param double in the in Amount of a unit
    */
    public MeasurementConverter(double inAmount)
    {
        
        // Sets the amount variable to equal inputted amount called "inAmount".
        amount = inAmount;
        
        // This set of arguments sets all the conversions to be converted from inches to etc.
        inches = amount;
        feet = amount * INCHES_TO_FEET;
        yards = amount * INCHES_TO_YARDS;
        centimeters = amount * INCHES_TO_CENTIMETERS;
        meters = amount * INCHES_TO_METERS;  
        
        // This set of arguments sets all the conversions to be converted from feet to etc.
        inches = amount * FEET_TO_INCHES;
        yards = amount * FEET_TO_YARDS;
        centimeters = amount * FEET_TO_CENTIMETERS;
        meters = amount * FEET_TO_METERS;
        
        // This set of arguments sets all the conversions to be converted from yards to etc.
        yards = amount;
        inches = amount * YARDS_TO_INCHES;
        feet = amount * YARDS_TO_FEET;
        centimeters = amount * YARDS_TO_CENTIMETERS;
        meters = amount * YARDS_TO_METERS;
        
        // This set of arguments sets all the conversions to be converted from centimeters to etc.
        centimeters = amount;
        inches = amount * CENTIMETERS_TO_INCHES;
        feet = amount * CENTIMETERS_TO_FEET;
        yards = amount * CENTIMETERS_TO_YARDS;
        meters = amount * CENTIMETERS_TO_METERS;
        
        // This set of arguments sets all the conversions to be converted from meters to etc.
        meters = amount;
        inches = amount * METERS_TO_INCHES;
        feet = amount * METERS_TO_FEET;
        yards = amount * METERS_TO_YARDS;
        centimeters = amount * METERS_TO_CENTIMETERS;
    
}

/**
* This method sets all the conversions to be converted from feet to etc.
* @param double in the in Amount of a unit
*/
public void setFeet(double inAmount)
{
    amount = inAmount;
    feet = amount;
    inches = amount * FEET_TO_INCHES;
    yards = amount * FEET_TO_YARDS;
    centimeters = amount * FEET_TO_CENTIMETERS;
    meters = amount * FEET_TO_METERS;
}

/**
* Method that returns the variable feet with its current value.
* @return statement returns the value in the variable feet.
*/
public double getFeet()
{
    return feet;
}

/**
* This method sets all the conversions to be converted from inches to etc.
* @param double in the in Amount of a unit
*/
public void setInches(double inAmount)
{
    amount = inAmount;
    inches = amount;
    feet = amount * INCHES_TO_FEET;
    yards = amount * INCHES_TO_YARDS;
    centimeters = amount * INCHES_TO_CENTIMETERS;
    meters = amount * INCHES_TO_METERS;
}

/**
* Method that returns the variable inches with its current value.
* @return statement returns the value in the variable inches.
*/
public double getInches()
{
    return inches;
}

/**
* This method sets all the conversions to be converted from yards to etc.
* @param double in the in Amount of a unit
*/
public void setYards(double inAmount)
{
    amount = inAmount;
    yards = amount;
    inches = amount * YARDS_TO_INCHES;
    feet = amount * YARDS_TO_FEET;
    centimeters = amount * YARDS_TO_CENTIMETERS;
    meters = amount * YARDS_TO_METERS;
}

/**
* Method that returns the variable yards with its current value.
* @return statement returns the value in the variable yards.
*/
public double getYards ()
{
    return yards;
}

/**
* This method sets all the conversions to be converted from centimeters to etc.
* @param double in the in Amount of a unit
*/
public void setCentimeters(double inAmount)
{
    amount = inAmount;
    centimeters = amount;
    inches = amount * CENTIMETERS_TO_INCHES;
    feet = amount * CENTIMETERS_TO_FEET;
    yards = amount * CENTIMETERS_TO_YARDS;
    meters = amount * CENTIMETERS_TO_METERS;
}

/**
* Method that returns the variable centimeters with its current value.
* @return statement returns the value in the variable centimeters.
*/
public double getCentimeters()
{
    return centimeters;
} 

/**
* This method sets all the conversions to be converted from meters to etc.
* @param double in the in Amount of a unit
*/
public void setMeters(double inAmount)
{
    amount = inAmount;
    meters = amount;
    inches = amount * METERS_TO_INCHES;
    feet = amount * METERS_TO_FEET;
    yards = amount * METERS_TO_YARDS;
    centimeters = amount * METERS_TO_CENTIMETERS;

    }

/**
* Method that returns the variable centimeters with its current value.
* @return statement returns the value in the variable meters.
*/
public double getMeters()
{
   return meters;
}

/**
* Method returns a statement stating the current variables with their values.
*/
public String toString()
{
    return "Meters: " + meters +
           "\nFeet: " + feet +
           "\nInches: " + inches +
           "\nYards: " + yards +
           "\nCentimeters: " + centimeters;
}
} //end of MeasurementConverter class definition
