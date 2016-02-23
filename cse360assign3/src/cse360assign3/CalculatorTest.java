package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();
	int total = 0;
	String aString = "boy";
	
	
	@Test
	public void testCalculator() {
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal() {
		total = calc.getTotal();
		assertTrue(total == 0);
	}
	
	@Test
	public void testAdd() {
		calc.add(50);
		total = calc.getTotal();
		assertTrue(total == 50);
	}
	
	@Test
	public void testSubtract() {
		calc.subtract(10);
		total = calc.getTotal();
		assertTrue(total == -10);
	}
	
	@Test
	public void testMultiply() {
		calc.add(100);
		calc.multiply(2);
		total = calc.getTotal();
		assertTrue(total == 200);
	}
	
	@Test
	public void testDivide() {
		calc.add(100);
		calc.divide(4);
		total = calc.getTotal();
		assertTrue(total == 25);
		calc.add(100);
		calc.divide(0);
		total = calc.getTotal();
		assertTrue(total == 0);
	}
	
	@Test
	public void testGetHistory() {
		aString = calc.getHistory();
		assertTrue(aString == "");
	}
}
