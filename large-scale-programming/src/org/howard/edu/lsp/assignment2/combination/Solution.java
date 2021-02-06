package org.howard.edu.lsp.assignment2.combination;

import java.util.*;

/**
 * @author bostic
 *
 */
public class Solution {
	
	int[] nums;
	int target;
	ArrayList<Integer> finalArray = new ArrayList<Integer>();

	
	/**
	 * Constructor for the class
	 * @param nums
	 * @param target
	 */
	public Solution(int[] nums, int target) {
		nums = this.nums;
		target = this.target;
	}
	
	/**
	 * Used to pass in the array and target to the program
	 * @param nums
	 * @param target
	 * @return finalArray which returns the output
	 */
	public ArrayList<Integer> returnAllCombos(int[] nums, int target) {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		if(nums.length <= 0) {
			return finalArray;
		}
		setAllCombos(nums, target, tempList, 0);
		
		return finalArray;
	}
	/**
	 * Actually does the work of retuning all the numbers that add to the target
	 * @param nums
	 * @param target
	 * @param tempArray
	 * @param firstIndex
	 */
	public  void setAllCombos(int[] nums,  int target, ArrayList<Integer> tempArray, int firstIndex) {
		
		// If we go over our target return 0 immediately
		if(target < 0) return;
		
		
		// If we hit our target add this number to the list of numbers that work
	    if (target == 0) { 

	    	for(int cur : tempArray) {
	    		for(int i = 0; i< nums.length; i++) {
	    			// Checks for duplicates, if none then add it
	    			if(cur == nums[i] && finalArray.indexOf(i) == -1) {
	    				finalArray.add(i);
	    			}
	    		}
	    	}
	    }
		
	    /**
	     * Recursion where if the target minus the number is still greater than
	     * zero then we return and run this method and this for loop eventually again.
	     * If the target is actually zero then we move to the next number and look
	     * for combinations with it
	     */
		for(int i = firstIndex; i < nums.length; i++) {
			int num = nums[i];
			if(num <= target) {
				ArrayList<Integer> tempArray1 = new ArrayList<Integer>();
				tempArray1.add(num);
				setAllCombos(nums, target-num, tempArray1, i);
			}
			
		}

	}
	

}
