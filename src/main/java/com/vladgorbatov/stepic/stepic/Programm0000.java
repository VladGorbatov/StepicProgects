package com.vladgorbatov.stepic.stepic;

class Programm0000 {

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4};
        f(mas);
        System.out.println(mas[1] + mas[3]);
    }

    static void f(int[] a) {
        a[0] = 10;
        a[1] = 100;
    }
}
