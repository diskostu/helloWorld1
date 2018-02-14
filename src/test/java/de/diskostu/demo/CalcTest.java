package de.diskostu.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {

    private Calc sut;

    @Before
    public void init() {
        sut = new Calc();
    }

    @Test
    public void testAdd_1() {
        Assert.assertEquals(3d, sut.add(1d, 2d), 0d);
        Assert.assertEquals(0d, sut.add(-1d, 1d), 0d);
    }
}