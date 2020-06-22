package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Assert.assertEquals(2.0, Point.distance(0, 0, 2, 0), 0.1);
    }
}
