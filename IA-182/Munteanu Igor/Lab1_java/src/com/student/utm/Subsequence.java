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

        ArrayList<String> wordList = new ArrayList<>();
        ArrayList<String> wordListOut = new ArrayList<>();
        String[] strArr = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : strArr)
        {
            if (!s.matches("^(?i:[aeiouy]).*"))
            {
                wordList.add(s);

            }
        }
        System.out.println("Cuvinte care se incep cu o consoana: " + wordList);

//        for (int i = 0; i < wordList.size(); i++)
//        {
//            int x = 0;
//            for (int j = 1; j < wordList.size(); j++)
//            {
//                if (wordList.get(0).length() == wordList.get(j).length())
//                {
//                    if ( x == 0)
//                    {
//                        wordListOut.add(wordList.get(0));
//                        x = x + 1;
//                    }
//                    wordListOut.add(wordList.get(j));
//                    wordList.remove(j);
//                    j = j - 1;
//                }
//                i = 0;
//            }
//            wordList.remove(0);
//        }
        int n = 4;
        for (int i = 0; i < wordList.size(); i++)
        {
            for (String s : wordList)
            {
                if (s.length() == n) {
                    sb.append(s).append(" ");
                }
            }
        }
        System.out.println("Words with length " + n + " are: " + sb.toString());
    }
}