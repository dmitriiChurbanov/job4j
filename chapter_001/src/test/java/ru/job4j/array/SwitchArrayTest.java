package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap6to0() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expect = {7, 2, 3, 4, 5, 6, 1};
        int[] rsl = SwitchArray.swap(input, input.length - 1, 0);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap6to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expect = {1, 2, 3, 4, 5, 7, 6};
        int[] rsl = SwitchArray.swap(input, input.length - 1, 5);
        assertThat(rsl, is(expect));
    }
}
