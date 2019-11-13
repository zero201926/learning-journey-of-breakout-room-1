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

    public Plane takeoff(){
        Plane temp = hangar.get(hangar.size() - 1);
        hangar.remove(hangar.size() - 1);
        return temp;
    }
    public ArrayList<Plane> planes(){ return hangar;}
}
