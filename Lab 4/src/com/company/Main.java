package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String randomword(int length, String keyword){
        while(keyword.equals("MAGIC_STRING") && length < 20)
        {
            System.out.println("The given value is lower than 20, please insert an equal or greater value than 20");
            Scanner scanner = new Scanner(System.in);
            int length1 = scanner.nextInt();
            length = length1;
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomstring = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(alphabet.length());
            char c = alphabet.charAt(index);
            randomstring.append(c);
        }
        String finalrandomstring = randomstring.toString();
        return finalrandomstring;
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    String word = scanner.nextLine();
//    System.out.println(Palindrome.palindrome(word));
//    String word1 = scanner.nextLine();
//    String word2 = scanner.nextLine();
//    System.out.println(Anagram.anagram(word1, word2));
        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();
        String string1 = randomword(length1, "MAGIC_NUMBER");
        String string2 = randomword(length2, "MAGIC_STRING");
        System.out.println(string1);
        System.out.println(string2);
        PasswordMaker password = new PasswordMaker(string1, string2, "Dragos");
        System.out.println(password.getPassword());
    }
}
