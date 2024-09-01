package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammMnogougolnic {

    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] dots = new int[n][2];
        for (int i = 0; i < dots.length; i++) {
            dots[i][0] = sc.nextInt(); // x
            dots[i][1] = sc.nextInt(); // y
            sc.close();
        }
        double p = 0;

        for (int i = 0; i < dots.length - 1; i++) {
            p += distance(dots[i][0], dots[i][1], dots[i + 1][0], dots[i + 1][1]);
        }
        p += distance(dots[0][0], dots[0][1], dots[dots.length - 1][0], dots[dots.length - 1][1]);
        System.out.println(Math.round(p * 100) / 100.0);

        int left = 0;
        int right = 0;

        for (int i = 0; i < dots.length - 1; i++) {
            left += dots[i][0] * dots[i + 1][1];
            right += dots[i][1] * dots[i + 1][0];
        }
        double S = Math.abs(right - left) / 2.0;
        System.out.println(Math.round(S * 100) / 100.0);
    }


}
