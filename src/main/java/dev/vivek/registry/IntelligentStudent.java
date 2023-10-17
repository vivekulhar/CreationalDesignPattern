package dev.vivek.registry;

public class IntelligentStudent extends Student{

    public IntelligentStudent() {
        // fill the fields
    }
    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        // fill the fields
        super(intelligentStudent);

    }
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
