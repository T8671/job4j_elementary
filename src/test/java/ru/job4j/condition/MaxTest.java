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
}
