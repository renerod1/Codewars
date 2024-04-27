package org.renerod1.codewars.convertastringtoanumber;

public class App {
    public static void main(String[] args) {
        stringToNumber("1234");
        stringToNumber("605");
        stringToNumber("1405");
        stringToNumber("-7");
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
