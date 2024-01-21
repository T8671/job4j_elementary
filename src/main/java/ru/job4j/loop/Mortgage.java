package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double debt = amount * percent / 100 + amount;
        while (debt > 0) {
            debt -= salary;
            year++;
            debt = debt * percent / 100 + debt;
        }
        return year;
    }
}

