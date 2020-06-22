package ru.job4j.oop;

public class DummiDic {

    public static void main(String[] args) {
        DummiDic dummiDic = new DummiDic();
        String stringVar = dummiDic.engToRus("hjhj");
        System.out.println(stringVar);
    }

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }
}