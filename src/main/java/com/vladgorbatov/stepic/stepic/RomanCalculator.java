package com.vladgorbatov.stepic.stepic;

import java.util.HashMap;
import java.util.Scanner;

class RomanCalculator {

    private final static HashMap<Character, Integer> romanToArabicMap = new HashMap<>();
    private final static HashMap<Integer, String> arabicToRomanMap = new HashMap<>();
    private final static int[] arabicKeys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    static {
        romanToArabicMap.put('I', 1);
        romanToArabicMap.put('V', 5);
        romanToArabicMap.put('X', 10);
        romanToArabicMap.put('L', 50);
        romanToArabicMap.put('C', 100);
        romanToArabicMap.put('D', 500);
        romanToArabicMap.put('M', 1000);

        arabicToRomanMap.put(1000, "M");
        arabicToRomanMap.put(900, "CM");
        arabicToRomanMap.put(500, "D");
        arabicToRomanMap.put(400, "CD");
        arabicToRomanMap.put(100, "C");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(50, "L");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(10, "X");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(1, "I");
    }

    public static int romanToArabic(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int value = romanToArabicMap.get(roman.charAt(i));
            if (i + 1 < roman.length() && value < romanToArabicMap.get(roman.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }


    public static String arabicToRoman(int number) {
        StringBuilder roman = new StringBuilder();
        for (int key : arabicKeys) {
            while (number >= key) {
                roman.append(arabicToRomanMap.get(key));
                number -= key;
            }
        }
        return roman.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое римское число: ");
        String romanNum1 = sc.next().toUpperCase();
        int num1 = romanToArabic(romanNum1);


        System.out.print("Введите нужную операцию(+, -, *, /): ");
        char operation = sc.next().charAt(0);


        System.out.print("Введите второе римское число: ");
        String romanNum2 = sc.next().toUpperCase();
        int num2 = romanToArabic(romanNum2);

        int result;


        switch (operation) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Операция невозможна: деление на ноль!");
                    return;
                }
                break;

            default:
                System.out.println("Операция невозможная: ошибка операции!");
                return;

        }

        if (result <= 0) {
            System.out.println("Операция невозможна: результат не может быть представлен в римских числах!");
            return;
        }

        String romanResult = arabicToRoman(result);
        System.out.print("Результат операции: " + romanResult);
    }
}
