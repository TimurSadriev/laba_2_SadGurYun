/*
 * 
 */
package src;
import javax.swing.*;
import java.io.IOException;
// TODO: Auto-generated Javadoc

/**
 * The Class Asetting.
 */
public abstract class Asetting extends Exception{
	 
 	/**
 	 * Sets the cost.
 	 *
 	 * @param field the new cost
 	 * @throws NumberFormatException the number format exception
 	 */
 	public abstract void setCost(JTextField field) throws NumberFormatException;
	    
    	/**
    	 * Sets the.
    	 *
    	 * @param x the x
    	 */
    	public abstract void set(int x);
	    
    	/**
    	 * Sets the type.
    	 *
    	 * @param x the new type
    	 */
    	public abstract void setType(int x);
	    
    	/**
    	 * Reset.
    	 *
    	 * @param x the x
    	 */
    	public abstract void reset(int x);
	    
    	/**
    	 * Gets the.
    	 *
    	 * @param x the x
    	 * @return the int
    	 */
    	public abstract int get(int x);
}
