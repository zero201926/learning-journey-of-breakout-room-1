package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    public void PlaneIsMade(){
        main.Plane plane = new main.Plane();
        boolean var = plane instanceof main.Plane;
        assertEquals(true, var);
    }
}