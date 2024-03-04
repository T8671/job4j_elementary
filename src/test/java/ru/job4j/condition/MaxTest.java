package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxLeft10To5Then10() {
        int left = 10;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxRight30To20Then30() {
        int left = 20;
        int right = 30;
        int result = Max.max(left, right);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft5EqualRight5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B2C3Then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA3B2C1Then3() {
        int a = 3;
        int b = 2;
        int c = 1;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B3C2Then3() {
        int a = 1;
        int b = 3;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int result = Max.max(a, b, c);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1D1Then4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA4B3C2D1Then4() {
        int a = 4;
        int b = 3;
        int c = 2;
        int d = 1;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B4C2D3Then4() {
        int a = 1;
        int b = 4;
        int c = 2;
        int d = 3;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B2C4D3Then4() {
        int a = 1;
        int b = 2;
        int c = 4;
        int d = 3;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}
