/**
 * 
 */
package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

/**
 * @author bostic
 * 
 */
public class Driver {
	
	/**
	 * created to run tests
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(emptyArray());
		System.out.println(clearSet());
		System.out.println(checkLength());	
		System.out.println(checkSameOrderSets());	
		System.out.println(checkDifferentOrderSets());	
		System.out.println(twoDifferentSizeSets());	
		System.out.println(twoDifferentSets());	
		System.out.println(contains2());
		
		try {
			System.out.println(emptyIntegerSet());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}	
		
		try {
			System.out.println(graduallyLargerNumbers());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(graduallySmallerNumbers());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		System.out.println(addANumberAlreadyThere());
		System.out.println(removeTwoNumbers());
		System.out.println(setUnionTest());
		System.out.println(setIntersectionTest());
		System.out.println(setDifferenceTest());
		
	}
	
	/**
	 * Returns a boolean on whether or not the array is empty
	 * @return emptyArray.isEmpty(), Boolean for whether or not the array is empty
	 */
	public static Boolean emptyArray() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		IntegerSet emptyArray = new IntegerSet(newList);
		return emptyArray.isEmpty();
	}
	/**
	 * Returns a boolean on whether or not the array is cleared
	 * @return true or false on whether or not the set has been cleared
	 */	
	public static Boolean clearSet() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(5);
		newList.add(2);
		IntegerSet newSet = new IntegerSet(newList);
		newSet.clear();
		if(newList.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns a boolean on whether not not the length is correct
	 * @return newList.size() == newSet.length() , Boolean on whether or not the length is correct
	 */
	public static Boolean checkLength() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(493);
		newList.add(257);
		newList.add(308);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		IntegerSet newSet = new IntegerSet(newList);
		return newList.size() == newSet.length();
	}
	
	/**
	 * Checks to make sure both sets created 
	 * are in the same order. Notice that 
	 * both sets point to the same arraylist.
	 * @return newSet.equals(newSet1)
	 */
	public static Boolean checkSameOrderSets() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(493);
		newList.add(257);
		newList.add(308);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		ArrayList<Integer> newList1 = newList;
		
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet newSet1 = new IntegerSet(newList1);

		return newSet.equals(newSet1);
	}
	
	/**
	 * Check to make sure different order sets with same #'s
	 * can be returned as the same set 
	 * @return newSet.equals(newSet1) 
	 */
	public static Boolean checkDifferentOrderSets() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> newList1 = new ArrayList<Integer>();
		newList.add(493);
		newList.add(257);
		newList.add(308);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		
		newList1.add(493);
		newList1.add(2);
		newList1.add(493);
		newList1.add(308);
		newList1.add(257);
		newList1.add(493);
		
		
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet newSet1 = new IntegerSet(newList1);

		return newSet.equals(newSet1);
	}
	
	/**
	 * Check to make sure that two different sized sets cant be equal
	 * @return newSet.equals(newSet1) whether or not two different sets are 
	 * equal
	 */
	public static Boolean twoDifferentSizeSets() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> newList1 = new ArrayList<Integer>();
		newList.add(493);
		newList.add(257);
		newList.add(308);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		
		newList1.add(493);
		newList1.add(2);
		newList1.add(493);
		newList1.add(308);
		newList1.add(257);
		
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet newSet1 = new IntegerSet(newList1);

		return newSet.equals(newSet1);
	}
	
	/**
	 * Checks to make sure that two sets with some of the same elements 
	 * don't return them being equal
	 * @return newSet.equals(newSet1) whether or not two different sets are 
	 * equal
	 */
	public static Boolean twoDifferentSets() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> newList1 = new ArrayList<Integer>();
		newList.add(493);
		newList.add(257);
		newList.add(308);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		
		newList1.add(493);
		newList1.add(2);
		newList1.add(493);
		newList1.add(308);
		newList1.add(257);
		newList.add(491);

		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet newSet1 = new IntegerSet(newList1);

		return newSet.equals(newSet1);
	}
	
	/**
	 * Checks to make sure that a 2 contained in the 
	 * list is acutally found and returns true
	 * @return true or false 
	 */
	public static Boolean contains2() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(493);
		newList.add(257);
		newList.add(308);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		
		IntegerSet newSet = new IntegerSet(newList);

		return newSet.contains(2);
	}
	
	/**
	 * Makes sure the element being returned is not 0, checks to make sure
	 * it is not empty
	 * @return newSet.largest() == 493 
	 * @throws IntegerSetException
	 */
	public static Boolean allEqualNumbers() throws IntegerSetException {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(493);
		newList.add(493);
		newList.add(493);
		newList.add(493);
		newList.add(493);
		newList.add(493);
		
		IntegerSet newSet = new IntegerSet(newList);

		return newSet.largest() == 493;
	}
	
	/**
	 * Sees if the IntegerSetException is returned with an empty 
	 * integer set
	 * @return newSet.largest() the largest # from the empty set
	 * @throws IntegerSetException
	 */
	public static int emptyIntegerSet() throws IntegerSetException {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		IntegerSet newSet = new IntegerSet(newList);

		return newSet.largest();
	}
	
	/**
	 * Checks to make sure that the largest number is being returned
	 * @return true or false based on the largest number
	 * @throws IntegerSetException
	 */
	public static Boolean graduallyLargerNumbers() throws IntegerSetException {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		newList.add(5);
		IntegerSet newSet = new IntegerSet(newList);

		return newSet.largest() == 5;
	}
	
	/**
	 * Checks to make sure that the smallest number is being returned
	 * @return true or false based on the smallest number
	 * @throws IntegerSetException
	 */
	public static Boolean graduallySmallerNumbers() throws IntegerSetException {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(-2147483648);
		newList.add(-8);
		newList.add(-4);
		newList.add(-2);
		IntegerSet newSet = new IntegerSet(newList);

		return newSet.smallest() == -2147483648;
	}
	
	/**
	 * Checks to make sure that the largest number is being returned
	 * @return true or false based on the largest number
	 * @throws IntegerSetException
	 */
	public static Boolean addANumberAlreadyThere() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = newList;
		newList.add(8);
		newList.add(8);
		newList.add(4);
		IntegerSet newSet = new IntegerSet(newList);
		newSet.add(8);
		return newList == tempList;
	}
	
	/**
	 * Checks to make sure that the number is being removed and 
	 * its equal to the other set created
	 * @return true or false based on the array returned
	 */
	public static Boolean removeTwoNumbers() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		newList.add(8);
		newList.add(4);
		tempList.add(4);
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet newSet2 = new IntegerSet(tempList);
		newSet.remove(8);
		return newSet.equals(newSet2);
	}
	
	/**
	 * Checks to make sure that the correct union is being returned
	 * @return true or false based on the correct list
	 */
	public static Boolean setUnionTest() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		ArrayList<Integer> tempList2 = new ArrayList<Integer>();
		newList.add(1);
		newList.add(2);
		tempList.add(2);
		tempList.add(3);
		tempList.add(4);
		tempList2.add(1);
		tempList2.add(2);
		tempList2.add(3);
		tempList2.add(4);
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet newSet2 = new IntegerSet(tempList);
		IntegerSet newSet3 = new IntegerSet(tempList2);
		newSet.union(newSet2);
		return newSet.equals(newSet3);
	}

	/**
	 * Checks to make sure that the set intersection is being returned
	 * @return true or false based on the correct list
	 */
	public static Boolean setIntersectionTest() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		ArrayList<Integer> tempList2 = new ArrayList<Integer>();
		newList.add(1);
		newList.add(2);
		newList.add(3);
		tempList.add(2);
		tempList.add(3);
		tempList.add(4);
		tempList2.add(2);
		tempList2.add(3);
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet newSet2 = new IntegerSet(tempList);
		IntegerSet newSet3 = new IntegerSet(tempList2);
		newSet.intersect(newSet2);
		return newSet.equals(newSet3);
	}
	/**
	 * Checks to make sure that the set difference is being returned
	 * @return true or false based on the correct list
	 */
	public static Boolean setDifferenceTest() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		ArrayList<Integer> tempList2 = new ArrayList<Integer>();
		newList.add(1);
		newList.add(2);
		newList.add(3);
		tempList.add(2);
		tempList.add(3);
		tempList.add(4);
		tempList2.add(1);
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet newSet2 = new IntegerSet(tempList);
		IntegerSet newSet3 = new IntegerSet(tempList2);
		newSet.intersect(newSet2);
		System.out.println(newSet);
		return newSet.equals(newSet3);
	}
	
}
