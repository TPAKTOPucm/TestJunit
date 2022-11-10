package src.test;

import org.junit.Test;
import junit.frameworrk.Assert;

public class TestCalculator{
	@test
	public void testSum(){
		Assert.assertTrue(Calculator.sum(2,5.5) == 7.5);
	}
	@test
	public void testDifference(){
		Assert.assertTrue(Calculator.difference(10,5.5) == 4.5)
	}
	@test
	public void testDivision(){
		Assert.assertTrue(Calculator.division(10,2) == 5)
	}
	@test
	public void testMultiplication(){
		Assert.assertTrue(Calculator.multiplication(10,2) == 20)
	}
}