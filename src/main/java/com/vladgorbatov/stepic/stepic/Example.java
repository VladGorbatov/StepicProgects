package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }

    static void twoWords(String s1, String s2) {
        if (s1.length() > s2.length()) {
            System.out.print("Первая строка длиннее");
        } else {
            if (s1.length() < s2.length()) {
                System.out.print("Вторая строка длиннее");
            } else {
                System.out.print("Равная длина");
            }
        }


    }
}
