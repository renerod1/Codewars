package org.renerod1.codewars.convertbooleanvaluestostringsyesorno;

public class App {
    public static void main(String[] args) {
        boolToWord(true);
        boolToWord(false);
    }

    public static String boolToWord(boolean b)
    {
        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
