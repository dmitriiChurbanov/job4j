package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
//        boolean prime = false;
//        for (int i = 2; i <= finish; i++) {
//            if (finish == i) {
//                prime = true;
//            } else if ((finish % i) == 0) {
//                break;
//            } else if (!((finish % i) == 0)) {
//                prime = false;
//            } else prime = true;
//        }
//        return prime;
        boolean prime = true;
        if (finish < 2) {
            prime = false;
        }
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}