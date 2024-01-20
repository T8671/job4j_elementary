package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0ToFinish5That15() {
        int inputStart = 0;
        int inputFinish = 5;
        int result = Counter.sum(inputStart, inputFinish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart5ToFinish0That0() {
        int inputStart = 5;
        int inputFinish = 0;
        int result = Counter.sum(inputStart, inputFinish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5ToFinish0ThatMinus15() {
        int inputStart = -5;
        int inputFinish = 0;
        int result = Counter.sum(inputStart, inputFinish);
        int expected = -15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart0ToFinishMinus5That0() {
        int inputStart = 0;
        int inputFinish = -5;
        int result = Counter.sum(inputStart, inputFinish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}