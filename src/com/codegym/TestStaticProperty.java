package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrary", "Skyactiv 3");
        System.out.println(car1.numberOfCars);
        Car car2 = new Car("Audi","Skyactiv 3");
        System.out.println(car2.numberOfCars);
    }
}
