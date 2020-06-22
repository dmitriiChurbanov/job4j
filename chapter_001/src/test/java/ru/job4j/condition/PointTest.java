package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTwoPoint() {
        Assert.assertEquals(2.0, new Point(0,0).distance(new Point(0,2)), 0.1);
    }

    @Test
    public void distanceThreePoint() {
        Assert.assertEquals(4.0, new Point(0,0,2).distance3d(new Point(0,0,6)), 0.1);
    }
}
