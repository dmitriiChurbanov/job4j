package ru.job4j.oop;

public class Student {

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();

        String song = "I believe, I can fly";
        petya.music(song);
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }
}