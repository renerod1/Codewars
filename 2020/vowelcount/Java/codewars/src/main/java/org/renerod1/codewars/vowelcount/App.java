package org.renerod1.codewars.vowelcount;

public class App {
    public static void main(String[] args) {
        getCount("abracadabra");
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        
        for(int i = 0; i < str.toLowerCase().length(); i++)
        {
            switch(str.charAt(i)) 
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
                default:
                    break;
            }
        }
        
        return vowelsCount;
    }
}
