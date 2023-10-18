package dev.vivek.Builder.Director;

public class Car {
    private String name;
    private String model;
    private int year;
    private String color;

    private Car(Builder builder){
        this.name = builder.getName();
        this.color = builder.getColor();
        this.model = builder.getModel();
        this.year = builder.getYear();
    }

    public String getName() {
        return name;
    }


    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public String getColor() {
        return color;
    }
    private Builder getBuilder(){
        return new Builder();
    }
    public static class Builder{

        private String name;
        private String model;
        private int year;
        private String color;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getModel() {
            return model;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public int getYear() {
            return year;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public String getColor() {
            return color;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build(){
            //conditions
            return new Car(this);
        }


    }
}
