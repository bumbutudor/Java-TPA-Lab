package com.company;


import java.util.Scanner;

public class Main {

    public static void print(String a, String b){
        System.out.print(a+", ");
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduceti textul");
        String text = myObj.nextLine();  // Read user input
        System.out.println("Textul introdus este: " + text);  // Output user input

        Scanner num = new Scanner(System.in);  // Create a Scanner object
        //System.out.println("Introduceti lungimea cuvintului pe care doriti sa-l modificati");
        //int lung = num.nextInt();


        // ReplaceString.Schimbare(text, lung);
        BeginEngMatching.firstLastMatch(text);


    }
}
