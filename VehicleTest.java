import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    Vehicle vehicle = new Vehicle("BMW", "Red", 200, 6);
    @Test
    public void setGear(){
        boolean result = vehicle.setGear(4);
        assertTrue(result);
    }

    @Test
    public void setGearLower() {
        boolean result = vehicle.setGear(-100);
        assertFalse(result);
    }
    @Test
    public void setGearHigher() {
        boolean result = vehicle.setGear(100);
        assertFalse(result);
    }

    @Test
    public void setGearReverse() {  // -1 is reverse gear
        boolean result = vehicle.setGear(-1);
        assertTrue(result);
    }
    @Test
    public void setSpeed(){
        boolean result = vehicle.setSpeed(90);
        assertTrue(result);
    }

    @Test
    public void setSpeedHigher(){
        boolean result = vehicle.setSpeed(500);
        assertFalse(result);
    }

    @Test
    public void setSpeedLower(){
        boolean result = vehicle.setSpeed(-500);
        assertFalse(result);
    }

    @Test
    public void stop(){
        boolean result = vehicle.stop();
        assertTrue(result);
    }

    @Test
    public void TurnRight(){
        boolean result = vehicle.turnRight();
        assertTrue(result);
    }

    @Test
    public void TurnAround(){
        boolean result = vehicle.turnAround();
        assertTrue(result);
    }

    @Test
    public void turnLeft(){
        boolean result = vehicle.turnLeft();
        assertTrue(result);
    }
}