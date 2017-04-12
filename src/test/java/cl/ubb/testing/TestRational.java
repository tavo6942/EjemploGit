package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRational {

	@Test
	public void AddTwoThirdAndFourFithShoulbeTwentyTwoFifteen() {
		//arrange
		Rational number1= new Rational(2,3);
		Rational number2= new Rational(4,5);
		Rational result;
		Rational expected= new Rational(22,15);
		//act
		result= number1.add(number2);
		
		//assert
		assertTrue(expected.equals(result));
		
	}
	@Test
	public void AddTwofourthAndFourFithShoulbeTwentySixTwenteen() {
		//arrange
		Rational number1= new Rational(2,4);
		Rational number2= new Rational(4,5);
		Rational result;
		Rational expected= new Rational(26,20);
		//act
		result= number1.add(number2);
		
		//assert
		assertTrue(expected.equals(result));

}
}
