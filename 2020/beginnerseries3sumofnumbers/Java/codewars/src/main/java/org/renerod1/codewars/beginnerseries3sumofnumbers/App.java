package org.renerod1.codewars.beginnerseries3sumofnumbers;

public class App {
    public static void main(String[] args) {
        App s = new App();

        s.GetSum(5, -1);
        s.GetSum(505, 4);
        s.GetSum(321, 123);
        s.GetSum(-321, 123);
        s.GetSum(0, 0);
        s.GetSum(5, 1);
        s.GetSum(17, 17);
    }

    public int GetSum(int a, int b)
    {
    int lower = 0;
    int higher = 0;
    int sums = 0;

    if (a == b) {
        return a;
    } else if (a > b) {
        lower = b;
        higher = a;
    } else {
        lower = a;
        higher = b;
    }

    for (int i = lower; i <= higher; i++) {
        sums += i;
    }
    return sums;
    }
}
