package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifferenceAndDivision(double first, double second) {
        return sum(difference(first, second),
                division(first, second));
    }

    public static double sumAllCalculations(double first, double second) {
        return sum(sumAndMultiply(first, second),
                sumDifferenceAndDivision(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: "
                + sumAllCalculations(10, 20));
    }
}
