package org.renerod1.codewars.oppositesattract;

public class App {
    public static void main(String[] args) {
        isLove(1, 4);
        isLove(2, 2);
    }

    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0) && (flower2 % 2 == 0)) {
            return false;
        } else {
            if ((flower1 % 2 == 1) && (flower2 % 2 == 1)) {
                return false;
            } else {
                return true;
            }
        }
    }
}
