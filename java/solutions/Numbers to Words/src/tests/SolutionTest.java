package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Solution;

public class SolutionTest {

	Solution nw = null;
	
	@Before
	public void setUp()
	{
		nw = new Solution();
	}
	
	@After
	public void tearDown()
	{
		nw = null;
	}
	
	@Test
	public void Test1() 
	{
		assertEquals("three", nw.Convert(3));
	}

	@Test
	public void Test2() 
	{
		assertEquals("three hundred", nw.Convert(300));
	}
	
	@Test
	public void Test3()
	{
		assertEquals("six", nw.Convert(6));
	}

	@Test
	public void Test4() 
	{
		assertEquals("nine", nw.Convert(9));
	}

	@Test
	public void Test5() 
	{
		assertEquals("seven thousand", nw.Convert(7000));
	}

	@Test
	public void Test6() 
	{
		assertEquals("five hundred", nw.Convert(500));
	}

	@Test
	public void Test7() 
	{
		assertEquals("nine hundred", nw.Convert(900));
	}

	@Test
	public void Test8() 
	{
		assertEquals("sixty six", nw.Convert(66));
	}

	@Test
	public void Test9() 
	{
		assertEquals("fourty three", nw.Convert(43));
	}

	@Test
	public void Test10() 
	{
		assertEquals("ninety five", nw.Convert(95));
	}

	@Test
	public void Test11() 
	{
		assertEquals("fifteen", nw.Convert(15));
	}

	@Test
	public void Test12() 
	{
		assertEquals("ten", nw.Convert(10));
	}

	@Test
	public void Test13() 
	{
		assertEquals("seventeen", nw.Convert(17));
	}

	@Test
	public void Test14() 
	{
		assertEquals("thirteen", nw.Convert(13));
	}

	@Test
	public void Test15() 
	{
		assertEquals("five", nw.Convert(5));
	}

	@Test
	public void Test16() 
	{
		assertEquals("fourteen", nw.Convert(14));
	}

	@Test
	public void Test17() 
	{
		assertEquals("twelve", nw.Convert(12));
	}

	@Test
	public void Test18() 
	{
		assertEquals("eleven", nw.Convert(11));
	}

	@Test
	public void Test19() 
	{
		assertEquals("one", nw.Convert(1));
	}

	@Test
	public void Test20() 
	{
		assertEquals("one hundred and fifty four", nw.Convert(154));
	}

	@Test
	public void Test21() 
	{
		assertEquals("one hundred and thirty two", nw.Convert(132));
	}

	@Test
	public void Test22() 
	{
		assertEquals("one hundred and fifty two", nw.Convert(152));
	}

	@Test
	public void Test23() 
	{
		assertEquals("twenty six thousand one hundred and ninety five", nw.Convert(26195));
	}

	@Test
	public void Test24() 
	{
		assertEquals("two thousand four hundred and sixty two", nw.Convert(2462));
	}

	@Test
	public void Test25() 
	{
		assertEquals("five thousand and ninety seven", nw.Convert(5097));
	}

	@Test
	public void Test26()
	{
		assertEquals("fifty thousand nine hundred and seventy", nw.Convert(50970));
	}

	@Test
	public void Test27() 
	{
		assertEquals("eight hundred and fourty three thousand five hundred and two", nw.Convert(843502));
	}

	@Test
	public void Test28() 
	{
		assertEquals("three hundred and six thousand nine hundred and thirty eight", nw.Convert(306938));
	}

	@Test
	public void Test29() 
	{
		assertEquals("twenty four thousand three hundred and eighty two", nw.Convert(24382));
	}

	@Test
	public void Test30() 
	{
		assertEquals("fifty thousand eight hundred and seventy", nw.Convert(50870));
	}

	@Test
	public void Test31() 
	{
		assertEquals("fifty", nw.Convert(50));
	}

	@Test
	public void Test32() 
	{
		assertEquals("three hundred and twenty", nw.Convert(320));
	}

	@Test
	public void Test33() 
	{
		assertEquals("one hundred and two", nw.Convert(102));
	}

	@Test
	public void Test34() 
	{
		assertEquals("two hundred and eighty three thousand nine hundred and fourty", nw.Convert(283940));
	}

	@Test
	public void Test35() 
	{
		assertEquals("one hundred thousand three hundred and twenty three", nw.Convert(100323));
	}

	@Test
	public void Test36() 
	{
		assertEquals("three hundred and thirty three thousand three hundred and thirty three", nw.Convert(333333));
	}

	@Test
	public void Test37() 
	{
		assertEquals("four hundred and nine thousand eight hundred and twenty seven", nw.Convert(409827));
	}

	@Test
	public void Test38() 
	{
		assertEquals("eighty seven thousand three hundred and ninety six", nw.Convert(87396));
	}

	@Test
	public void Test39() 
	{
		assertEquals("nine hundred and thirty eight thousand seven hundred and eighty four", nw.Convert(938784));
	}

	@Test
	public void Test40() 
	{
		assertEquals("five hundred and twenty three thousand four hundred and sixty nine", nw.Convert(523469));
	}

	@Test
	public void Test41() 
	{
		assertEquals("four hundred and ninety two thousand eight hundred and thirty seven", nw.Convert(492837));
	}

