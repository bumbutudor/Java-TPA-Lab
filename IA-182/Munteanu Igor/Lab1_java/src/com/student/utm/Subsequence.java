package com.student.utm;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Subsequence
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text please:");
        String text = scanner.nextLine();
        System.out.println(text);

        ArrayList<String> wordList = new ArrayList<String>();
        ArrayList<String> wordListOut = new ArrayList<String>();
        String[] strArr = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : strArr) {
            if (!s.matches("^(?i:[aeiouy]).*")) {
                wordList.add(s);
            }
        }

        for (int i = 0; i < wordList.size(); i++) {
            int x = 0;
            for (int j = 1; j < wordList.size(); j++) {
                if (wordList.get(0).length() == wordList.get(j).length()) {
                    if ( x == 0) {
                        wordListOut.add(wordList.get(0));
                        x = x + 1;
                    }
                    wordListOut.add(wordList.get(j));
                    wordList.remove(j);
                    j = j - 1;
                }
                i = 0;
            }
            wordList.remove(0);
        }

        for (int i = 0; i < wordListOut.size(); i++) {
            for (int j = 0; j < wordListOut.size(); j++) {
                if (wordListOut.get(j).length() == i) {
                    sb.append(wordListOut.get(j)).append(" ");
                }
            }

            if (!sb.toString().equals("")) {
                System.out.println("Words with length " + i + " are: " + sb.toString());
                sb.setLength(0);
            }
        }
    }
}