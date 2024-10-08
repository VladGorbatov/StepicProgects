package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Programm13 {
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
        int ans = find_line7(mas);
        if (ans != -1)
            System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
        else
            System.out.println("Таких строк нет");
    }

    static int p = 0;
    static int i = 0;
    static int plus = 0;

    static int find_line7(int[][] mas) {
        if (i != mas.length) {
            if (p != mas[i].length) {
                plus = mas[i][p] + plus;
                p++;
                return find_line7(mas);
            }

            if (plus % 7 == 0) {
                return i;
            }

            i++;
            p = 0;
            plus = 0;
            return find_line7(mas);

        }
        return -1;

    }
}
