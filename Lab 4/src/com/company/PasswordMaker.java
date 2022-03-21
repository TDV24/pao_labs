package com.company;

import java.util.Random;

public class PasswordMaker {
    private String magic_number;
    private String magic_string;
    private String name;

    public PasswordMaker(String magic_number, String magic_string, String name) {
        this.magic_number = magic_number;
        this.magic_string = magic_string;
        this.name = name;
    }

    public String getMagic_number() {
        return magic_number;
    }

    public void setMagic_number(String magic_number) {
        this.magic_number = magic_number;
    }

    public String getMagic_string() {
        return magic_string;
    }

    public void setMagic_string(String magic_string) {
        this.magic_string = magic_string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword(){
        String password = "";
        password = password + this.magic_number;
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 10; i++)
        {
            int index = random.nextInt(this.magic_string.length());
            System.out.print(index + " ");
            char c = this.magic_string.charAt(index);
            password = password + c;
        }
        System.out.print("\n");
        password = password + name.length();
        int randomnumber = random.nextInt(100);
        password = password + randomnumber;
        return password;
    }
}
