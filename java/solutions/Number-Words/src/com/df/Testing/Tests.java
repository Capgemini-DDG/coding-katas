package com.df.Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.df.App.Number_Words;

public class Tests 
{
	Number_Words nw = null;
	
	@Before
	public void setUp()
	{
		nw = new Number_Words();
	}
	
	@After
	public void tearDown()
	{
		nw = null;
	}
	
	@Test
	public void test() 
	{
		assertEquals("One", nw.Convert(1));
	}
	
	@Test
	public void test2() 
	{
		assertEquals("Two", nw.Convert(2));
	}
	
	@Test
	public void test3() 
	{
		assertEquals("Three", nw.Convert(3));
	}
	
	@Test
	public void test4() 
	{
		assertEquals("Ten", nw.Convert(10));
	}
	
	@Test
	public void test5() 
	{
		assertEquals("Twenty", nw.Convert(20));
	}
	
	@Test
	public void test6() 
	{
		assertEquals("Thirty", nw.Convert(30));
	}
	
	@Test
	public void test7()
	{
		assertEquals("Thirty Three", nw.Convert(33));
	}
	
	@Test
	public void test8()
	{
		assertEquals("Fifty Five", nw.Convert(55));
	}
	
	@Test
	public void test9()
	{
		assertEquals("Eighteen", nw.Convert(18));
	}

	@Test
	public void test10()
	{
		assertEquals("Twelve", nw.Convert(12));
	}
	
	@Test
	public void test11()
	{
		assertEquals("One Hundred", nw.Convert(100));
	}
	
	@Test
	public void test12()
	{
		assertEquals("Two Hundred", nw.Convert(200));
	}
	
	@Test
	public void test13()
	{
		assertEquals("One Hundred and Thirty Two", nw.Convert(132));
	}
	
	@Test
	public void test14()
	{
		assertEquals("Nine Hundred and Forty Nine", nw.Convert(949));
	}
	
	@Test
	public void test15()
	{
		assertEquals("One Thousand, Two Hundred and Thirty Nine", nw.Convert(1239));
	}
	
	@Test
	public void test16()
	{
		assertEquals("Four Thousand, Five Hundred and Sixty Eight", nw.Convert(4568));
	}
	
	@Test
	public void test17()
	{
		assertEquals("Five Hundred and Seventy Two", nw.Convert((int) 0572F));
	}
	
	@Test
	public void test18()
	{
		assertEquals("Nine Thousand, Two Hundred and One", nw.Convert(9201));
	}
	
	@Test
	public void test19()
	{
		assertEquals("Ten Thousand and Seventy Two", nw.Convert(10072));
	}
	
	@Test
	public void test20()
	{
		assertEquals("Ninety Nine Thousand, Nine Hundred and Ninety Nine", nw.Convert(99999));
	}
	
	@Test
	public void test21()
	{
		assertEquals("Seventy One Thousand, and Two", nw.Convert(71002));
	}
	
	@Test
	public void test22()
	{
		assertEquals("Thirty Four Thousand, Two Hundred and Eighty Seven", nw.Convert(34287));
	}
	
	@Test
	public void test23()
	{
		assertEquals("Ninety Nine Thousand, and One", nw.Convert(99001));
	}

	@Test
	public void test24()
	{
		assertEquals("Eight Hundred and Twenty Two Thousand, Seven Hundred and Fifty Six", nw.Convert(822756));
	}
	
	@Test
	public void test25()
	{
		assertEquals("Eight Hundred Thousand and Thirty One", nw.Convert(800031));
	}
	
	@Test
	public void test26()
	{
		assertEquals("Five Hundred and Twelve Thousand, and Nine", nw.Convert(512009));
	}
	
	@Test
	public void test27()
	{
		assertEquals("Three Hundred and Ten Thousand", nw.Convert(310000));
	}
	
	@Test
	public void test28()
	{
		assertEquals("Five Hundred Thousand, Seven Hundred", nw.Convert(500700));
	}
}