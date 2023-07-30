package com.ksk.java8.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trial {
    public static void main(String[] a) {

        List studList1 = new ArrayList<>();
        List studList2 = new ArrayList<>();

        Student student1 = new Student(1, "Raja", 60);
        Student student2 = new Student(2, "Rahul", 55);
        Student student3 = new Student(3, "Ajay", 78);

        Student student4 = new Student(4, "Varun", 85);
        Student student5 = new Student(2, "Rahul", 55);

        studList1.add(student1);
        studList1.add(student2);
        studList1.add(student3);

        studList2.add(student3);
        studList2.add(student4);
        studList2.add(student5);

        boolean doesNotMatch = false;
        //mutual exclusive output raja and varun
        List allStudents = new ArrayList();
        allStudents.addAll(studList1);
        allStudents.addAll(studList2);

        studList1.retainAll(studList2);
        allStudents.removeAll(studList1);
        System.out.println(allStudents);
        
    }

}

class Student {
    private Integer id;
    private String name;
    private Integer marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}