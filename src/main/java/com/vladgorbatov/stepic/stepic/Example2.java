package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);
    }

    static void simple(int a) {
        boolean isPrime = true;
        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "YES" : "NO");
    }
}
