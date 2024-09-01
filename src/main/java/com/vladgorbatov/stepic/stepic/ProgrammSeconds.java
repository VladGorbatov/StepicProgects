package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammSeconds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("Секунд прошло: " + second_count(d, h, m, s));
    }

    static int second_count(int d, int h, int m, int s) {
        if (d > 0) {
            h = h + 24;
            d--;
        }
        if (h > 0 && d == 0) {
            m = m + 60;
            h--;
        }
        if (m > 0 && h == 0 && d == 0) {
            s = s + 60;
            m--;
        }
        if (d == 0 && h == 0 && m == 0) {
            return s;
        }
        return second_count(d, h, m, s);
    }
}
