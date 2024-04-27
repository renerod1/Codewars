package org.renerod1.codewars.convertanumbertoastring;

public class App {
    public static void main(String[] args) {
        numberToString(67);
        numberToString(79585);
        numberToString(1 + 2);
        numberToString(1 - 2);
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}
