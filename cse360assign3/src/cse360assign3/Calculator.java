/** The Calculator class acts like a calculator and performs arithmetic.
 *
 * @author Uilani Forgione
 * @version Feb. 23, 2016
 */

package cse360assign3;

public class Calculator {
	
	/** total is a private int that keeps track of the total before/after methods */
	private int total;
	
	/** Calculator () is a constructor that initializes total = 0. */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** getTotal () is a method that returns the total
    *
    * @return total 			total is a private int that keeps track of the total before/after methods
    */
	public int getTotal () {
		return total;
	}
	
	/** add (int value) is a method that takes a value and adds it to total 
    *
    * @param value 				value is an int that will be added to total
    */
	public void add (int value) {
		total = total + value;
	}
	
	/** subtract (int value) is a method that takes a value and subtracts it from total 
    *
    * @param value 				value is an int that will be subtracted from total
    */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** multiply (int value) is a method that takes a value and multiplies it to total 
    *
    * @param value 				value is an int that will be multiplied to total
    */
	public void multiply (int value) {
		total = total * value;
	}
	
	/** divide (int value) is a method that takes a value and divides it from total 
    *
    * @param value 				value is an int that will be divided from total
    */
	public void divide (int value) {
		if (value == 0)
				total = 0; 
		else total = total/value;
	}
	
	/** getHistory () is a method that returns the string ""
    *
    * @return  ""			"" is the string that will be returned from this method
    */
	public String getHistory () {
		return "";
	}
}
