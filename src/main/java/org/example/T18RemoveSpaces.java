package org.example;

import java.util.Scanner;

public class T18RemoveSpaces {
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(removeSpaces(s));
    }
}
