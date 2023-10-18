package dev.vivek.Builder.Director;

import org.w3c.dom.ls.LSOutput;

public class Client {
    public static void main(String[] args) {
        Car.Builder builder = new Car.Builder();
        Director director = new Director(builder);

        Car sportsCar = director.constructSportsCar();
        Car suvCar = director.constructSUVCar();
        System.out.println("Sports car created "+sportsCar.getModel());

        System.out.println("SUV car created "+suvCar.getModel());
    }


}
