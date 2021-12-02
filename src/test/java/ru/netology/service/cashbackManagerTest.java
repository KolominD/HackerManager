package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class cashbackManagerTest {
    cashbackManager cash = new cashbackManager();

    @Test
    public void testRemain() {
        int actual = cash.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void testWithBoundaryBelowLimit() {
        int actual = cash.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testBoundaryOverLimit() {
        int actual = cash.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void testAllBoundary() {
        int actual = cash.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}