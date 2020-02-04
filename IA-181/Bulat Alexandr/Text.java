package com.example.TextToNum;
import java.util.*;

public class Text {
    String text;
    int length;
    int[] num = new int[50];

    public Text(String text){
        this.text = text;
        this.length = text.length();
    }

    void Print(){
        System.out.println("Textul original: " + text);
        System.out.println("Text in cifre: ");

        int i = 0;
        while(i < length) {
            if(num[i] != 0 ) {
                System.out.print(" " + num[i]);
            }
            else if(num[i] == 0){
                System.out.print("  ");
            }
            i++;
        }
    }

    void TextToNumber(){
        char[] ch = text.toCharArray();
        int i = 0;
        for(char c : ch){
            int temp = (int)c;
            int temp_integer = 96;
            if (temp <= 122 & temp >=97)
                num[i] = (temp-temp_integer);
            i++;
        }
    }

    public static void main(String[] args){
        Text word1 = new Text("alexandru ce mai faci");
        word1.TextToNumber();
        word1.Print();
    }
}
