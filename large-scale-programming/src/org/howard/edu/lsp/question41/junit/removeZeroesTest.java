/**
 * 
 */
package org.howard.edu.lsp.question41.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.howard.edu.lsp.exam.question41.newIntegerSet;
import org.junit.jupiter.api.Test;

/**
 * @author bostic
 *
 */
class removeZeroesTest {

	@Test
	void testRemoveZeroes() {
		ArrayList<Integer> testSet = new ArrayList<Integer>();
		testSet.add(4);
		testSet.add(0);
		testSet.add(1);
		testSet.add(0);
		
		newIntegerSet newSet = new newIntegerSet(testSet);
	
		
		// Test to make sure that when we add zeroes when instantiating it does not 
		// stay when we remove them
		newSet.removeZeroes();
		assertFalse(testSet.contains(0));
		
		// Now we will add some more zeroes
		
		testSet.add(0);
		testSet.add(0);
		testSet.remove(Integer.valueOf(4));
		testSet.remove(Integer.valueOf(1));
		
		// The list should now only contain zeroes
		assertFalse(testSet.contains(4));
		assertFalse(testSet.contains(1));
		
		newSet.removeZeroes();
		// List should now be empty
		
		assertTrue(testSet.isEmpty());
		System.out.println(testSet);	
	}

}
