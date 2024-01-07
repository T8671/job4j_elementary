package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP2K6Square2() {
        int excepted = 2;
        int p = 6;
        int k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(excepted);
    }

    @Test
    void whenP1K2Square0Dot05() {
        double excepted = 0.05;
        int p = 1;
        int k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenP1K2Square0Dot52() {
        double excepted = 0.52;
        int p = 6;
        int k = 15;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(excepted, withPrecision(0.01));
    }
}