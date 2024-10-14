package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T9Fibonacci {
    public static List<Integer> getFibs(int n) {
        List<Integer> fibs = new ArrayList<>();

        fibs.add(0);
        fibs.add(1);

        for (int i = 2; i < n; i++) {
            fibs.add(fibs.get(i - 1) + fibs.get(i - 2));
        }

        return fibs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(getFibs(n));
    }
}
