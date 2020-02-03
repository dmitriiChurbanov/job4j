package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Кот ";
        names[1] = "Васька -";
        names[2] = " рыжий";
        names[3] = " кот.";
        System.out.print(names[0] + names[1] + names[2] + names[3]);
    }
}
