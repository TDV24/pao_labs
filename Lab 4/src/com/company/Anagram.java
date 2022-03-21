package com.company;

import java.util.Arrays;
public class Anagram {
    public static boolean anagram(String word1, String word2){
        String str1 = word1.replaceAll("\\s", "");
        String str2 = word2.replaceAll("\\s", "");
        if(str1.length() != str2.length())
            return false;
        else
        {
            char[] w1 = str1.toLowerCase().toCharArray();
            char[] w2 = str2.toLowerCase().toCharArray();
            Arrays.sort(w1);
            Arrays.sort(w2);
            if(Arrays.equals(w1, w2))
                return true;
            else;
                return false;
        }
    }
}
