package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammPLUS3FOR5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(getn(n));
    }

    static String getn(int n) {
        if (n == 1) return "YES";
        else if (n < 0) return "NO";
        else if ((n - 1) % 3 == 0 || n % 5 == 0) return "YES";
        else return "NO";
    }
}
