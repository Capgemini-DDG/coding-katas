package mainPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {
	Main main = new Main();
	
	@Test
	public void test1() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("II", main.result("I", "I"));
	}

	@Test
	public void test2() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("III", main.result("II", "I"));
	}

	@Test
	public void test3() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("VI", main.result("II", "IV"));
	}

	@Test
	public void test4() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("X", main.result("V", "V"));
	}

	@Test
	public void test5() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("VIII", main.result("I", "VII"));
	}

	@Test
	public void test6() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("X", main.result("I", "IX"));
	}

	@Test
	public void test7() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("XV", main.result("VI", "IX"));
	}

	@Test
	public void test8() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("XIX", main.result("X", "IX"));
	}

	@Test
	public void test9() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("CCCXXXV", main.result("XXXVI", "CCXCIX"));
	}

	@Test
	public void test10() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("XXXVI", main.result("XVI", "XX"));
	}

	@Test
	public void test11() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("XXV", main.result("VI", "XIX"));
	}

	@Test
	public void test12() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("XXXVI", main.result("XVI", "XX"));
	}

	@Test
	public void test13() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("CDLXXVII", main.result("CCLVIII", "CCXIX"));
	}

	@Test
	public void test14() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("DCCCIV", main.result("CDXLVI", "CCCLVIII"));
	}

	@Test
	public void test15() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("CMXCVII", main.result("CMLXXXVI", "XI"));
	}

	@Test
	public void test16() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("CMLXXVI", main.result("DCCCLXXXVIII", "LXXXVIII"));
	}

	@Test
	public void test17() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("CMXCVI", main.result("DCCCVIII", "CLXXXVIII"));
	}

	@Test
	public void test18() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("CMXLI", main.result("CLXXXIII", "DCCLVIII"));
	}
	
	@Test
	public void test19() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("DCCXXXI", main.result("CDXXI", "CCCX"));
	}
	
	@Test
	public void test20() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": ");
		assertEquals("DCCLXXVI", main.result("CDXLVIII", "CCCXXVIII"));
	}
	
	@Test
	public void test21() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name + ": "); 
		assertEquals("CMXLIII", main.result("DCCCLXXXIV", "LIX"));
	}

}
