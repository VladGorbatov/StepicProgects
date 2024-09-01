package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class myFactorial {

    public static void main(String[] args) {
        System.out.println("Введите число, для которого нужно подобрать факториал: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Факториал равен: " + fac(n));
    }

    static int fac(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fac(n - 1);


    }
}
