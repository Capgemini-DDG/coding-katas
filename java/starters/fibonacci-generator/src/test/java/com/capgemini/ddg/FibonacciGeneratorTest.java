package com.capgemini.ddg;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Class for @{@link FibonacciGenerator}
 */
public class FibonacciGeneratorTest 
{
    @Test
    public void firstTest() 
    {
    	Assert.assertEquals(0, FibonacciGenerator.generate(0));
    }
    
    @Test
    public void secondTest()
    {
    	Assert.assertEquals(1, FibonacciGenerator.generate(1));
    }
    
    @Test
    public void thirdTest()
    {
    	Assert.assertEquals(1, FibonacciGenerator.generate(2));
    }
    
    @Test
    public void fourthTest()
    {
    	Assert.assertEquals(2, FibonacciGenerator.generate(3));
    }
    
    @Test
    public void fifthTest()
    {
    	Assert.assertEquals(3,  FibonacciGenerator.generate(4));
    }
    
    @Test
    public void sixthTest()
    {
    	Assert.assertEquals(5, FibonacciGenerator.generate(5));
    }
    
    @Test
    public void seventhTest()
    {
    	Assert.assertEquals(8, FibonacciGenerator.generate(6));
    }
    
    @Test
    public void eigthTest()
    {
    	Assert.assertEquals(13, FibonacciGenerator.generate(7));
    	Assert.assertEquals(21, FibonacciGenerator.generate(8));
    	Assert.assertEquals(34, FibonacciGenerator.generate(9));
    	Assert.assertEquals(55, FibonacciGenerator.generate(10));
    }
}
