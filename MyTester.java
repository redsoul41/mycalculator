/*
	Author: Franz Joseph A. Abuel
	Student No: 2011-47257
	Section: CMSC 128 AB-6L
	Description: Testers for n-factorial and binarySearch functions
*/
import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	// nfactorial test for numbers greater than 1
	@Test
	public void testNfactorial1() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(5);
		assertEquals("The facorial of 5 is 120", 120, actual, 0);
	}
	
	// nfactorial test for n = 1
	@Test
	public void testNfactorial2() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(1);
		assertEquals("The facorial of 1 is 1", 1, actual, 0);
	}
	
	// nfactorial test for n = 0
	@Test
	public void testNfactorial3() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(0);
		assertEquals("The facorial of 0 is 1", 1, actual, 0);
	}

	// binarySearch test if searching for an existing element
	@Test
	public void testBinarySearch1() {
		MyCalculator mc = new MyCalculator();
		int [] array = {20, 15, 25, 5, 10};
		int actual;
		
		actual = mc.binarySearch(array, 25);
		assertEquals("25 is on index 2", 2, actual, 0);
	}
	
	// binarySearch test if searching for a non-existing element
	@Test
	public void testBinarySearch2() {
		MyCalculator mc = new MyCalculator();
		int [] array = {20, 15, 25, 5, 10};
		int actual;
		
		actual = mc.binarySearch(array, 12);
		assertEquals("12 does not exist on the array", -1, actual, 0);// the function should return -1 if the element to be searched does not exist
	}
	
	// binarySearch test if searching for an existing element on an array with one element
	@Test
	public void testBinarySearch3() {
		MyCalculator mc = new MyCalculator();
		int [] array = {0};
		int actual;
		
		actual = mc.binarySearch(array, 0);
		assertEquals("0 is on index 0", 0, actual, 0);
	}
	
	// binarySearch test if searching on an empty array
	@Test
	public void testBinarySearch4() {
		MyCalculator mc = new MyCalculator();
		int [] array = {};
		int actual;
		
		actual = mc.binarySearch(array, 0);
		assertEquals("0 is not on the array", -1, actual, 0);
	}
	
	// binarySearch test that shows that the function should return -1 instead of 1 since it is confusing to tell whether the element is on index 1 or does not exist.
	@Test
	public void testBinarySearch5() {
		MyCalculator mc = new MyCalculator();
		int [] array = {5, 10, 15, 20, 25};
		int actual;
		
		actual = mc.binarySearch(array, 10);
		assertEquals("10 is on index 1", 1, actual, 0);
	}

}
