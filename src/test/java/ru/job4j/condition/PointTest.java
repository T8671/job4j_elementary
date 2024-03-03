package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    public void when00to20Then2() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        a.distance(b);
        double expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1Minus2to25Then4Dot24() {
        Point a = new Point(1, 2);
        Point b = new Point(-2, 5);
        a.distance(b);
        double expected = 4.24;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1Minus5toMinus51Then8Dot48() {
        Point a = new Point(1, -5);
        Point b = new Point(-5, 1);
        a.distance(b);
        double expected = 8.48;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when18to29Then9dot89() {
        Point a = new Point(1, 2);
        Point b = new Point(8, 9);
        a.distance(b);
        double expected = 9.89;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus8toMinus2Minus9Then9dot89() {
        Point a = new Point(-1, -2);
        Point b = new Point(-8, -9);
        a.distance(b);
        double expected = 9.89;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }
}