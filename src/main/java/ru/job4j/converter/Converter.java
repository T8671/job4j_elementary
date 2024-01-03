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
        float usd = Converter.rubleToDollar(140);
        float euroUsd = Converter.euroToDollar(140);
        float usdEuro = Converter.dollarToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + usd + " usd.");
        System.out.println("140 euro are " + euroUsd + " usd.");
        System.out.println("140 usd are " + usdEuro + " euro.");
    }
}
