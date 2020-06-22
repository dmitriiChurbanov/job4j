package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String group;
    private Date date;
}
//Задание.
//
//1. Создайте модель данных - Студент. ru.job4j.pojo.Student.
//2. В модели должны быть поля: ФИО, группа, дата поступления.
//3. Сгенерируйте аксессоры для этих полей.
//4. Создайте класс ru.job4j.pojo.College с методом main. В методе main создайте объект Student и заполните поля
// через set. Добавьте вывод на консоль объекта student через методы get.
//5. Залейте код в репозиторий.
//6. Добавьте ссылку на коммит и измените ответственного на Петра Арсентева.