package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Programm7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        area(a, b, h);
    }

    static void area(int a, int b, int h) {
        System.out.print(2 * (a * b + a * h + b * h));
    }
}
