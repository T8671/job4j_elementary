package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus2to25Then4Dot24() {
        double expected = 4.24;
        int x1 = 1;
        int y1 = 2;
        int x2 = -2;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1Minus5toMinus51Then8Dot48() {
        double expected = 8.48;
        int x1 = 1;
        int y1 = -5;
        int x2 = -5;
        int y2 = 1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when18to29Then9dot89() {
        double expected = 9.89;
        int x1 = 1;
        int y1 = 2;
        int x2 = 8;
        int y2 = 9;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus8toMinus8Minus9Then9dot89() {
        double expected = 9.89;
        int x1 = -1;
        int y1 = -2;
        int x2 = -8;
        int y2 = -9;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}