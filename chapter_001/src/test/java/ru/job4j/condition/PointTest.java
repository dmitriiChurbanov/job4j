package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Assert.assertEquals(2.0, Point.distance(0, 0, 2, 0), 0.1);
    }

//    @Test
//    public void distance() {
//        Assert.assertEquals(1.0, Point.distance(1, 0, 2, 0), 0.1);
//    }
//
//    @Test
//    public void distance() {
//        Assert.assertEquals(2.8, Point.distance(1, 2, 3, 0), 0.1);
//    }
//
//    @Test
//    public void distance() {
//        Assert.assertEquals(2.8, Point.distance(1, 2, 3, 4), 0.1);
//    }
}
