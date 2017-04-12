package cl.ubb.testing;

public class Rational {
	private int numerator;
	private int denominator;
	
	public  Rational(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	 
	public Rational add(Rational number) {
		int numeratorRes=this.numerator*number.denominator + this.denominator*number.numerator;
		int denominatorRes= this.denominator*number.denominator;
		
		return new Rational(numeratorRes, denominatorRes);
		
	}

}
