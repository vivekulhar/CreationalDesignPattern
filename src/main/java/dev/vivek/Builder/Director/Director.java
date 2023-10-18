package dev.vivek.Builder.Director;

public class Director {
    private Car.Builder builder;

    public Director(Car.Builder builder){
        this.builder = builder;
    }

    public Car constructSportsCar(){
        return builder.setColor("Red")
                .setName("Ferrari")
                .setYear(1968)
                .setModel("F50")
                .build();
    }

    public Car constructSUVCar(){
        return builder.setColor("Black")
                .setName("Ford")
                .setYear(2022)
                .setModel("M23")
                .build();
    }
}
