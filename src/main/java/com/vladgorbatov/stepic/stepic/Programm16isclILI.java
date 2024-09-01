package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Programm16isclILI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() != 0;
        boolean s = sc.nextInt() != 0;
        System.out.println(xor(f, s));
    }

    static boolean xor(boolean f, boolean s) {
        if (f == s) return false;
        else return true;
    }
}
