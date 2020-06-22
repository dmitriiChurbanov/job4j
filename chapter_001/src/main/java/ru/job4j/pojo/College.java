package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Митя Митин");
        student.setGroup("Группа разработки");
        student.setDate(new Date());
        System.out.print(student.getName() + ", " + student.getGroup() + ", " + student.getDate() + ".");
    }
}
