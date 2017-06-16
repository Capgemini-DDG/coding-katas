package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiceScore {

	int[] diceInput;

	@Test
	public void test1() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 2, 2, 1, 6, 2, 1 };
		Dice dice = new Dice();
		assertEquals(400, dice.input(diceInput), 0);
	}

	@Test
	public void test2() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 4, 4, 2, 4, 5, 1 };
		Dice dice = new Dice();
		assertEquals(550, dice.input(diceInput), 0);
	}

	@Test
	public void test3() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 1, 2, 1, 6, 2, 1 };
		Dice dice = new Dice();
		assertEquals(1000, dice.input(diceInput), 0);
	}

	@Test
	public void test4() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 1, 6, 6, 6, 2, 1 };
		Dice dice = new Dice();
		assertEquals(800, dice.input(diceInput), 0);
	}

	@Test
	public void test5() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 6, 6, 6, 6, 6, 6 };
		Dice dice = new Dice();
		assertEquals(4800, dice.input(diceInput), 0);
	}

	@Test
	public void test6() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 1, 1, 1, 1, 1, 5 };
		Dice dice = new Dice();
		assertEquals(4050, dice.input(diceInput), 0);
	}

	@Test
	public void test7() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 2, 2, 2, 2, 1, 1 };
		Dice dice = new Dice();
		assertEquals(600, dice.input(diceInput), 0);
	}

	@Test
	public void test8() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 3, 4, 3, 6, 3, 1 };
		Dice dice = new Dice();
		assertEquals(400, dice.input(diceInput), 0);
	}

	@Test
	public void test9() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 5, 5, 5, 5, 5, 5 };
		Dice dice = new Dice();
		assertEquals(4000, dice.input(diceInput), 0);
	}

	@Test
	public void test10() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 5, 5, 2, 2, 1, 1 };
		Dice dice = new Dice();
		assertEquals(800, dice.input(diceInput), 0);
	}

	@Test
	public void test11() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 1, 2, 3, 4, 5, 6 };
		Dice dice = new Dice();
		assertEquals(1200, dice.input(diceInput), 0);
	}

	@Test
	public void test12() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 6, 6, 3, 3, 4, 4 };
		Dice dice = new Dice();
		assertEquals(800, dice.input(diceInput), 0);
	}

	@Test
	public void test13() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 5, 3, 3, 3, 5, 6 };
		Dice dice = new Dice();
		assertEquals(400, dice.input(diceInput), 0);
	}

	@Test
	public void test14() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 2, 2, 4, 4, 5, 5 };
		Dice dice = new Dice();
		assertEquals(800, dice.input(diceInput), 0);
	}

	@Test
	public void test15() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 1, 1, 3, 3, 6, 6 };
		Dice dice = new Dice();
		assertEquals(800, dice.input(diceInput), 0);
	}

	@Test
	public void test16() {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		diceInput = new int[] { 2, 2, 3, 4, 6, 6 };
		Dice dice = new Dice();
		assertEquals(0, dice.input(diceInput), 0);
	}

}
