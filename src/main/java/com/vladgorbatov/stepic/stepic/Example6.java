package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[][] mas = new int[n][];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                a[j] = Integer.parseInt(numbers[j]);
                mas[i] = a;
            }

        }
        maximum(mas);
    }

    static void maximum(int[][] mas) {
        int max = Integer.MIN_VALUE;
        for (int[] ma : mas) {
            int min;
            min = ma[0];
            for (int i : ma)
                if (i < min) {
                    min = i;
                }
            if (min <= max) continue;
            max = min;

        }
        System.out.print(max);
    }
}
