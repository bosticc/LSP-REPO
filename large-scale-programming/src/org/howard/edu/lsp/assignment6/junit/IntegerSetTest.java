/**
 * 
 */
package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.*;

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
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Builds and decomposes IntegerSet objects to make sure that they are equal to eachother.
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
		assertEquals(newSet.equals(otherSet), false);
	}

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
		assertEquals(newSet.equals(otherSet), true);
		// adding a element, they should now not be equal
		newList.add(493);
		assertEquals(newSet.equals(otherSet), false);
	}

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
		assertEquals(newSet.contains(0), true);
		assertEquals(newSet.contains(493), true);
		assertEquals(newSet.contains(39043), true);
		assertEquals(newSet.contains(454), false);
		assertEquals(newSet.contains(-1), false);
	}
	
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
	}
	
	
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
		
		
		assertEquals(newSet.contains(0), true);
		assertEquals(newSet.contains(493), true);
		assertEquals(newSet.contains(39043), true);
		assertEquals(newSet.contains(454), false);
		assertEquals(newSet.contains(-1), false);
	}
	
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
		assertEquals(newSet.contains(493), false);
		
		
		newSet.remove(2);
		assertEquals(newSet.contains(2), false);
		
		
		newSet.remove(43);
		assertEquals(newSet.contains(43), false);
	}
	
	
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
		assertEquals(newSet, interSection);
	}

	@Test
    @DisplayName("Test cases for union")
	public void testUnion() {
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
		assertEquals(newSet, newSet3);
	}
	
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
		assertEquals(newSet, newSet3);
	}
	
	
}
