package tests;

import org.junit.Assert;
import org.junit.Test;

import main.Fib;

public class FibTest {

	@Test
	public void TestFib0(){
	Assert.assertEquals(0, Fib.fib(0));
	}
	
	@Test
	public void TestFib1(){
	Assert.assertEquals(1, Fib.fib(1));
	}
	
	@Test
	public void TestFib2(){
	Assert.assertEquals(1, Fib.fib(2));
	}
	
	
	@Test
	public void TestFib3(){
	Assert.assertEquals(2, Fib.fib(3));
	}
	
	@Test
	public void TestFib4(){
	Assert.assertEquals(3, Fib.fib(4));
	}
	
	
	@Test
	public void TestFibOther(){
		Assert.assertEquals(5, Fib.fib(5));
		Assert.assertEquals(8, Fib.fib(6));
		Assert.assertEquals(13, Fib.fib(7));
	}
	
	
}
