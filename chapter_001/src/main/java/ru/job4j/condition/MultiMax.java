package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int firstOnSecond = first > second ? first : second;
        int maxThree = firstOnSecond > third ? firstOnSecond : third;
        return maxThree;
    }
}
