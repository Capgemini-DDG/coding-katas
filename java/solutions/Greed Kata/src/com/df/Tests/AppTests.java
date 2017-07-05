package com.df.Tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.df.Program.Greed;

public class AppTests
{
	private Greed greed;
	private Integer[] dice = {0,0,0,0,0,0};
	
	@Before
	public void setUp()
	{
		greed = new Greed();
	}
	
	@After
	public void tearDown()
	{
		greed = null;
	}
	
	@Test
	public void test1die1() 
	{
		dice[0] = 1;
		assertEquals(100, greed.score(dice));
	}
	
	@Test
	public void test1die2()
	{
		dice[0] = 2;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test1die3()
	{
		dice[0] = 3;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test1die4()
	{
		dice[0] = 4;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test1die5()
	{
		dice[0] = 5;
		assertEquals(50, greed.score(dice));
	}
	
	@Test
	public void test1die6()
	{
		dice[0] = 6;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test2die1()
	{
		dice[0] = 1;
		dice [1] = 1;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test2die2()
	{
		dice[0] = 1;
		dice [1] = 2;
		assertEquals(100, greed.score(dice));
	}
	
	@Test
	public void test2die3()
	{
		dice[0] = 2;
		dice [1] = 2;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test2die4()
	{
		dice[0] = 3;
		dice [1] = 2;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test2die5()
	{
		dice[0] = 3;
		dice [1] = 3;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test2die6()
	{
		dice[0] = 3;
		dice [1] = 4;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test2die7()
	{
		dice[0] = 4;
		dice [1] = 4;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test2die8()
	{
		dice[0] = 5;
		dice [1] = 4;
		assertEquals(50, greed.score(dice));
	}
	
	@Test
	public void test2die9()
	{
		dice[0] = 5;
		dice [1] = 5;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test2die10()
	{
		dice[0] = 6;
		dice [1] = 5;
		assertEquals(50, greed.score(dice));
	}
	
	@Test
	public void test2die11()
	{
		dice[0] = 6;
		dice [1] = 6;
		assertEquals(0, greed.score(dice));
	}
	
	@Test
	public void test3die1()
	{
		dice[0] = 1;
		dice [1] = 1;
		dice [2] = 1;
		assertEquals(1000, greed.score(dice));
	}
	
	@Test
	public void test3die2()
	{
		dice[0] = 2;
		dice [1] = 2;
		dice [2] = 2;
		assertEquals(200, greed.score(dice));
	}
	
	@Test
	public void test3die3()
	{
		dice[0] = 3;
		dice [1] = 3;
		dice [2] = 3;
		assertEquals(300, greed.score(dice));
	}
	
	@Test
	public void test3die4()
	{
		dice[0] = 4;
		dice [1] = 4;
		dice [2] = 4;
		assertEquals(400, greed.score(dice));
	}
	
	@Test
	public void test3die5()
	{
		dice[0] = 5;
		dice [1] = 5;
		dice [2] = 5;
		assertEquals(500, greed.score(dice));
	}
	
	@Test
	public void test3die6()
	{
		dice[0] = 6;
		dice [1] = 6;
		dice [2] = 6;
		assertEquals(600, greed.score(dice));
	}
	
	@Test
	public void test4die1()
	{
		dice[0] = 1;
		dice [1] = 1;
		dice [2] = 1;
		dice [3] = 1;
		assertEquals(2000, greed.score(dice));
	}
	
	@Test
	public void test4die2()
	{
		dice[0] = 2;
		dice [1] = 2;
		dice [2] = 2;
		dice [3] = 2;
		assertEquals(400, greed.score(dice));
	}
	
	@Test
	public void test4die3()
	{
		dice[0] = 3;
		dice [1] = 3;
		dice [2] = 3;
		dice [3] = 3;
		assertEquals(600, greed.score(dice));
	}
	
	@Test
	public void test4die4()
	{
		dice[0] = 4;
		dice [1] = 4;
		dice [2] = 4;
		dice [3] = 4;
		assertEquals(800, greed.score(dice));
	}
	
	@Test
	public void test4die5()
	{
		dice[0] = 5;
		dice [1] = 5;
		dice [2] = 5;
		dice [3] = 5;
		assertEquals(1000, greed.score(dice));
	}
	
	@Test
	public void test4die6()
	{
		dice[0] = 6;
		dice [1] = 6;
		dice [2] = 6;
		dice [3] = 6;
		assertEquals(1200, greed.score(dice));
	}
}