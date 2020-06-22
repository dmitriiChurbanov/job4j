package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        double inManWeight = 180;
        double expectedManWeight = 92;
        double outManWeight = Fit.manWeight(inManWeight);
        Assert.assertEquals(expectedManWeight, outManWeight, 0.01);
        Assert.assertEquals(92, Fit.manWeight(180), 0.01);
    }

    @Test
    public void womanWeight() {
        double inWomanWeight = 161;
        double expectedWomanWeight = 70.14;
        double outWomanWeight = Fit.manWeight(inWomanWeight);
        Assert.assertEquals(expectedWomanWeight, outWomanWeight, 0.01);
        Assert.assertEquals(70.14, Fit.manWeight(161), 0.01);
    }
}
