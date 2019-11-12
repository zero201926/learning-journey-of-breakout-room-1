package test;

import main.Plane;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AirControlTest {

    @Test
    public void PlaneLands(){
        ArrayList<Plane> planedoublearray = new ArrayList<>();

        main.Plane plane = new main.Plane();

        main.AirControl airport = new main.AirControl(plane);
        planedoublearray.add(plane);
        airport.LandPlane(plane);
        assertEquals(planedoublearray, airport.ViewGarage());
    }

    @Test
    public void PlaneTakesOff(){
        ArrayList<Plane> planedoublearray = new ArrayList<>();
        ArrayList<Plane> EmptyArray = new ArrayList<>();
        main.Plane plane = new main.Plane();
        main.AirControl airport = new main.AirControl(plane);
        planedoublearray.add(plane);
        planedoublearray.remove(new Integer(1));
        assertEquals(EmptyArray, airport.ViewGarage());

    }


}