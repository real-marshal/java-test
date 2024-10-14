package org.example;

import java.util.Scanner;

public class T2ReverseSubstring {
    public static String reverseSubstring(String s, int start, int end) {
        char[] charArray = s.toCharArray();
        int left = Math.max(0, start);
        int right = Math.min(end, s.length() - 1);

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
        System.out.println("reversed " + reverseSubstring(s, 0, 3));
    }
}