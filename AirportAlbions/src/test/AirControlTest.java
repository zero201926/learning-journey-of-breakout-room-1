package test;

import main.Plane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirControlTest {

    @Test
    public void PlaneLands(){
        main.AirControl airport = new main.AirControl();
        main.Plane plane = new main.Plane();
        airport.land(plane);
        assertEquals(1, airport.space());
    }

    @Test
    public void PlaneTakeoff(){
        main.AirControl airport = new main.AirControl();
        main.Plane plane = new main.Plane();
        airport.land(plane);
        assertEquals(plane, airport.takeoff(plane));
    }

    @Test
    public void MutiPlane(){
        main.AirControl airport = new main.AirControl();
        main.Plane plane = new main.Plane();
        main.Plane plane2 = new main.Plane();
        airport.land(plane);
        airport.land(plane2);
        assertTrue(airport.planes().contains(plane));
    }

}