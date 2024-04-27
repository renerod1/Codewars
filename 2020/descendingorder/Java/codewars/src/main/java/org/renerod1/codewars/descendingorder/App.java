package org.renerod1.codewars.descendingorder;

public class App {
    public static void main(String[] args) {
        sortDesc(0);
        sortDesc(1);
        sortDesc(15);
        sortDesc(1021);
        sortDesc(123495678);
    }

    public static int sortDesc(final int num) {
        String output = "";

        java.util.List list = new java.util.ArrayList();

        for (int i = 0; i < String.valueOf(num).length(); i++) {
            list.add(String.valueOf(num).charAt(i));
        }

        list.sort(java.util.Comparator.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            output += list.get(i).toString();
        }

        return Integer.parseInt(output);
    }
}
