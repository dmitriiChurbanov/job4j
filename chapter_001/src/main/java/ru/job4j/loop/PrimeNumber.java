package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();
        System.out.println(prime.calc(5));
        System.out.println(prime.calc(11));
        System.out.println(prime.calc(2));
    }
}
