package com.vladgorbatov.stepic.stepic;

import java.util.Arrays;
import java.util.Comparator;

class ArraySort {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 8, 9, 456, 47, 84, 46, 22, 4};

        Arrays.sort(array);
        System.out.print("Массив, отсортированный по возрастанию: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Comparator.reverseOrder());
        System.out.print("\nМассив, отсортированный по убыванию: ");
        for (int num : boxedArray) {
            System.out.print(num + " ");
        }

    }
}
