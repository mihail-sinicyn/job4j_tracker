package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
    Student Student = new Student();
    Student.setFullName("Oleg Levchenko");
    Student.setStudentGroup("20TDv8841");
    Student.setDateOfAdmission(new Date());

    System.out.println(Student.getFullName() + " is a student of the group - " + Student.getStudentGroup()
            + " .Its Enrollment date is " + Student.getDateOfAdmission());
    }
}
