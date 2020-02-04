package com.company;


public class Main {

    public static void print(String a, String b){
        System.out.print(a+", ");
        System.out.println(b);
    }

    public static void main(String[] args) {
	   System.out.println("Hello, Ion!");




	   char c = 'i';

	   String a = String.valueOf(c);
	   String b = Character.toString(c);
	   print(a,b);



    }
}
