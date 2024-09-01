package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Programm9arhimed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        int V = sc.nextInt();
        int F = arhimed(ro, V);
        System.out.println("F = " + F + "H");
    }

    static int arhimed(int ro, int V) {
        int g = 10;
        return
                g * ro * V;
    }
}
