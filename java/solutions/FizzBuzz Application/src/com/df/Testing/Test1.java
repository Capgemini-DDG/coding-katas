package com.df.Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.df.App.FizzBuzz;

public class Test1 
{
	FizzBuzz fb = null;
	
	@Before
	public void setUp()
	{
		fb = new FizzBuzz();
	}
	
	@After
	public void tearDown()
	{
		fb = null;
	}
	
	@Test
	public void testneg() 
	{
		assertEquals("-1", fb.inFizz(-1));
	}
	
	@Test
	public void test0() 
	{
		assertEquals("0", fb.inFizz(0));
	}
	
	@Test
	public void test1() 
	{
		assertEquals("1", fb.inFizz(1));
	}
	
	@Test
	public void test2() 
	{
		assertEquals("2", fb.inFizz(2));
	}
	
	@Test
	public void test3() 
	{
		assertEquals("Fizz", fb.inFizz(3));
	}
	
	@Test
	public void test4() 
	{
		assertEquals("4", fb.inFizz(4));
	}
	
	@Test
	public void test5() 
	{
		assertEquals("Buzz", fb.inFizz(5));
	}
	
	@Test
	public void test6() 
	{
		assertEquals("Fizz", fb.inFizz(6));
	}
	
	@Test
	public void test7() 
	{
		assertEquals("7", fb.inFizz(7));
	}
	
	@Test
	public void test8() 
	{
		assertEquals("8", fb.inFizz(8));
	}
	
	@Test
	public void test9() 
	{
		assertEquals("Fizz", fb.inFizz(9));
	}
	
	@Test
	public void test10() 
	{
		assertEquals("Buzz", fb.inFizz(10));
	}
	
	@Test
	public void test11() 
	{
		assertEquals("11", fb.inFizz(11));
	}
	
	@Test
	public void test12() 
	{
		assertEquals("Fizz", fb.inFizz(12));
	}
	
	@Test
	public void test13() 
	{
		assertEquals("Fizz", fb.inFizz(13));
	}
	
	@Test
	public void test14() 
	{
		assertEquals("14", fb.inFizz(14));
	}
	
	@Test
	public void test15() 
	{
		assertEquals("FizzBuzz", fb.inFizz(15));
	}
	
	@Test
	public void test16() 
	{
		assertEquals("16", fb.inFizz(16));
	}
	
	@Test
	public void test17() 
	{
		assertEquals("17", fb.inFizz(17));
	}
	
	@Test
	public void test18() 
	{
		assertEquals("Fizz", fb.inFizz(18));
	}
	
	@Test
	public void test19() 
	{
		assertEquals("19", fb.inFizz(19));
	}
	
	@Test
	public void test20() 
	{
		assertEquals("Buzz", fb.inFizz(20));
	}
	
	@Test
	public void test21() 
	{
		assertEquals("Fizz", fb.inFizz(21));
	}
	
	@Test
	public void test22() 
	{
		assertEquals("22", fb.inFizz(22));
	}
	
	@Test
	public void test23() 
	{
		assertEquals("Fizz", fb.inFizz(23));
	}
	
	@Test
	public void test24() 
	{
		assertEquals("Fizz", fb.inFizz(24));
	}
	
	@Test
	public void test25() 
	{
		assertEquals("Buzz", fb.inFizz(25));
	}
	
	@Test
	public void test26() 
	{
		assertEquals("26", fb.inFizz(26));
	}
	
	@Test
	public void test27() 
	{
		assertEquals("Fizz", fb.inFizz(27));
	}
	
	@Test
	public void test28() 
	{
		assertEquals("28", fb.inFizz(28));
	}
	
	@Test
	public void test29() 
	{
		assertEquals("29", fb.inFizz(29));
	}
	
	@Test
	public void test30() 
	{
		assertEquals("FizzBuzz", fb.inFizz(30));
	}
	
	@Test
	public void test31() 
	{
		assertEquals("Fizz", fb.inFizz(31));
	}
	
	@Test
	public void test32() 
	{
		assertEquals("Fizz", fb.inFizz(32));
	}
	
	@Test
	public void test33() 
	{
		assertEquals("Fizz", fb.inFizz(33));
	}
	
	@Test
	public void test34() 
	{
		assertEquals("Fizz", fb.inFizz(34));
	}
	
	@Test
	public void test35() 
	{
		assertEquals("FizzBuzz", fb.inFizz(35));
	}
	
	@Test
	public void test36() 
	{
		assertEquals("Fizz", fb.inFizz(36));
	}
	
	@Test
	public void test37() 
	{
		assertEquals("Fizz", fb.inFizz(37));
	}
	
