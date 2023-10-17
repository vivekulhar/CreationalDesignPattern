package dev.vivek.registry;

public class Student implements Prototype<Student>{
    public Student() {
        // fill the fields
    }
    public Student(Student student) {
        // fill the fields
    }
    @Override
    public Student clone() {
        return new Student(this);
    }
}
