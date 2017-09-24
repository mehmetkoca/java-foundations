package com.mehmetkoca;

public class Main {

    public static void main(String[] args) {
	    Student student = new Student("Mehmet Koca",132802020,"Software");
        System.out.println("Student name " + student.getName() + " ,student no: " + student.getStudentNo() + " ,department: " + student.getDepartment());
        Student student2 = new Student();
        System.out.println("Student name " + student2.getName() + " ,student no: " + student2.getStudentNo() + " ,department: " + student2.getDepartment());
        Student student3 = new Student("Tim",12345678);
        System.out.println("Student name " + student3.getName() + " ,student no: " + student3.getStudentNo() + " ,department: " + student3.getDepartment());

    }
}
