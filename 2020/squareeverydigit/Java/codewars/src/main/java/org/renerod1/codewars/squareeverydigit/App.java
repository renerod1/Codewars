package org.renerod1.codewars.squareeverydigit;

public class App {
    public static void main(String[] args) {
        App s = new App();
        s.squareDigits(9119);
    }

    public int squareDigits(int n) {
        String input = String.valueOf(n);
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            String singleDigit = String.valueOf(input.charAt(i));
            int squareValue = Integer.parseInt(singleDigit) * Integer.parseInt(singleDigit);
            output += String.valueOf(squareValue);
        }

        return Integer.parseInt(output);
    }
}
