/**
 * 
 */
package org.howard.edu.lsp.assignment6.integerset;

/**
 * @author bostic
 *
 */
public class IntegerSetException extends Exception {
	
	
	public IntegerSetException (String z) 
	{
		z = "";
	}
	
	public String toString()
	{
		return ("You can't use empty arraylists");
	}
}
