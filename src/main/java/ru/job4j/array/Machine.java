package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    @SuppressWarnings("checkstyle:NeedBraces")
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int balance = money - price;

        for (int i = 0; i < coins.length; i++) {
            while (balance >= coins[i]) {
                result[size] = coins[i];
                balance -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}



