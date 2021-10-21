package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
    Student student = new Student();
    student.setFullName("Oleg Levchenko");
    student.setStudentGroup("20TDv8841");
    student.setDateOfAdmission(new Date());

    System.out.println(student.getFullName()
            + " is a student of the group - "
                + student.getStudentGroup()
                    + " .Its Enrollment date is "
                        + student.getDateOfAdmission());
    }
}
