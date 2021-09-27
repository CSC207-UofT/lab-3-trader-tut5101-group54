import org.junit.*;

import static org.junit.Assert.*;


public class SheepTest {
    Sheep s;

    @Before
    public void setUp() throws Exception {
        s = new Sheep();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meh!", s.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(3, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, s.getPrice());
    }
}
