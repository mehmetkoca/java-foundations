package com.mehmetkoca;

public class Student {
    private String name;
    private int studentNo;
    private String department;

    public Student() {
        this("Default name",11111111,"None");
    }

    public Student(String name, int studentNo) {
        this(name,studentNo,"None");
    }

    public Student(String name, int studentNo, String department) {
        this.name = name;
        this.studentNo = studentNo;
        this.department = department;
    }
    //getters
    public String getName() {
        return name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getDepartment() {
        return department;
    }
}
