package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        int matches = 11;
        Scanner scanner = new Scanner(System.in);
        int countOnePlayer = 0;
        int countTwoPlayer = 0;
        while (true) {
            if (matches == 0) break;
            System.out.println("Первый игрок возьмите спички от 1 до 3х");
            int numberOne = scanner.nextInt();
            countOnePlayer++;
            matches -= numberOne;
            if (matches == 0) break;
            System.out.println("Осталось " + matches + " спичек.");
            if (matches == 0) break;
            System.out.println("Второй игрок возьмите спички от 1 до 3х");
            int numberTwo = scanner.nextInt();
            countTwoPlayer++;
            matches -= numberTwo;
            System.out.println("Осталось " + matches + " спичек.");
        }
        System.out.println("Выйграл " + (countOnePlayer > countTwoPlayer ?
                "первый игрок, ходов - " + countOnePlayer + "шт" :
                "второй игрок, ходов -" + countTwoPlayer + "шт"));
    }
}