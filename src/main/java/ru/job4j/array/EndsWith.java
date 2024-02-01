package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        return word[word.length - 1] == postfix[postfix.length - 1];
    }
}