	@Test
	public void test38() 
	{
		assertEquals("Fizz", fb.inFizz(38));
	}
	
	@Test
	public void test39() 
	{
		assertEquals("Fizz", fb.inFizz(39));
	}
	
	@Test
	public void test40() 
	{
		assertEquals("Buzz", fb.inFizz(40));
	}
	
	@Test
	public void test41() 
	{
		assertEquals("41", fb.inFizz(41));
	}
	
	@Test
	public void test42() 
	{
		assertEquals("Fizz", fb.inFizz(42));
	}
	
	@Test
	public void test43() 
	{
		assertEquals("Fizz", fb.inFizz(43));
	}
	
	@Test
	public void test44() 
	{
		assertEquals("44", fb.inFizz(44));
	}
	
	@Test
	public void test45() 
	{
		assertEquals("FizzBuzz", fb.inFizz(45));
	}
	
	@Test
	public void test46() 
	{
		assertEquals("46", fb.inFizz(46));
	}
	
	@Test
	public void test47() 
	{
		assertEquals("47", fb.inFizz(47));
	}
	
	@Test
	public void test48() 
	{
		assertEquals("Fizz", fb.inFizz(48));
	}
	
	@Test
	public void test49() 
	{
		assertEquals("49", fb.inFizz(49));
	}
	
	@Test
	public void test50() 
	{
		assertEquals("Buzz", fb.inFizz(50));
	}
	
	@Test
	public void test51() 
	{
		assertEquals("FizzBuzz", fb.inFizz(51));
	}
	
	@Test
	public void test52() 
	{
		assertEquals("Buzz", fb.inFizz(52));
	}
	
	@Test
	public void test53() 
	{
		assertEquals("FizzBuzz", fb.inFizz(53));
	}
	
	@Test
	public void test54() 
	{
		assertEquals("FizzBuzz", fb.inFizz(54));
	}
	

	@Test
	public void test55() 
	{
		assertEquals("Buzz", fb.inFizz(55));
	}
	
	@Test
	public void test56() 
	{
		assertEquals("Buzz", fb.inFizz(56));
	}
	
	@Test
	public void test57() 
	{
		assertEquals("FizzBuzz", fb.inFizz(57));
	}
	
	@Test
	public void test58() 
	{
		assertEquals("Buzz", fb.inFizz(58));
	}
	
	@Test
	public void test59() 
	{
		assertEquals("Buzz", fb.inFizz(59));
	}
	
	@Test
	public void test60() 
	{
		assertEquals("FizzBuzz", fb.inFizz(60));
	}
	
	public void test61() 
	{
		assertEquals("61", fb.inFizz(61));
	}
	
	@Test
	public void test62() 
	{
		assertEquals("62", fb.inFizz(62));
	}
	
	@Test
	public void test63() 
	{
		assertEquals("Fizz", fb.inFizz(63));
	}
	
	@Test
	public void test64() 
	{
		assertEquals("64", fb.inFizz(64));
	}

	@Test
	public void test65() 
	{
		assertEquals("Buzz", fb.inFizz(65));
	}
	
	@Test
	public void test66() 
	{
		assertEquals("Fizz", fb.inFizz(66));
	}
	
	@Test
	public void test67() 
	{
		assertEquals("67", fb.inFizz(67));
	}
	
	@Test
	public void test68() 
	{
		assertEquals("68", fb.inFizz(68));
	}
	
	@Test
	public void test69() 
	{
		assertEquals("Fizz", fb.inFizz(69));
	}
	
	@Test
	public void test70() 
	{
		assertEquals("Buzz", fb.inFizz(70));
	}
	
	public void test71() 
	{
		assertEquals("71", fb.inFizz(71));
	}
	
	@Test
	public void test72() 
	{
		assertEquals("Fizz", fb.inFizz(72));
	}
	
	@Test
	public void test73() 
	{
		assertEquals("Fizz", fb.inFizz(73));
	}
	
	@Test
	public void test74() 
	{
		assertEquals("74", fb.inFizz(74));
	}

	@Test
	public void test75() 
	{
		assertEquals("FizzBuzz", fb.inFizz(75));
	}
	
	@Test
	public void test76() 
	{
		assertEquals("76", fb.inFizz(76));
	}
	
	@Test
	public void test77() 
	{
		assertEquals("77", fb.inFizz(77));
	}
	
	@Test
	public void test78() 
	{
		assertEquals("Fizz", fb.inFizz(78));
	}
	
	@Test
	public void test79() 
	{
		assertEquals("79", fb.inFizz(79));
	}
	
	@Test
	public void test80() 
	{
		assertEquals("Buzz", fb.inFizz(80));
	}
}