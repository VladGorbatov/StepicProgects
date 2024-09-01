package com.vladgorbatov.stepic.stepic;

class IntToString {

    public static String convertToString(int num, int base) {
        return Integer.toString(num, base);
    }


    public static void main(String[] args) {
        int num = 123;
        int base = 2;

        String numAsString = convertToString(num, base);
        System.out.println(num + " в системе исчисления " + base + ": " + numAsString);

    }
}
