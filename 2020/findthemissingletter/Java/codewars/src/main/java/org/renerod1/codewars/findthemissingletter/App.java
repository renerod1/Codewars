package org.renerod1.codewars.findthemissingletter;

public class App {
    public static void main(String[] args) {
        findMissingLetter(new char[] { 'a','b','c','d','f' });
        findMissingLetter(new char[] { 'O','Q','R','S' });
    }

    public static char findMissingLetter(char[] array) {

        java.util.List list;
        list = new java.util.ArrayList();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        list.sort(java.util.Comparator.naturalOrder());

        for (int i = 0; i < list.size(); i++) {
            char tempChar1 = (char) list.get(i);
            char tempChar2 = (char) list.get(i + 1);
            char tempChar3 = (char) ((int) tempChar1 + 1);
            if (tempChar2 != tempChar3) {
                return tempChar3;
            }
        }
        return ' ';
    }
}
