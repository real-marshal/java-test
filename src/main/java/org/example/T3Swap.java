package org.example;

import java.util.Scanner;

public class T3Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);
    }
}
