package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point point) {
        return sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2));
    }

    public double distance3d(Point point) {
        return sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2) + pow(this.z - point.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}