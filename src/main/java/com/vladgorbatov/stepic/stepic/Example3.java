package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
    }

    static void simpleAB(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i == 1) {
                System.out.println(i + " - 1");
            } else {
                if (i < 1) {
                    System.out.println(i + " - cоставное");
                } else {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println(isPrime ? i + " - простое" : i + " - составное");

                }

            }
        }
    }
}
