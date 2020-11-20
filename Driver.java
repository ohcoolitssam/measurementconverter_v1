// The java.util.Scanner is stated so the scanner and keyboard can be used in this Driver.
import java.util.Scanner;
/**
 * Driver for the mesurementconverter class that carries out all the methods in the past class to
 * calculate measurement conversions on which type the user wants to convert.
 *
 * @author Samuel Phillips
 * @version 09/10/18
 */
public class Driver
{
    // Main method that carries out all the methods from the MeasurementConverter class when called.
    public static void main (String [] args) 
    {
       
       // Variables stated that will be used in the methods below.
       double inAmount;
       char menuChoice;
       // A new object called myMeasurement is created for this driver and then 
       // a instance of the no-args constructor from MeasurementConverter is called as well:
       MeasurementConverter myMeasurement;
       myMeasurement = new MeasurementConverter();
       // The scanner is activated to change whatever key that is typed to a variable's number/spot
       // @param double the keyboard inserts the value typed into the Scanner.
       Scanner in = new Scanner(System.in);
       
       // A do loop is used to make sure the user repeats when the right character is stated.
       do
       {
           
       // Prints out the menu for which the user can choose one from the following to convert to other units:
       System.out.println("        To convert inches: type i / I" + 
       "\n        To convert feet: type f / F" +
       "\n        To convert yards: type y / Y" +
       "\n        To convert centimeters: type c / C" +
       "\n        To convert meters: type m / M");
       // Changes the value given existing in menuChoice to a value that was just typed:
       // @param char takes the existing value at menuChoice and replaces it with
       // the value typed in from the user's keyboard.
       menuChoice = in.next().charAt(0);
       
       
       // Switch method that allows the user to choose a character that corresponds with 
       // a certain unit type which then can be converted into other types with the use of other methods
       // from the MeasurementConverter class.
       switch (menuChoice)
       {
           // If chosen i or I, the switch statement will say this line and then
           // will activate these methods from the MeasurementConverter class.
           case 'i':
           case 'I':
           System.out.println("Enter an amount: ");
           inAmount = in.nextDouble();
           myMeasurement.setInches(inAmount);
           myMeasurement.getInches();
           myMeasurement.getFeet();
           myMeasurement.getYards();
           myMeasurement.getCentimeters();
           myMeasurement.getMeters();
           
           // Prints out the toString method from the measurement converter class
           // and then prompts the user whether or not they will go again:
           // @param char takes the existing value at menuChoice and replaces it with
           // the value typed in from the user's keyboard.
           System.out.println(myMeasurement.toString());
           System.out.println("\n" + "Enter o to go again: ");
           menuChoice = in.next().charAt(0);
           break;
           
           // If chosen f or F, the switch statement will say this line and then
           // will activate these methods from the MeasurementConverter class.
           // @param double in the in Amount of a unit (feet).
           case 'f':
           case 'F':
           System.out.println("Enter an amount: ");
           inAmount = in.nextDouble();
           myMeasurement.setFeet(inAmount);
           myMeasurement.getInches();
           myMeasurement.getFeet();
           myMeasurement.getYards();
           myMeasurement.getCentimeters();
           myMeasurement.getMeters();
            
           // Prints out the toString method from the measurement converter class
           // and then prompts the user whether or not they will go again:
           // @param char takes the existing value at menuChoice and replaces it with
           // the value typed in from the user's keyboard.
           System.out.println(myMeasurement.toString());
           System.out.println("\n" + "Enter o to go again: ");
           menuChoice = in.next().charAt(0);
           break;
            
           // If chosen y or Y, the switch statement will say this line and then
           // will activate these methods from the MeasurementConverter class.
           // @param double in the in Amount of a unit (yards).
           case 'y':
           case'Y':
           System.out.println("Enter an amount: ");
           inAmount = in.nextDouble();
           myMeasurement.setYards(inAmount);
           myMeasurement.getInches();
           myMeasurement.getFeet();
           myMeasurement.getYards();
           myMeasurement.getCentimeters();
           myMeasurement.getMeters();
            
           // Prints out the toString method from the measurement converter class
           // and then prompts the user whether or not they will go again:
           // @param char takes the existing value at menuChoice and replaces it with
           // the value typed in from the user's keyboard.
           System.out.println(myMeasurement.toString());
           System.out.println("\n" + "Enter o to go again: ");
           menuChoice = in.next().charAt(0);
           break;
            
           // If chosen m or M, the switch statement will say this line and then
           // will activate these methods from the MeasurementConverter class.
           // @param double in the in Amount of a unit (meters).
           case 'm':
           case 'M':
           System.out.println("Enter an amount: ");
           inAmount = in.nextDouble();
           myMeasurement.setMeters(inAmount);
           myMeasurement.getInches();
           myMeasurement.getFeet();
           myMeasurement.getYards();
           myMeasurement.getCentimeters();
           myMeasurement.getMeters();
            
           // Prints out the toString method from the measurement converter class
           // and then prompts the user whether or not they will go again:
           // @param char takes the existing value at menuChoice and replaces it with
           // the value typed in from the user's keyboard.
           System.out.println(myMeasurement.toString());
           System.out.println("\n" + "Enter o to go again: ");
           menuChoice = in.next().charAt(0);
           break;
            
           // If chosen c or C, the switch statement will say this line and then
           // will activate these methods from the MeasurementConverter class.
           // @param double in the in Amount of a unit (centimeters).
           case 'c':
           case 'C':
           System.out.println("Enter an amount: ");
           inAmount = in.nextDouble();
           myMeasurement.setCentimeters(inAmount);
           myMeasurement.getInches();
           myMeasurement.getFeet();
           myMeasurement.getYards();
           myMeasurement.getCentimeters();
           myMeasurement.getMeters();
            
           // Prints out the toString method from the measurement converter class
           // and then prompts the user whether or not they will go again:
           // @param char takes the existing value at menuChoice and replaces it with
           // the value typed in from the user's keyboard.
           System.out.println(myMeasurement.toString());
           System.out.println("\n" + "Enter o to go again: ");
           menuChoice = in.next().charAt(0);
           break;
            
           // The default switch statement is used to let the user type in another correct letter if
           // a letter that was previously typed was not a proper character that led
           // to a switch statement.
           // @param char takes the existing value at menuChoice and replaces it with
           // the value typed in from the user's keyboard.
           default:
           System.out.println("Incorrect letter was typed, please try again.");
           System.out.println("\n" + "Enter o to try again: ");
           menuChoice = in.next().charAt(0);
           break;
            
     } //end of switch method
   // This while statement allows the user to go again if the character o is typed.
  }while (menuChoice == 'o'); // end of do method
    
  // This last statement is given when the user refuses to go again 
  //by typing in a different character other than o.
  System.out.println("                   Goodbye.");
 } //end of main method   
} //end of driver class

