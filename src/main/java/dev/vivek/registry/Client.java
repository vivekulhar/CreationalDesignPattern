package dev.vivek.registry;

public class Client {
    public static void fillRegistry(StudentRegistry registry){
        Student student = new Student();
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        registry.register("July22", student);
        registry.register("July22Inter", intelligentStudent);
        System.out.println(student+"**********");
        System.out.println(intelligentStudent+"**********");
    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student student = registry.get("July22").clone();
        Student intelligentStudent = registry.get("July22Inter").clone();
        System.out.println(student);
        System.out.println(intelligentStudent);
    }
}
