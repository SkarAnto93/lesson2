package com.company;

public class Bicycle {



    int gear = 1;
    int cadence = 0;
    int speed = 0;
    String bikeName ;


    void changeGear(int value){
        gear = value ;
    }

    void changeCadence(int value){
        cadence = value ;
    }

    void speedUp(int value) {
        speed = speed + value;
    }

    void applyBrakes(int value) {
        speed = speed - value ;
    }

    void getStates(){
        System.out.println("gear: " + gear + " speed: " + speed + " cadence: " + cadence);
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getBikeName() {
        System.out.println(bikeName);
        return bikeName;
    }
}
