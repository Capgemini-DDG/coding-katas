package com.df.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.df.Program.Roman_Numerals_Calc;

public class Junit extends Roman_Numerals_Calc
{
	@Test
	public void test1() 
	{
		assertEquals("II", Calc("I", "I"));
	}

	
	@Test
	public void test2() 
	{
		assertEquals("III", Calc("II", "I"));
	}
	
	@Test
	public void test2_5() 
	{
		assertEquals("III", Calc("I", "II"));
	}
	
	@Test
	public void test3()
	{
		assertEquals("IV", Calc("III", "I"));
	}
	
	@Test
	public void test3_4()
	{
		assertEquals("IV", Calc("II", "II"));
	}
	
	@Test
	public void test3_8()
	{
		assertEquals("IV", Calc("I", "III"));
	}
	
	@Test
	public void test4()
	{
		assertEquals("V", Calc("I", "IV"));
	}
	
	@Test
	public void test4_2()
	{
		assertEquals("V", Calc("II", "III"));
	}
	
	@Test
	public void test4_5()
	{
		assertEquals("V", Calc("III", "II"));
	}
	
	@Test
	public void test4_8()
	{
		assertEquals("V", Calc("IV", "I"));
	}
	
	@Test
	public void test5()
	{
		assertEquals("C", Calc("L", "L"));
	}
	
	@Test
	public void test6()
	{
		assertEquals("LXXX", Calc("XL", "XL"));
	}
	
	@Test
	public void test7()
	{
		assertEquals("XXXVIII", Calc("XVI","XXII"));
	}
	
	@Test
	public void test8()
	{
		assertEquals("LIX", Calc("XXXVIII","XXI"));
	}
	
	@Test
	public void test9()
	{
		assertEquals("XLIV", Calc("XXIV", "XX"));
	}
}
