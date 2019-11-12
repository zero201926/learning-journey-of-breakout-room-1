package Main;

import java.util.ArrayList;


public class Airport {
    ArrayList<Plane> Aeroplanes = new ArrayList<>();
    Plane plane = new Plane();


    public static void main(String[] args){
    }

    public void land(Plane plane){
        Aeroplanes.add(plane);

    }

    public void takeoff(){
        Aeroplanes.remove(0);
    }

    public ArrayList ListOfPlanesArray(){
        return Aeroplanes;
    }

    public String ListOfPlanes(){
       return Aeroplanes.toString().replace("[","").replace("]","");

    }


}
