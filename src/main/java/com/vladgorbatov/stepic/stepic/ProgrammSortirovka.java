package com.vladgorbatov.stepic.stepic;

import java.util.Arrays;
import java.util.Scanner;

class ProgrammSortirovka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        sort(mas);
        for (int i : mas)
            System.out.print(i + " ");
    }

    static void sort(int[] mas) {
        for (int i = 0; i < mas.length; i++) mas[i] *= -1;
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) mas[i] *= -1;

    }
}
