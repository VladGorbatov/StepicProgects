package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class ProgrammDigitCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(digit_count(s));
    }

    static int digit_count(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
