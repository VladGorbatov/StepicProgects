package com.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCalculate {
    String txt = "Выберите необходимую операцию:" +
            "\n1 — прибавить дни к дате;" +
            "\n2 — отбавить дни от даты;" +
            "\n3 — узнать расстояние между дат в днях;" +
            "\n4 — изменить дату на сегодняшний день;" +
            "\n5 — изменить рабочую дату;" +
            "\n0 — закрыть программу." +
            "\n" +
            "\nВаша операция: ";
    Scanner sc = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);
    Calendar calendar = new GregorianCalendar();
    SimpleDateFormat sdf = new SimpleDateFormat("d MMMM y");
    SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");

    public void choice() {
        while (true) {
            System.out.print(txt);
            String str = scan.next().toLowerCase();

            switch (str) {
                case "1":
                    plusDays();
                    break;
                case "2":
                    minusDays();
                    break;
                case "3":
                    days();
                    break;
                case "4":
                    today();
                    break;
                case "5":
                    changeDay();
                    break;
                case "0":
                    scan.close();
                    sc.close();
                    System.out.println("Программа завершена.");

                    return;
                default:
                    System.out.print("Неизвестная операция! Повторите попытку:\n" + txt);
                    break;
            }
        }
    }

    public void calculate() {
        System.out.print("Это простой калькулятор дат.\nВведите вашу дату.\n");
        System.out.print("Введите год: ");
        int a = sc.nextInt();
        calendar.set(Calendar.YEAR, a);

        System.out.print("Введите месяц (1-12): ");
        int b = sc.nextInt();
        calendar.set(Calendar.MONTH, b - 1);

        System.out.print("Введите день (1-31): ");
        int c = sc.nextInt();
        calendar.set(Calendar.DAY_OF_MONTH, c);

        System.out.println(sdf2.format(calendar.getTime()) + " — это день недели " + sdf.format(calendar.getTime()) + "\n");
    }

    public void plusDays() {
        System.out.print("Введите количество дней, которое нужно прибавить: ");
        int plus = sc.nextInt();
        calendar.add(Calendar.DAY_OF_MONTH, plus);
        System.out.println("Новая дата: " + sdf.format(calendar.getTime()) + "\n");
    }

    public void minusDays() {
        System.out.print("Введите количество дней, которое нужно отнять: ");
        int minus = sc.nextInt() * -1;
        calendar.add(Calendar.DAY_OF_MONTH, minus);
        System.out.println("Новая дата: " + sdf.format(calendar.getTime()) + "\n");
    }

    public void days() {
        Calendar calendar2 = new GregorianCalendar();
        System.out.print("Введите год нужной даты: ");
        int a1 = sc.nextInt();
        calendar2.set(Calendar.YEAR, a1);

        System.out.print("Введите месяц нужной даты (1-12): ");
        int b1 = sc.nextInt();
        calendar2.set(Calendar.MONTH, b1 - 1);

        System.out.print("Введите день нужной даты (1-31): ");
        int c1 = sc.nextInt();
        calendar2.set(Calendar.DAY_OF_MONTH, c1);

        long d1 = calendar.getTimeInMillis();
        long d2 = calendar2.getTimeInMillis();

        if (d1 > d2) {
            long result = (d1 - d2) / 1000 / 60 / 60 / 24;
            System.out.println("Между датой " + sdf.format(calendar.getTime()) + " и " + sdf.format(calendar2.getTime()) + " прошло дней :" + result + "\n");
        } else if (d1 < d2) {
            long result = (d2 - d1) / 1000 / 60 / 60 / 24;
            System.out.println("Между датой " + sdf.format(calendar2.getTime()) + " и " + sdf.format(calendar.getTime()) + " прошло дней: " + result + "\n");
        } else {
            System.out.println("Даты совпадают.\n");
        }
    }

    public void today() {
        Date date = new Date();
        calendar.setTime(date);
        System.out.println("Дата изменена на актуальную: " + sdf.format(calendar.getTime()) + "\n");
    }

    public void changeDay() {
        System.out.print("Введите год: ");
        int a = sc.nextInt();
        calendar.set(Calendar.YEAR, a);

        System.out.print("Введите месяц (1-12): ");
        int b = sc.nextInt();
        calendar.set(Calendar.MONTH, b - 1);

        System.out.print("Введите день (1-31): ");
        int c = sc.nextInt();
        calendar.set(Calendar.DAY_OF_MONTH, c);

        System.out.println("Рабочая дата: " + sdf.format(calendar.getTime()) + "\n");
    }
}
