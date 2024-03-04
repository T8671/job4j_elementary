package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int a, int b, int c) {
        return a < c && b < c ? c : a > b ? a : b;
    }

    public static int max(int a, int b, int c, int d) {
        return a < d && b < d && c < d ? d
                : a < c && b < c ? c : a > b ? a : b;
    }
}
