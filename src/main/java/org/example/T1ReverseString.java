package org.example;

import java.util.Scanner;

public class T1ReverseString {
    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println("original " + s);
        System.out.println("reversed " + reverseString(s));
    }
}