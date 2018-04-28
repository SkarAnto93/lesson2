package com.company;

public class MountainBike extends Bicycle {
    String rubberTires;

    public void setRubberTires(String rubberTires) {
        this.rubberTires = rubberTires;
    }

    public String getRubberTires() {
        System.out.println(rubberTires);
        return rubberTires;
    }
}
