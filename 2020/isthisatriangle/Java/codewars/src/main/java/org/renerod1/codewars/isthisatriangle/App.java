package org.renerod1.codewars.isthisatriangle;

public class App {
    public static void main(String[] args) {
        isTriangle(1, 2, 2);
    }

    public static boolean isTriangle(int a, int b, int c) {

        boolean testA = false;
        boolean testB = false;
        boolean testC = false;

        if ((a + b) > c) {
            testC = true;
        }

        if ((a + c) > b) {
            testB = true;
        }

        if ((b + c) > a) {
            testA = true;
        }

        return testA && testB && testC;
    }
}
