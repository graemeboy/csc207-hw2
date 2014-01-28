package cs207.hw2;
/**
 * Provides useful methods for dealing with rational numbers.
 */
public class Rational {
	// +--------+---------------------------------------------------------
	// | Fields |
	// +--------+
	/* the numerator of the number */
	int numerator;
	/* the denominator of the number */
	int denominator;

	// +--------------+---------------------------------------------------
	// | Constructors |
	// +--------------+
	/* Fraction constructor (Constructor) */
	public Rational(int num, int den) 
	{
		numerator = num;
		denominator = den;
	}

	/* Integer constructor (Constructor) */
	public Rational(int num) 
	{
		numerator = num;
		denominator = 1;
	}

	/*
	 * Returns a clone of the existing rational number, that has already been
	 * constructed. (Constructor)
	 */
	public Rational clone() 
	{
		return null;
	} // clone

	// +---------+--------------------------------------------------------
	// | Methods |
	// +---------+

	/* Return the numerator of the rational number (Getter) */
	public int getNumerator() 
	{
		return numerator;
	} // getNumerator

	/* Return the denominator of the rational number (Getter) */
	public int getDenominator() 
	{
		return denominator;
	} // getDenominator

	/*
	 * Return the floating point value of the rational number (Observer)
	 */
	public double getDecimal() 
	{
		return numerator / denominator;
	} // getDecimal

	/*
	 * Returns the sum of this and another rational number
	 * (Constructor/Observer)
	 */
	public Rational add(Rational a) 
	{
		return null; // STUB
	} // add (Rational)

	/*
	 * Returns the difference between this and another rational number.
	 * (Constructor/Observer)
	 */
	public Rational subtract(Rational a) 
	{
		return null; // STUB
	} // subtract (Rational)

	/*
	 * Returns the quotient of this and another rational number.
	 * (Constructor/Observer)
	 */
	public Rational divide(Rational a) 
	{
		return null; // STUB
	} // divide (Rational)

	/*
	 * Returns the value of this rational number raised to the power an integer
	 * rational number. (Constructor/Observer)
	 */
	public Rational exponent(int p) 
	{
		return null; // STUB
	} // exponent (int)

	/*
	 * Returns true if this rational number equals another. (Observer)
	 */
	public boolean equals(Rational a) 
	{
		return true; // STUB
	} // equals (Rational)

	/*
	 * Returns -1 if this object is less than the value of the parameter, 0 if
	 * equal to it, and 1 if greater than it. (Observer)
	 */
	public int compareTo(Rational a) 
	{
		return 0; // STUB
	} // compareTo (Rational)

	public String toString (Rational a) 
	{
		return null;
	} // toString (Rational)

} // class Rational