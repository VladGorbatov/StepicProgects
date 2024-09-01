package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

class Stepic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stroka = sc.nextLine().toLowerCase().replace(".", "").replace(",", "");
        String[] words = stroka.split(" ");

        int counter = 0;
        for (String word : words) {
            if (word.charAt(0) == 'а') {
                counter++;
            }
        }


        System.out.println(counter);
    }
}
