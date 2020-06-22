package ru.job4j.oop;

public class Juxebox {

    public static void main(String[] args) {
        Juxebox juxebox = new Juxebox();
        juxebox.music(1);
        juxebox.music(2);
        juxebox.music(3);
    }

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}