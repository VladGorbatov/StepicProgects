package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammAkkerman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(akkerman(m, n));
    }

    static long akkerman(long m, long n) {
        if (m == 0) {
            return n + 1;
        }
        if (m > 0 && n == 0) {
            return akkerman(m - 1, 1);
        }

        if (m > 0 && n > 0) {
            return akkerman(m - 1, akkerman(m, n - 1));
        }
        return 0;
    }
}
