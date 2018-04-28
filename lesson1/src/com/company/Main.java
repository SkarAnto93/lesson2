package com.company;

public class Main {

    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        MountainBike bike3 = new MountainBike();


        bike1.setBikeName("IDEAL");
        bike1.getBikeName();
        bike1.changeCadence(40);
        bike1.changeGear(7);
        bike1.speedUp(120);
        bike1.applyBrakes(20);
        bike1.getStates();


        bike2.setBikeName("BALISTIC");
        bike2.getBikeName();
        bike2.changeCadence(50);
        bike2.changeGear(8);
        bike2.speedUp(150);
        bike2.applyBrakes(30);
        bike2.getStates();

        bike3.setRubberTires("Goodyear");
        bike3.getRubberTires();
        bike3.setBikeName("BALISTIC");
        bike3.getBikeName();
        bike3.changeCadence(120);
        bike3.changeGear(5);
        bike3.speedUp(300);
        bike3.applyBrakes(30);
        bike3.getStates();

        System.out.printf("halloooooooo");

    }
}
