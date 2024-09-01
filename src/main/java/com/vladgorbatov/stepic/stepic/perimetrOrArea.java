package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class perimetrOrArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String storona = sc.nextLine();
        int num = sc.nextInt();

        perimetr(storona, num);
        area(storona, num);
    }

    static void perimetr(String storona, int num) {
        if (storona.equalsIgnoreCase("Квадрат")) {
            System.out.println(num * 4);
        } else {
            System.out.println((int) (2 * Math.PI * num));
        }
    }

    static void area(String storona, int num) {
        if (storona.equalsIgnoreCase("Квадрат")) {
            System.out.println(num * num);
        } else {
            System.out.println((int) (Math.ceil(Math.PI * num * num)));
        }
    }
}
