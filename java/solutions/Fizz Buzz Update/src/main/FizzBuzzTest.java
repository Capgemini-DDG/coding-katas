package main;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testNull() {
		FizzBuzzMain main = new FizzBuzzMain();
		Assert.assertEquals("Null", main.result(8));
	}

	@Test
	public void test1() {
		FizzBuzzMain main = new FizzBuzzMain();
		Assert.assertEquals("Fizz", main.result(3));
	}

	@Test
	public void test2() {
		FizzBuzzMain main = new FizzBuzzMain();
		Assert.assertEquals("Buzz", main.result(5));
	}

	@Test
	public void test3() {
		FizzBuzzMain main = new FizzBuzzMain();
		Assert.assertEquals("FizzBuzz", main.result(15));
	}

	@Test
	public void test4() {
		FizzBuzzMain main = new FizzBuzzMain();
		Assert.assertEquals("FizzBuzz", main.result(45));
	}

	@Test
	public void test5() {
		FizzBuzzMain main = new FizzBuzzMain();
		Assert.assertEquals("Fizz", main.result(21));
	}

	@Test
	public void test6() {
		FizzBuzzMain main = new FizzBuzzMain();
		Assert.assertEquals("FizzBuzz", main.result(35));
	}

}
