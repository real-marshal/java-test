package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T15RepeatingChars {
    public static Set<Character> getRepeatingChars(String s) {
        Set<Character> repeatingChars = new HashSet<>();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                repeatingChars.add(s.charAt(i));
            }
        }

        return repeatingChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(getRepeatingChars(s));
    }
}
