package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {
        int[][] massiv = new int[3][3];
        int number = 1;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                massiv[i][j] = number;
                number++;
            }
        }
    }
}
