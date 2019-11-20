package vehicle.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VehicleTest {
    private Vehicle vehicle;

    @Before
    public void beforeEachTest() {
        this.vehicle = new Vehicle();
    }

    @Test
    public void testInitialStateLocationShouldBe_0_0_andDirectionShouldBeNorth() {
        Assert.assertEquals("0, 0", vehicle.getCurrentLocation());
        Assert.assertEquals("North", vehicle.getDirection());
    }

    @Test
    public void testTurnLeftAndMove10_locationShouldBe_minus10_0_whenDirectionIsNorth() {
        vehicle.turnLeft();
        vehicle.move(11);
        Assert.assertEquals("-11, 0", vehicle.getCurrentLocation());
        Assert.assertEquals("West", vehicle.getDirection());
    }

    @Test
    public void testTurnRightAndMove10_locationShouldBe_10_0_whenDirectionIsNorth() {
        vehicle.turnRight();
        vehicle.move(12);
        Assert.assertEquals("12, 0", vehicle.getCurrentLocation());
        Assert.assertEquals("East", vehicle.getDirection());
    }

    @Test
    public void testUTurnAndMove10_locationShouldBe_0_minus10_whenDirectionIsNorth() {
        vehicle.uTurn();
        vehicle.move(15);
        Assert.assertEquals("0, -15", vehicle.getCurrentLocation());
        Assert.assertEquals("South", vehicle.getDirection());
    }

    @Test
    public void testTurnLeft2roundsDirectionShouldBeSouth() {
        vehicle.turnLeft();
        vehicle.turnLeft();
        Assert.assertEquals("South", vehicle.getDirection());
    }
}
