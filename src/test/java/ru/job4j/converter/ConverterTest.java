package ru.job4j.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class ConverterTest {

    @Test
    void whenConvert140rblThen2Euro() {
        float inputEuro = 140;
        float expectedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        float value = 0.0001f;
        Assertions.assertThat(outputEuro).isEqualTo(expectedEuro, withPrecision(value));
    }

    @Test
    void whenConvert120rblThen2Dollar() {
        float inputDollar = 120;
        float expectedDollar = 2;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        float value = 0.0001f;
        Assertions.assertThat(outputDollar).isEqualTo(expectedDollar, withPrecision(value));

    }

    @Test
    void whenConvert139euroThen162Dollar() {
        float inputEuroDollar = 139.32F;
        float expectedEuroDollar = 162;
        float outputEuroDollar = Converter.euroToDollar(inputEuroDollar);
        float value = 0.0001f;
        Assertions.assertThat(outputEuroDollar).isEqualTo(expectedEuroDollar, withPrecision(value));
    }

    @Test
    void whenConvert140dollarThen120Euro() {
        float inputDollarEuro = 140.4F;
        float expectedDollarEuro = 120;
        float outputDollarEuro = Converter.dollarToEuro(inputDollarEuro);
        float value = 0.0001f;
        Assertions.assertThat(outputDollarEuro).isEqualTo(expectedDollarEuro, withPrecision(value));

    }
}