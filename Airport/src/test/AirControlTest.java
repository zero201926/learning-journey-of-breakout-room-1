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
        main.Plane planedouble = new main.Plane();
        main.AirControl airport = new main.AirControl(plane);
        planedoublearray.add(planedouble);
        airport.LandPlane(planedouble);
//        assertArrayEquals(ArrayList<Plane>, planedouble);
//        assertThat(garage, planedouble());
        assertEquals(planedoublearray, airport.ViewGarage());
    }

    @Test
    public void PlaneTakesOff(){

    }


}