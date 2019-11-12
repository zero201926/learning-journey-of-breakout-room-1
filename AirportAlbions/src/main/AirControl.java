package main;

import java.util.ArrayList;

public class AirControl {
    ArrayList<Plane> hangar = new ArrayList<>();

    public void land(Plane plane) {
        hangar.add(plane);
    }

    public Integer space() {
        return hangar.size();
    }

    public void takeoff(Plane plane){ hangar.remove(plane); }
}
