package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class geron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        geron1(a, b, c);

    }

    static void geron1(int a, int b, int c) {
        if (Math.pow(c, 2) > (Math.pow(a, 2) + Math.pow(b, 2))) {
            System.out.print("Такого треугольника не существует");
        } else {
            int p = (a + b + c) / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(S > 0 ? S : "Такого треугольника не существует");
        }


    }
}
