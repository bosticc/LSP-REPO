/**
 * 
 */
package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * @author bostic
 *
 */
public class IntegerSetTest {

	/**
	 * Tests objects to make sure that they are equal to eachother.
	 */
	@Test
    @DisplayName("Test cases for equals")
	public void testEquals() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> otherList = new ArrayList<Integer>();

		// Should result in the two lists being equal, in any order 
		newList.add(493);
		newList.add(308);
		newList.add(257);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		
		otherList.add(493);
		otherList.add(257);
		otherList.add(308);
		otherList.add(493);
		otherList.add(2);
		otherList.add(493);
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet otherSet = new IntegerSet(otherList);
		assertEquals(newSet.equals(otherSet), true);
		
		// adding a element, they should now not be equal
		newList.add(493);
		assertFalse(newSet.equals(otherSet));
	}
	
	/**
	 * Tests IntegerSet objects to make sure when one is cleared its equal to an empty one
	 */
	@Test
    @DisplayName("Test cases for clear")
	public void testClear() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> otherList = new ArrayList<Integer>();

		// Should result in the two lists being equal since one is cleared
		// and the other has nothing added to it 
		newList.add(493);
		newList.add(308);
		newList.add(257);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		
		
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet otherSet = new IntegerSet(otherList);
		newList.clear();
		assertTrue(newSet.equals(otherSet));
		
		// adding a element, they should now not be equal
		newList.add(493);
		assertFalse(newSet.equals(otherSet));
	}

	/**
	 * Tests IntegerSet object and makes sure the length is equal to the actual length
	 */
	@Test
    @DisplayName("Test cases for length")
	public void testLength() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		// Should result in the list size being equal to 4
		newList.add(493);
		newList.add(308);
		newList.add(257);
		newList.add(493);
		
		
		IntegerSet newSet = new IntegerSet(newList);
		assertEquals(newSet.length(), 4);
		newList.add(493);
		
		// Now it should be equal to 5
		assertEquals(newSet.length(), 5);
		
		
		// Now it should be equal to 0
		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		IntegerSet emptySet = new IntegerSet(emptyList);
		assertEquals(emptySet.length(), 0);
	}

	/**
	 * Tests IntegerSet object and makes sure number in the object
	 * are being reported 
	 */
	@Test
    @DisplayName("Test cases for contains")
	public void testContains() {
		ArrayList<Integer> newList = new ArrayList<Integer>();

		// Making sure that all the integers OF DIFFERENT SIZES
		// in the set are accounted for using contains 
		newList.add(493);
		newList.add(0);
		newList.add(39043);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		
		
		IntegerSet newSet = new IntegerSet(newList);
		assertTrue(newSet.contains(0));
		assertTrue(newSet.contains(493));
		assertTrue(newSet.contains(39043));
		assertFalse(newSet.contains(454));
		assertFalse(newSet.contains(-1));
	}
	
	/**
	 * Tests IntegerSet objects and makes sure the largest is being thrown back
	 */
	@Test
    @DisplayName("Test cases for largest")
	public void testLargest() throws IntegerSetException {
		try {
			ArrayList<Integer> newList = new ArrayList<Integer>();
			ArrayList<Integer> emptyList = new ArrayList<Integer>();

			// Making sure that all the integers OF DIFFERENT SIZES
			// in the set are accounted for using contains 
			newList.add(493);
			newList.add(0);
			newList.add(39043);
			newList.add(493);
			newList.add(2);
			newList.add(493);
			IntegerSet newSet = new IntegerSet(newList);
			
			// Makes sure that we actually get the largest
			assertEquals(newSet.largest(), 39043);
			
			// Now we see if we can do an empty list
			IntegerSet blankSet = new IntegerSet(emptyList);
			assertEquals(blankSet.largest(), 0);
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}	
		
	}
	
	/**
	 * Tests IntegerSet objects and makes sure the smallest is being thrown back
	 */
	@Test
    @DisplayName("Test cases for smallest")
	public void testSmallest() throws IntegerSetException {
		try {
			ArrayList<Integer> newList = new ArrayList<Integer>();
			ArrayList<Integer> emptyList = new ArrayList<Integer>();

			// Making sure that all the integers OF DIFFERENT SIZES
			// in the set are accounted for using contains 
			newList.add(0);
			newList.add(493);
			newList.add(39043);
			newList.add(493);
			newList.add(2);
			newList.add(493);
			IntegerSet newSet = new IntegerSet(newList);
			
			// Makes sure that we actually get the largest
			assertEquals(newSet.smallest(), 0);
			
			// Now we remove the smallest 
			newList.remove(0);
			assertEquals(newSet.smallest(), 2);

			// Now we see if we can do an empty list
			IntegerSet blankSet = new IntegerSet(emptyList);
			assertEquals(blankSet.largest(), 0);
			
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		/*\
		 * 		Exception exception = assertThrows(RuntimeException.class, () -> {}
		 */
	}
	
	/**
	 * Tests IntegerSet objects and makes sure add fn 
	 * is actually adding to the set
	 */
	@Test
    @DisplayName("Test cases for add")
	public void testAdd() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		IntegerSet newSet = new IntegerSet(newList);

		// Making sure that all the integers OF DIFFERENT SIZES
		// in the set are accounted for using contains 
		newSet.add(493);
		newSet.add(0);
		newSet.add(39043);
		newSet.add(493);
		newSet.add(2);
		newSet.add(493);
		
		
		assertTrue(newSet.contains(0));
		assertTrue(newSet.contains(493));
		assertTrue(newSet.contains(39043));
		assertFalse(newSet.contains(454));
		assertFalse(newSet.contains(-1));
	}
	
	/**
	 * Tests IntegerSet objects and makes sure remove fn 
	 * is actually remove the number
	 */
	@Test
    @DisplayName("Test cases for remove")
	public void testRemove() throws IntegerSetException {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		IntegerSet newSet = new IntegerSet(newList);

		// Making sure that all the integers OF DIFFERENT SIZES
		// in the set are accounted for using contains 
		newSet.add(493);
		newSet.add(2);
		newSet.add(43);
		newSet.add(3433);
		
		newSet.remove(493);
		assertFalse(newSet.contains(493));
		
		
		newSet.remove(2);
		assertFalse(newSet.contains(2));
		
		
		newSet.remove(43);
		assertFalse(newSet.contains(43));
	}
	
	
	/**
	 * Tests IntegerSet objects and makes sure intersectino fn 
	 * is actually intersecting the set
	 */
	@Test
    @DisplayName("Test cases for intersection")
	public void testIntersection()  {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> otherList = new ArrayList<Integer>();
		ArrayList<Integer> interSectionList = new ArrayList<Integer>();
		
		interSectionList.add(493);
		interSectionList.add(257);
		interSectionList.add(308);
		interSectionList.add(493);
		interSectionList.add(493);
		
		// Should result in the two lists being equal, in any order 
		newList.add(493);
		newList.add(308);
		newList.add(257);
		newList.add(493);
		newList.add(2);
		newList.add(493);
		
		otherList.add(493);
		otherList.add(257);
		otherList.add(308);
		otherList.add(493);
		otherList.add(493);
		IntegerSet newSet = new IntegerSet(newList);
		IntegerSet otherSet = new IntegerSet(otherList);
		IntegerSet interSection = new IntegerSet(interSectionList);
		newSet.intersect(otherSet);
		
		// This means the OG set should be equal to the set that is actually a intersection
		assertEquals(newSet.toString(), interSection.toString());
	}

	
	/**
	 * Tests IntegerSet objects and makes sure union fn 
	 * is actually unioning the set
	 */
	@Test
    @DisplayName("Test cases for union")
	public void testUnion() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		ArrayList<Integer> unionList = new ArrayList<Integer>();
		newList.add(1);
		newList.add(2);
		tempList.add(2);
		tempList.add(3);
		tempList.add(4);
		unionList.add(1);
		unionList.add(2);
		unionList.add(3);
		unionList.add(4);
		IntegerSet newSet = new IntegerSet(unionList);
		IntegerSet newSet2 = new IntegerSet(tempList);
		newSet.union(newSet2);
		
		
		// This means the OG set should be equal to the set that is actually a union
		assertEquals(newSet.toString(), unionList.toString());
	}

	
	/**
	 * Tests IntegerSet objects and makes sure union fn 
	 * is actually unioning the set
	 */
	@Test
    @DisplayName("Test cases for difference")
	public void testDifference() {
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
		
		// This means the OG set should be equal to the set that is actually a difference
		assertNotEquals(newSet, newSet3);
	}
	
	
}
