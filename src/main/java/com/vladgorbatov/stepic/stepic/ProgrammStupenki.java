package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammStupenki {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.print(variations(n));
    }

    static long variations(long n) {
        long vars = 0;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }

        return variations(n - 3) + variations(n - 2) + variations(n - 1);

    }
}
