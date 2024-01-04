package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToDollar(float value) {
        return value / 0.86F;
    }

    public static float dollarToEuro(float value) {
        return value / 1.17F;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float usd = Converter.rubleToDollar(120);
        float euroUsd = Converter.euroToDollar(139.32F);
        float usdEuro = Converter.dollarToEuro(140.4F);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + usd + " usd.");
        System.out.println("139.32 euro are " + euroUsd + " usd.");
        System.out.println("140.40 usd are " + usdEuro + " euro.");

        float inputEuro = 140;
        float inputDollar = 120;
        float inputEuroDollar = 139.32F;
        float inputDollarEuro = 140.4F;

        float expectedEuro = 2;
        float expectedDollar = 2;
        float expectedEuroDollar = 162;
        float expectedDollarEuro = 120;

        float outputEuro = Converter.rubleToEuro(inputEuro);
        float outputDollar = Converter.rubleToDollar(inputDollar);
        float outputEuroDollar = Converter.euroToDollar(inputEuroDollar);
        float outputDollarEuro = Converter.dollarToEuro(inputDollarEuro);

        System.out.println();

        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("140 rubles are " + euro + ". Test result: " + passedEuro);

        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("120 rubles are " + usd + ". Test result: " + passedDollar);

        boolean passedEuroDollar = expectedEuroDollar == outputEuroDollar;
        System.out.println("139.32 euro are " + euroUsd + ". Test result: " + passedEuroDollar);

        boolean passedDollarEuro = expectedDollarEuro == outputDollarEuro;
        System.out.println("140.40 usd are " + usdEuro + ". Test result: " + passedDollarEuro);

    }
}