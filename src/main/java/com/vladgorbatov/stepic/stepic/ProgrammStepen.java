package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammStepen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }

    static double pow(double a, int n) {
        double result = 1;          // Изначально результат равен 1
        for (int i = 0; i < n; i++) {
            result *= a;            // Умножаем результат на a, n раз
        }
        return result;              // Возвращаем результат
    }
}
