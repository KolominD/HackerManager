package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class cashbackManagerTest {
    cashbackManager cash = new cashbackManager();

    @Test
    public void testRemain() {
        int actual = cash.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @Test
    public void testBoundaryBelowLimit() {
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
    public void testBoundary() {
        int actual = cash.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}