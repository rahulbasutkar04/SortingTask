package org.example.sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;


    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.rollNumber, student.rollNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "abc"));
        studentList.add(new Student(5, "efg"));
        studentList.add(new Student(2, "hij"));
        studentList.add(new Student(11, "hij"));
        studentList.add(new Student(9, "klm"));

        Collections.sort(studentList);// natural sorting
        System.out.println(studentList);
    }
}
