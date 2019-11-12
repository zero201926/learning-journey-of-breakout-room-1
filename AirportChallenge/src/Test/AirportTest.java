package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AirportTest {

    @Test
    public void LandsAPlane(){
        Main.Airport airport = new Main.Airport();
        Main.Plane plane = new Main.Plane();

        String PlaneString = plane.toString();

        airport.land(plane);

        assertEquals(PlaneString, airport.ListOfPlanes());
    }

    @Test
    public void LandsMultiplePlanes(){
        Main.Airport airport = new Main.Airport();
        Main.Plane plane = new Main.Plane();

        String PlaneString = plane.toString();
        airport.land(plane);

        for(int i=1;i<=9;i++){
            airport.land(new Main.Plane());
        }



        assertTrue(airport.ListOfPlanes().contains(PlaneString));
        assertEquals(10, airport.ListOfPlanesArray().size());
    }
    @Test
    public void TakeoffPlane(){
        Main.Airport airport = new Main.Airport();
        Main.Plane plane = new Main.Plane();
        airport.land(plane);

        airport.takeoff();

        assertEquals(0, airport.ListOfPlanesArray().size());

    }

    @Test
    public void TakeoffMultiplePlanes(){
        Main.Airport airport = new Main.Airport();
        Main.Plane plane = new Main.Plane();

        for(int i=1;i<=9;i++){
            airport.land(new Main.Plane());
        }

        for(int i=1;i<=5;i++){
            airport.takeoff();
        }

        assertEquals(4, airport.ListOfPlanesArray().size());

    }
}