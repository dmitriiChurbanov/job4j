package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(3, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To2Then6() {
        int result = Max.max(6, 6, 7, 9);
        assertThat(result, is(9));
    }
}
