package org.renerod1.codewars.disemvoweltrolls;

public class App {
    public static void main(String[] args) {
        disemvowel("This website is for losers LOL!");
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
