package org.example;

import java.util.Scanner;

public class T19RemoveSpacesWoReplace {
    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(removeSpaces(s));
    }
}
