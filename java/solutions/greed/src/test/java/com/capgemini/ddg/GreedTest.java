package com.capgemini.ddg;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Greed application.
 */
public class GreedTest {

    private Greed greed;

    @Before
    public void setUp() {
        greed = new Greed();
    }

    @After
    public void tearDown() {
        greed = null;
    }

    @Test
    public void testSingleDieWith1() {
        Integer[] dice = new Integer[]{1};
        Assert.assertEquals(new Integer(100), greed.score(dice));
    }

    @Test
    public void testSingleDieWith5() {
        Integer[] dice = new Integer[]{5};
        Assert.assertEquals(new Integer(50), greed.score(dice));
    }

    @Test
    public void testSingleDieWith3() {
        Integer[] dice = new Integer[]{3};
        Assert.assertEquals(new Integer(30), greed.score(dice));
    }

    @Test
    public void testTripleDiceWith111() {
        Integer[] dice = new Integer[]{1, 1, 1};
        Assert.assertEquals(new Integer(1000), greed.score(dice));
    }

    @Test
    public void testTripleDiceWith222() {
        Integer[] dice = new Integer[]{2, 2, 2};
        Assert.assertEquals(new Integer(200), greed.score(dice));
    }

    @Test
    public void testTripleDiceWith333() {
        Integer[] dice = new Integer[]{3, 3, 3};
        Assert.assertEquals(new Integer(300), greed.score(dice));
    }

    @Test
    public void testTripleDiceWith444() {
        Integer[] dice = new Integer[]{4, 4, 4};
        Assert.assertEquals(new Integer(400), greed.score(dice));
    }

    @Test
    public void testTripleDiceWith555() {
        Integer[] dice = new Integer[]{5, 5, 5};
        Assert.assertEquals(new Integer(500), greed.score(dice));
    }

    @Test
    public void testTripleDiceWith666() {
        Integer[] dice = new Integer[]{6, 6, 6};
        Assert.assertEquals(new Integer(600), greed.score(dice));
    }
}
