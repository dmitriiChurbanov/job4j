package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean ethalon = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != ethalon) {
                result = false;
            }
        }
        return result;
    }
}
