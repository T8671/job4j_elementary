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

    @Test
    void whenMinus1Minus2Minus3andMinus8Minus9Minus10Then12dot12() {
        Point a = new Point(-1, -2, -3);
        Point b = new Point(-8, -9, -10);
        a.distance3d(b);
        double expected = 12.12;
        assertThat(a.distance3d(b)).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when123and8910Then12dot12() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(8, 9, 10);
        a.distance3d(b);
        double expected = 12.12;
        assertThat(a.distance3d(b)).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when12Minus3andMinus8910Then17dot29() {
        Point a = new Point(1, 2, -3);
        Point b = new Point(-8, 9, 10);
        a.distance3d(b);
        double expected = 17.29;
        assertThat(a.distance3d(b)).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when123andMinus8910Then13dot37() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(-8, 9, 10);
        a.distance3d(b);
        double expected = 13.37;
        assertThat(a.distance3d(b)).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void when003and000Then3() {
        Point a = new Point(0, 0, 3);
        Point b = new Point(0, 0, 0);
        a.distance3d(b);
        double expected = 3;
        assertThat(a.distance3d(b)).isEqualTo(expected, withPrecision(0.01));
    }
}