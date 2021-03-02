/**
 * 
 */
package org.howard.edu.lsp.assignment4.implementation;

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
