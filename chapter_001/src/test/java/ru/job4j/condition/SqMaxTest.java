package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 3, 5);
        assertThat(result, is(6));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(6, 7, 4, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(6, 8, 11, 6);
        assertThat(result, is(11));
    }

    @Test
    public void whenFourMax() {
        SqMax check = new SqMax();
        int result = check.max(9, 10, 11, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenSameMax() {
        SqMax check = new SqMax();
        int result = check.max(16, 16, 16, 16);
        assertThat(result, is(16));

    }

    @Test
    public void whenThird1Max() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 8, 5);
        assertThat(result, is(8));
    }
}
