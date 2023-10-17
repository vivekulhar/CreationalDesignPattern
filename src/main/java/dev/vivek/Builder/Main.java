package dev.vivek.Builder;

public class Main {
    public static void main(String[] args) {
        BuilderClass builderClass = BuilderClass.getBuilder()
                .setName("Vivek")
                .setAddress("India")
                .build();
        System.out.println(builderClass.getName());
    }
}
