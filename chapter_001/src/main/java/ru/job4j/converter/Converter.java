package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        int euroToRuble = euroToRuble(2);
        System.out.println("2 euro are " + euroToRuble + " ruble.");
        int dollarToRuble = dollarToRuble(2);
        System.out.println("2 dollar are " + dollarToRuble + " ruble.");

        int inRubleToEuro = 140;
        int expectedRubleToEuro = 2;
        int outRubleToEuro = rubleToEuro(inRubleToEuro);
        boolean passedRubleToEuro = expectedRubleToEuro == outRubleToEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedRubleToEuro);

        int inRubleToDollar = 120;
        int expectedRubleToDollar = 2;
        int outRubleToDollar = rubleToDollar(inRubleToDollar);
        boolean passedRubleToDollar = expectedRubleToDollar == outRubleToDollar;
        System.out.println("140 rubles are 2 dollar. Test result : " + passedRubleToDollar);

        int inEuroToRuble = 2;
        int expectedEuroToRuble = 140;
        int outEuroToRuble = euroToRuble(inEuroToRuble);
        boolean passedEuroToRuble = expectedEuroToRuble == outEuroToRuble;
        System.out.println("2 euro are 140 ruble. Test result : " + passedEuroToRuble);

        int inDollarToRuble = 2;
        int expectedDollarToRuble = 120;
        int outDollarToRuble = dollarToRuble(inDollarToRuble);
        boolean passedDollarToRuble = expectedDollarToRuble == outDollarToRuble;
        System.out.println("2 dollar are 120 ruble. Test result : " + passedDollarToRuble);
    }
}
