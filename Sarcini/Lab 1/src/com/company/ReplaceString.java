package com.company;

public class ReplaceString {

    public static void Schimbare(String text, int lung) {

        String[] tokens = text.split(" ");

        // inlocuirea cuvintelor de lungimea specificata
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].length() == lung){
                tokens[i] = "Gabi";
            }
        }

        // afisare
        for ( String a : tokens){
            System.out.print(a + " ");
        }
    }
}
