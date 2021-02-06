package org.howard.edu.lsp.assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.howard.edu.lsp.assignment2.combination.Solution;


/**
 * @author bostic
 *
 */
class AllTests {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSolutions() {
		addTo3();
		zeroTarget();
		addToTen();
		allOnes();
	}
	
	/**
	 * Tests if the input has all ones will the correct output work
	 */
	void allOnes() {
		int[] allOnes = {1,1,1,1};
		int target = 1;
	    ArrayList<Integer> allIndexes = new ArrayList<Integer>();
	    allIndexes.add(0);
	    allIndexes.add(1);
	    allIndexes.add(2);
	    allIndexes.add(3);

		Solution test = new Solution(allOnes, target);
		Assertions.assertEquals(allIndexes, test.returnAllCombos(allOnes, target));
	}
	
	/**
	 * Tests if the input has a target of will the correct output work
	 */
	void addToTen() {
		int[] addTo10 = {99,28,43903, 10};
		int target = 10;
		
	    ArrayList<Integer> allIndexes = new ArrayList<Integer>();
	    allIndexes.add(3);
		Solution test = new Solution(addTo10, target);
		Assertions.assertEquals(allIndexes, test.returnAllCombos(addTo10, target));	
	}
	
	/**
	 * Tests if the input has a empty array will the correct output work
	 */
	void zeroTarget() {
		int[] addTo0 = {};
		int target = 0;
		
	    ArrayList<Integer> allIndexes = new ArrayList<Integer>();
		Solution test = new Solution(addTo0, target);
		Assertions.assertEquals(allIndexes, test.returnAllCombos(addTo0, target));	
	}
	
	/**
	 * Tests if target adds up to 3 will the output work
	 */
	void addTo3()
	{
		int[] addTo15 = {1,2,3,4,5,6};
		int target = 3;
		
	    ArrayList<Integer> allIndexes = new ArrayList<Integer>();
	    allIndexes.add(0);
	    allIndexes.add(1);
	    allIndexes.add(2);
	    
		Solution test = new Solution(addTo15, target);
		Assertions.assertEquals(allIndexes, test.returnAllCombos(addTo15, target));
	}
}
