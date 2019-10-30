package javadoc;

/**
 * Class that represents a fraction
 * @author Avram Neal
 *
 */

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	/**
	 * Default constructor. creates 0/1
	 */
	public Fraction() {
		this(0,1);
	}
	
	/**
	 * One parameter constructor. creates number/1
	 * @param number this is the value for the numerator
	 */
	public Fraction(int number) {
		this(number,1);
	}
	
	/**
	 * One parameter constructor. creates frac/frac
	 * @param frac this is the value for the numerator and the denominator
	 */
	public Fraction(Fraction frac) {
		this(frac.getNumerator(), frac.getDenominator());
	}
	
	/**
	 * Two parameter constructor. creates num/denom
	 * @param num this is the value for the numerator
	 * @param denom this is the value for the denominator
	 */
	public Fraction(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	
	/**
	 * Getter for Numerator
	 * @return numerator the numerator
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * Setter for Numerator
	 * @param numerator the numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	/**
	 * Getter for Denominator
	 * @return denominator the denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Setter for Denominator
	 * @param denominator the denominator
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	/**Computes the fraction
	 * 
	 * @return the result of division
	 */
	public int compute() {
		return this.numerator / this.denominator;
	}
}

