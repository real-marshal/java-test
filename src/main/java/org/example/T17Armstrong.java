package org.example;

import java.util.Scanner;

public class T17Armstrong {
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int power = String.valueOf(num).length();

        for (char digitChar : String.valueOf(num).toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            sum += Math.pow(digit, power);
        }

        return num == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isArmstrong(n));
    }
}
