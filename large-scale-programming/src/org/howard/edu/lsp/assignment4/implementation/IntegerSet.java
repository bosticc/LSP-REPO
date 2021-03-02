/**
 * 
 */
package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;

/**
 * @author bostic
 * MAKE AN INTEGER SET EXCEPTION
 */
public class IntegerSet  {

	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	
	public IntegerSet(ArrayList<Integer> set)
	{
		this.set = set;
	}

	/**
	 * Clears the set
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * Return the size of the set
	 * @return set.size() 
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order
	 * @param b other IntegerSet
	 * @return true/false
	 */
	public boolean equals(IntegerSet b) {
		if (b.getSet().size() != set.size())
		{
			return false;
		}
		for(int nums : set) {
			Boolean containsIt = false;
			for(int otherNums : b.getSet()) {
				if(otherNums == nums) {
					containsIt =  true;
				}
			}
			if(containsIt == false) {
				return containsIt;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether or not int is in the list
	 * @param value
	 * @return true/false
	 */
	public boolean contains(int value) {
		for(int nums : set){
			if(nums == value) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Throws an IntegerSetException if the set is empty, 
	 * otherwise returns the largest number
	 * @return largest the largest number
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
		if(set.size() == 0){
			try {
				throw new IntegerSetException("");
			}
			catch(IntegerSetException ex)
			{
				System.out.println(ex);
			}
		}
		int largest = 0;
		for(int nums: set){
			if(largest < nums){
				largest = nums;
			}
		}
		return largest;
	}
	
	/**
	 * Throws an IntegerSetException if the set is empty, 
	 * otherwise returns the smallest number
	 * @return largest the smallest number
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException
	{
		int smallest = 2147483647;
		if(set.size() == 0)
		{
			try {
				throw new IntegerSetException("");
			}
			catch(IntegerSetException ex)
			{
				System.out.println(ex);
			}
		}
		else {
			for(int nums: set) {
				if(nums < smallest) {
					smallest = nums;
				}
			}
			return smallest;
		}
		return 0;
	}
	
	/**
	 * Adds the item to the IntegerSet 
	 * @param item to be added
	 */
	public void add(int item) {
		boolean containsIt = false;
		for(int nums: set){
			if(nums == item){
				containsIt = true;
			}
		}
		if(containsIt == false)
		{
			set.add(item);
		}
	}
	
	/**
	 * Removes the item from the IntegerSet
	 * @param item to be removed
	 */
	public void remove(int item) {
		if(set.indexOf(item) != -1) {
			set.remove(set.indexOf(item));
		}
	}
	
	/**
	 * creates a set union with the parameter in the 
	 * original set
	 * @param intSetb to be unioned with
	 */
	public  void union(IntegerSet intSetb) {
	
		for(int nums: intSetb.getSet())
		{
			if(set.indexOf(nums) == -1)
			{
				set.add(nums);
			}
		}
	}
	
	/**
	 * creates a set intersection with the parameter in the 
	 * original set
	 * @param intSetb to be intersected with
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> tempSet = new ArrayList<Integer>();
		for(int nums: intSetb.getSet())
		{
			if(set.indexOf(nums) != -1)
			{
				tempSet.add(nums);
			}
		}
		set = tempSet;
	}
	
	/**
	 * creates a set difference with the parameter in the 
	 * original set
	 * @param intSetb to be differenced with
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> tempSet = new ArrayList<Integer>();
		for(int nums: intSetb.getSet())
		{
			if(set.indexOf(nums) == -1)
			{
				tempSet.add(nums);
			}
		}
		set = tempSet;
	}
	
	/**
	 * Returns a booolean on whether or not the set is empty
	 * @return true or false 
	 */
	public boolean isEmpty() {
		if(set.size() <= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns a set representation
	 * @return a string representation of the set
	 */
	public String toString() {
		return set.toString();
	}	// return String representation of your set

	/**
	 * Returns a set of the IntegerSetobject 
	 * @return set
	 */
	private ArrayList<Integer> getSet() {
		return set;
	}
	
}

