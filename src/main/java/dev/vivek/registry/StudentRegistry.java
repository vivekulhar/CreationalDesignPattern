package dev.vivek.registry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> studentRegistry = new HashMap<>();

    void register(String name, Student student) {
        studentRegistry.put(name, student);
    }
    Student get(String name) {
        return studentRegistry.get(name);
    }
}
