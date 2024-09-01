package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Example10found0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        int ans = find_0(mas);
        if (ans != -1)
            System.out.println("0 in " + (ans + 1) + " line");
        else
            System.out.println("0 not found");
    }

    static int find_0(int[][] mas) {
        for (int j = 0; j < mas.length; j++) {
            int[] ma = mas[j];
            for (int k = 0; k < ma.length; k++) {
                int i = ma[k];
                if (i == 0) {
                    return j;
                }
            }
        }
        return -1;

    }
}
