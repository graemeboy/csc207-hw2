package cs207.hw2;

public class TwoB {
	/*
	 * @pre: none.
	 * @post: result is the average of the two numbers
	 */
	public static int average (int left, int right) 
	{
		/*
		 * If the sum of the two numbers exceeds 
		 * MAX_VALUE but the average doesn't the method 
		 * leads to an incorrect result.
		 * We fixed it by changing the order of operations:
		 * we divide each side by two first and then add
		 * the results.
		 * 
		 */
		double leftHalf = left/2.0;
		double rightHalf = right/2.0;
		double result = leftHalf + rightHalf;
		
		return (int)result;
	} // average (int,int)
	
}