	@Test
	public void Test42() 
	{
		assertEquals("six hundred and fifty two thousand nine hundred and fifteen", nw.Convert(652915));
	}

	@Test
	public void Test43() 
	{
		assertEquals("one hundred and fifteen", nw.Convert(115));
	}

	@Test
	public void Test44() 
	{
		assertEquals("three hundred and eighty two thousand nine hundred and twelve", nw.Convert(382912));
	}

	@Test
	public void Test45() 
	{
		assertEquals("four hundred and eighty three thousand seven hundred and eleven", nw.Convert(483711));
	}

	@Test
	public void Test46() 
	{
		assertEquals("three hundred and ninety two thousand eight hundred and fifty four", nw.Convert(392854));
	}

	@Test
	public void Test47() 
	{
		assertEquals("nine hundred and thirty seven thousand one hundred and eighty three", nw.Convert(937183));
	}

	@Test
	public void Test48() 
	{
		assertEquals("eight hundred and one thousand nine hundred and eleven", nw.Convert(801911));
	}

	@Test
	public void Test49() 
	{
		assertEquals("four hundred and eighty two thousand nine hundred and thirty seven", nw.Convert(482937));
	}

	@Test
	public void Test50() 
	{
		assertEquals("one hundred and fifty four", nw.Convert(154));
	}
	
	@Test
	public void Test51() 
	{
		assertEquals("two", nw.Convert(2));
	}
	
	@Test
	public void Test52() 
	{
		assertEquals("twenty", nw.Convert(20));
	}
	
	@Test
	public void Test53() 
	{
		assertEquals("thirty", nw.Convert(30));
	}
	
	@Test
	public void Test54()
	{
		assertEquals("thirty three", nw.Convert(33));
	}
	
	@Test
	public void Test55()
	{
		assertEquals("fifty five", nw.Convert(55));
	}
	
	@Test
	public void Test56()
	{
		assertEquals("eighteen", nw.Convert(18));
	}
	
	@Test
	public void Test57()
	{
		assertEquals("one hundred", nw.Convert(100));
	}
	
	@Test
	public void Test58()
	{
		assertEquals("two hundred", nw.Convert(200));
	}
	
	@Test
	public void Test59()
	{
		assertEquals("nine hundred and fourty nine", nw.Convert(949));
	}
	
	@Test
	public void Test60()
	{
		assertEquals("one thousand two hundred and thirty nine", nw.Convert(1239));
	}
	
	@Test
	public void Test61()
	{
		assertEquals("four thousand five hundred and sixty eight", nw.Convert(4568));
	}
	
	@Test
	public void Test62()
	{
		assertEquals("five hundred and seventy two", nw.Convert((int) 0572F));
	}
	
	@Test
	public void Test63()
	{
		assertEquals("nine thousand two hundred and one", nw.Convert(9201));
	}
	
	@Test
	public void Test64()
	{
		assertEquals("ten thousand and seventy two", nw.Convert(10072));
	}
	
	@Test
	public void Test65()
	{
		assertEquals("ninety nine thousand nine hundred and ninety nine", nw.Convert(99999));
	}
	
	@Test
	public void Test66()
	{
		assertEquals("seventy one thousand and two", nw.Convert(71002));
	}
	
	@Test
	public void Test67()
	{
		assertEquals("thirty four thousand two hundred and eighty seven", nw.Convert(34287));
	}
	
	@Test
	public void Test68()
	{
		assertEquals("ninety nine thousand and one", nw.Convert(99001));
	}

	@Test
	public void Test69()
	{
		assertEquals("eight hundred and twenty two thousand seven hundred and fifty six", nw.Convert(822756));
	}
	
	@Test
	public void Test70()
	{
		assertEquals("eight hundred thousand and thirty one", nw.Convert(800031));
	}
	
	@Test
	public void Test71()
	{
		assertEquals("five hundred and twelve thousand and nine", nw.Convert(512009));
	}
	
	@Test
	public void Test72()
	{
		assertEquals("three hundred and ten thousand", nw.Convert(310000));
	}
	
	@Test
	public void Test73()
	{
		assertEquals("five hundred thousand seven hundred", nw.Convert(500700));
	}
	
	@Test
	public void Test74()
	{
		assertEquals("three hundred and twenty five thousand two hundred and fifty three", nw.Convert(325253));
	}
	
	@Test
	public void Test75()
	{
		assertEquals("seven hundred and ninety two", nw.Convert(792));
	}
	
	@Test
	public void Test76()
	{
		assertEquals("nine hundred thousand and seventy six", nw.Convert(900076));
	}
	
	@Test
	public void Test77()
	{
		assertEquals("eight thousand two hundred and thirty nine", nw.Convert(8239));
	}
	
	@Test
	public void Test78()
	{
		assertEquals("twenty two", nw.Convert(22));
	}
	
	@Test
	public void Test79()
	{
		assertEquals("four thousand seven hundred and ninety eight", nw.Convert(4798));
	}
	
	@Test
	public void Test80()
	{
		assertEquals("fourty seven thousand eight hundred and seven", nw.Convert(47807));
	}
}