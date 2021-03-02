/**
 * 
 */
package org.howard.edu.lsp.assignment2.test;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment2.combination.Solution;
/**
 * @author bostic
 *
 */
public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(allOnes());
		addToTen();
		zeroTarget();
		addTo3();
		
	}
		/**
		 * Tests if the input has all ones will the correct output work
		 */
		public static boolean allOnes() {
			int[] allOnes = {1,1,1,1};
			int target = 1;
		    ArrayList<Integer> allIndexes = new ArrayList<Integer>();
		    allIndexes.add(0);
		    allIndexes.add(1);
		    allIndexes.add(2);
		    allIndexes.add(3);

			Solution test = new Solution(allOnes, target);
			return true;
		}
		
		/**
		 * Tests if the input has a target of will the correct output work
		 */
		public static void addToTen() {
			int[] addTo10 = {99,28,43903, 10};
			int target = 10;
			
		    ArrayList<Integer> allIndexes = new ArrayList<Integer>();
		    allIndexes.add(3);
			Solution test = new Solution(addTo10, target);
		}
		
		/**
		 * Tests if the input has a empty array will the correct output work
		 */
		public static void zeroTarget() {
			int[] addTo0 = {};
			int target = 0;
			
		    ArrayList<Integer> allIndexes = new ArrayList<Integer>();
			Solution test = new Solution(addTo0, target);
		}
		
		/**
		 * Tests if target adds up to 3 will the output work
		 */
		public static void addTo3()
		{
			int[] addTo15 = {1,2,3,4,5,6};
			int target = 3;
			
		    ArrayList<Integer> allIndexes = new ArrayList<Integer>();
		    allIndexes.add(0);
		    allIndexes.add(1);
		    allIndexes.add(2);
		    
			Solution test = new Solution(addTo15, target);
		}

	}
