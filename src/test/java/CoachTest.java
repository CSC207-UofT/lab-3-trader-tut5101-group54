/*
 * This file contains JUnit test cases for CoachTest.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CoachTest {
    Coach c;

    @Before
    public void setUp() throws Exception {
        c = new Coach();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(2, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TEST_downgradespeed() {
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }
}