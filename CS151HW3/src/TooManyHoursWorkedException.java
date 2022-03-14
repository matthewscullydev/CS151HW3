/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * TooManyHoursWorkedException class
 * <p>
 * 
 * This is the TooManyHoursWorkedException class which is used to create a custome exception.
 * 
 * </p>
 * 
 */

public class TooManyHoursWorkedException extends Exception {
	

	/**
	 * 	
	 * exception contructor which takes parameter of String errorMsg.
	 * default class initialized for customer exception.
	 *
	 *
	 * @param errorMsg errormsg
	 */
	
	public TooManyHoursWorkedException(String errorMsg) {
		super(errorMsg);
	}

}
