package by.academy.classwork;

import org.junit.Test;

import by.academy.junit.Calculator;
import static junit.framework.Assert.assertEquals;;

public class FirstTest {
	@Test
	public void mathTest() {
		Assert.assertEquals(4, 2 + 2);

	}

	@Test
	public void mathDivide() {
		Assert.assertEquals(5, Calculator.divide(10, 2));
	}

	@Test(expected = ArithmeticException.class)
	public void testExceptin() {
	}

	@Test(timeout = 1000)
	public void timeout() {
		// todo coint 1000
	}

	@Test
	public void mamathDivide() {
		Assert.assertEquals(3, Calculator.divide(27, 9));
	}
}
