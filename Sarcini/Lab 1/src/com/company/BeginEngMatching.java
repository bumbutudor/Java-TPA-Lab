package com.company;

public class BeginEngMatching {
    public static void firstLastMatch(String s){
        String[] sequence = s.split("W+");

        for (String word : sequence){
            //System.out.println(word);
            if(word.charAt(0) == word.charAt(word.length()-1)){
                System.out.println(word.charAt(0));
            }
        }

    }




}
