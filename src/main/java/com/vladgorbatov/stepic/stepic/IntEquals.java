package com.vladgorbatov.stepic.stepic;

import java.util.Scanner;

import static java.lang.Character.isDigit;

class IntEquals {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите первое значение:");
                int nums1 = sc.nextInt();

                System.out.println("Введите второе значение:");
                int nums2 = sc.nextInt();

                if(nums1==nums2){
                        System.out.println("Объекты равны");
                }else{System.out.println("Объекты НЕ равны");}


        }
}


