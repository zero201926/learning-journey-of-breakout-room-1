package main;

import java.util.ArrayList;

public class AirControl {
//    Class garage = [];
    ArrayList<Plane> garage = new ArrayList<>();
//    String[] garage = new String[100];
    public AirControl(Plane plane){

    }
    public static void main(String[] args){

    }

    public void LandPlane(Plane planedouble){
        garage.add(planedouble);
    }

    public ArrayList<Plane> ViewGarage(){
        return garage;
    }
    public void TakeOffPlane(Plane planedouble){
        garage.remove(planedouble);
    }
}
