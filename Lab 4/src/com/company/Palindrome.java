package com.company;

public class Palindrome {
    public static boolean palindrome(String word){
        String reverse_word = "";
        char c;
        for(int i = 0; i < word.length(); i++)
        {
            c = word.charAt(i);
            reverse_word = c + reverse_word;
        }
        if(word.equals(reverse_word))
            return true;
        else
            return false;
    }
}
