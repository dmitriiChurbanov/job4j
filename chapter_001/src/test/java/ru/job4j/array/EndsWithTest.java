package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }


    @Test
    public void whenNotEndWithPrefixThenTrue1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'g', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotEndWithPrefixThenTrue2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'h', 'g', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotEndWithPrefixThenTrue5() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenTrue4() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'l', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
