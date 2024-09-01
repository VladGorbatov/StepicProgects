package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammElection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() == 1 ? true : false;
        boolean s = sc.nextInt() == 1 ? true : false;
        boolean t = sc.nextInt() == 1 ? true : false;
        System.out.println(election(f, s, t));
    }

    static boolean election(boolean f, boolean s, boolean t) {
        if (f == true && s == true) {
            return true;
        }
        if (s == true && t == true) {
            return true;
        }
        if (f == true && t == true) {
            return true;
        }
        return false;

        //if (f == s) return f;
        //return t;

    }
}
