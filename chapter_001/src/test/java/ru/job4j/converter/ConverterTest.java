package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int inRubleToEuro = 140;
        int expectedRubleToEuro = 2;
        int outRubleToEuro = Converter.rubleToEuro(inRubleToEuro);
        Assert.assertEquals(expectedRubleToEuro, outRubleToEuro);
    }

    @Test
    public void rubleToDollar() {
        int inRubleToDollar = 120;
        int expectedRubleToDollar = 2;
        int outRubleToDollar = Converter.rubleToDollar(inRubleToDollar);
        Assert.assertEquals(expectedRubleToDollar, outRubleToDollar);
    }

    @Test
    public void euroToRuble() {
        int inEuroToRuble = 2;
        int expectedEuroToRuble = 140;
        int outEuroToRuble = Converter.euroToRuble(inEuroToRuble);
        Assert.assertEquals(expectedEuroToRuble, outEuroToRuble);
    }

    @Test
    public void dollarToRuble() {
        int inDollarToRuble = 2;
        int expectedDollarToRuble = 120;
        int outDollarToRuble = Converter.dollarToRuble(inDollarToRuble);
        Assert.assertEquals(expectedDollarToRuble, outDollarToRuble);
    }
}
