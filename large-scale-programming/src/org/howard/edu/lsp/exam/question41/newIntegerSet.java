/**
 * 
 */
package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bostic
 *
 */
public class newIntegerSet {

	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	public newIntegerSet(ArrayList<Integer> set)
	{
		this.set = set;
	}
	
	public void removeZeroes()
	{
		set.removeAll(Arrays.asList(0));
	}
	
}
