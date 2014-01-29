package cs207.hw2;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

	@Test
	public void isMultipleTest() 
	{

		assertEquals("81 is a multiple of 3", true, 
				TwoA.isMultiple(81, 3));
		assertEquals("80 is not a multiple of 17", false,
				TwoA.isMultiple(80, 17));
		assertEquals("23 is not a multiple of 56", false,
				TwoA.isMultiple(23, 46));
	}

	@Test
	public void isOddTest1() 
	{
		assertEquals("positive odd", true, TwoA.isOdd(23));
		assertEquals("positive even", false, TwoA.isOdd(346));
		assertEquals("negative even", false, TwoA.isOdd(-4));
		assertEquals("negative odd", true, TwoA.isOdd(-27));
		assertEquals("MAX_VALUE", true, 
				TwoA.isOdd(Integer.MAX_VALUE));
	}

	@Test
	public void oddSumToTest1() 
	{
		assertEquals("1 sums to 0", 0, TwoA.oddSumTo(1));
		assertEquals("9 sums to 16", 16, TwoA.oddSumTo(9));
		assertEquals("15 sums to 49", 49, TwoA.oddSumTo(15));
		assertEquals("8 sums to 16", 16, TwoA.oddSumTo(8));
	}

	@Test
	public void allDistinctTest() 
	{
		int[] ints = { 1, 2, 3, 4, 5 };
		assertEquals("all numbers are distinct: true", true,
				TwoA.allDistinct(ints));

		int[] ints1 = { 1 };
		assertEquals("single element: true", true,
				TwoA.allDistinct(ints1));

		int[] ints2 = { 1, 2, 3, 4, 2 };
		assertEquals("all numbers are distinct: false", false,
				TwoA.allDistinct(ints2));
		
		int[] ints3 = { };
		assertEquals("null: true", true,
				TwoA.allDistinct(ints3));
	}

	@Test
	public void reverseIntsTest() 
	{
		int[] ints = { 1, 2, 3, 4, 5 };
		int[] rsCorrect = { 5, 4, 3, 2, 1 };
		TwoA.reverseInts(ints);
		assertArrayEquals ("odd number of elements", rsCorrect, ints);
		
		int[] ints1 = { 1, 2, 3, 4, 5, 6 };
		int[] rsCorrect1 = {6, 5, 4, 3, 2, 1 };
		TwoA.reverseInts(ints1);
		assertArrayEquals ("even number of elements", rsCorrect1, ints1);
		
		int[] ints2 = { 1};
		int[] rsCorrect2 = {1 };
		TwoA.reverseInts(ints2);
		assertArrayEquals ("one element", rsCorrect2, ints2);
		 
		int[] ints3 = { };
		int[] rsCorrect3 = { };
		TwoA.reverseInts(ints3);
		assertArrayEquals ("null", rsCorrect3, ints3);
	}
}
