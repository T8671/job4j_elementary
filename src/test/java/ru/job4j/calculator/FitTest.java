package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan187Than100() {
        short heightM = 187;
        double expected = 100.05;
        double man = Fit.manWeight(heightM);
        assertThat(man).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman162Than() {
        short heightW = 162;
        double expected = 59.8;
        double woman = Fit.womanWeight(heightW);
        assertThat(woman).isEqualTo(expected, withPrecision(0.01));
    }
}