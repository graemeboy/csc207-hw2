package cs207.hw2;
public class TwoA {
	/**
	   * Determines whether an integer is a multiple of 
	   * the other integer
	   * 
	   * @param long a, long b
	   * @return true or false
	   * @pre b is non-zero
	   * @post returns true if there exists an integer i
	   * such that a == b*i, or false otherwise
	   */
	public static boolean isMultiple(long a, long b) 
	{	
		/*
		 * 	If the quotient of a and b do not produce a remainder,
		 * 	then that means that b is a multiple of long a.
		 */
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	} // isMultiple(long, long)
	/**
	   * Determines whether an integer is odd
	   * 
	   * @param int a
	   *          an integer
	   * @return true or false
	   * @pre none
	   * @post returns true if a is odd and false otherwise
	   */
	public static boolean isOdd(int a)
	{
		/* Since binary representations end on 1 if odd,
		 * and 0 if even, we can just check the last character
		 * of int a's binary representation to determine whether it is
		 * an odd number.
		 */
		String binary = Integer.toBinaryString(a);
		char lastChar = binary.charAt(binary.length() - 1);
		if (lastChar == '1') {
			return true;
		} else {
			return false;
		}
	} // isOdd(int)
	
	 /**
	   * Sum all of the integers in an array.
	   * 
	   * @param int n
	   *          a positive integer
	   * @return sum, an integer
	   * @pre n is a non-negative integer
	   * @post sum is the sum of all odd integers smaller than n
	   */
	public static int oddSumTo(int n)
	{
		/* if the integer is not an odd number, then the 
		 * "odd sum" is the square of its half. 
		 * Otherwise, it is the square of its half, minus 1.
		 */
		if (isOdd(n)) 
			n--;
		return (n/2)*(n/2);
	} // oddSumTo(int)
	/**
	   * Determine whether the product of 
	   * any pair of numbers in an array is odd
	   * 
	   * @param int array ints[]
	   *          an array of integers
	   * @return true or false
	   * @pre none
	   * @post none
	   */
	public static boolean isOddProduct(int[] ints)
	{
		// Go through the list and determine whether
		// more than 1 of the numbers is odd. If so, then
		// there will be a pair the product of which is odd.
		int numberOfOdds = 0;
		for (int i = 0; i < ints.length; i++)
		{
			if (isOdd(ints[i]))
				numberOfOdds++;
			if (numberOfOdds == 2)
				return true;
		}
		return false;
	} // isOddProduct(int[])
	
	/**
	   * Determine whether all elements in the array
	   * are distinct from one another.
	   * 
	   * @param int array ints[]
	   *          an array of integers
	   * @return true or false
	   * @pre none
	   * @post none
	   */
	public static boolean allDistinct(int[] ints)
	{
		for (int i = 0; i < ints.length; i++) 
		{
			for (int x = 0; x < ints.length; x++)
			{
				if (i != x && ints[i] == ints[x])
					return false;
			}
		}
		return true;
	} // allDistinct(int[])
	
	/**
	   * Returns an array containing the elements 
	   * in a given array of integers, in the reverse order.
	   *  
	   * @param int array ints[]
	   *          an array of integers
	   * @return ints[]
	   * 	an array of integers
	   * @pre none
	   * @post none
	   */
	public static int[] reverseInts(int[] ints) 
	{
		int temp;
		for (int i = 0; i < ints.length/2; i++)
		{
			temp = ints[i];
			ints[i] = ints[ints.length - i - 1];
			ints[ints.length - i - 1] = temp;
		}
		return ints;
	} // reverseInt(int[])

}
