package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class T5WordCount {
    public static HashMap<String, Integer> countWords(String s) {
        String[] words = s.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.containsKey(word) ? wordCount.get(word) + 1 : 1);
        }

        return wordCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(countWords(s));
    }
}
