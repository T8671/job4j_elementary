package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int i : data) {
            if (i == element) {
                result = i;
                break;
            }
        }
        return result;
    }
}
