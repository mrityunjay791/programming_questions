package com.java.oops.objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Student {
    private String name = "Mrityunjay";
    private String college = "GAYA COLLAGE";

    public Student() {
        super();
    }

    public Student(String name, String college) {
        super();
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public static void main(String args[]) {
        Constructor < Student > constructor;
        try {
            constructor = Student.class.getConstructor();
            Student student = constructor.newInstance();
            System.out.println(student.getName());
            System.out.println(student.getCollege());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException |
            NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}