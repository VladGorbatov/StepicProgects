package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        monneub(mas);
    }

    static void monneub(int[] mas) {
        int counter = 1;
        int maxCounter = counter;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] <= mas[i + 1]) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
            } else {
                counter = 1;
            }
        }
        System.out.println(maxCounter);
    }
}
