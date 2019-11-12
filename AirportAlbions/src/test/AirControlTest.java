package test;

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

}