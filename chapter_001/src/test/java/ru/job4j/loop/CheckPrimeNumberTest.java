package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when3() {
        boolean rsl = CheckPrimeNumber.check(3);
        assertThat(rsl, is(true));
    }

    @Test
    public void when2() {
        boolean rsl = CheckPrimeNumber.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when6() {
        boolean rsl = CheckPrimeNumber.check(6);
        assertThat(rsl, is(false));
    }

    @Test
    public void when11() {
        boolean rsl = CheckPrimeNumber.check(11);
        assertThat(rsl, is(true));
    }
}
