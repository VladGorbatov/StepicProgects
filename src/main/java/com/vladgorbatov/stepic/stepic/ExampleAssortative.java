package com.vladgorbatov.stepic.stepic;

import java.util.Arrays;
import java.util.Scanner;

class ExampleAssortative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sortByLength(s);
    }

    static void sortByLength(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words);
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String obrabotka = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = obrabotka;
                }

            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
