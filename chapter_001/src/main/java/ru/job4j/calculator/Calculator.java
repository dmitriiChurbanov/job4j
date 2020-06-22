package ru.job4j.calculator;

/**
 * Class for calculating arithmetic operations: + - * \.
 *
 * @author Dmitrii Churbanov (MatryGoodvai@mail.ru)
 * @version 1
 * @since 03.02.2020
 */
public class Calculator {

    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
