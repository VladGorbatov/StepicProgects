package com.vlad.gorbatov.calculator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Calculations {

    public static void calculate() throws IOException {
        File file = new File("calculations.txt");
        File outputFile = new File("output.txt");

        try (Scanner rs = new Scanner(file);
             FileOutputStream fos = new FileOutputStream(outputFile, true);
             PrintStream ps = new PrintStream(fos)) {

            int line = 0;

            while (rs.hasNextLine()) {
                String[] str = rs.nextLine().split(" ");
                for (int i = 0; i < str.length; i++) {
                    ps.append(str[i] + " ");
                }
                line++;

                double a;
                double b;
                double result = 0;

                try {
                    a = Double.parseDouble(str[0]);
                    b = Double.parseDouble(str[2]);
                } catch (NumberFormatException ex) {
                    ps.append("= Error! Not number").append("\n");
                    System.out.println("Error! Not number: line " + line);
                    continue;
                }

                if ("+-*/".contains(str[1])) {
                    switch (str[1]) {
                        case "+":
                            result = a + b;
                            break;
                        case "-":
                            result = a - b;
                            break;
                        case "*":
                            result = a * b;
                            break;
                        case "/":
                            if (b == 0) {
                                ps.append("= Error! Division by zero").append("\n");
                                System.out.println("Error! Division by zero: line " + line);
                                continue;
                            } else {
                                result = a / b;
                            }
                            break;
                        default:
                            ps.append("= Operation Error!").append("\n");
                            System.out.println("Operation Error!: line " + line);
                            continue;
                    }
                } else {
                    ps.append("= Operation Error!").append("\n");
                    System.out.println("Operation Error!: line " + line);
                    continue;
                }
                System.out.println("Результат операции: " + result);
                ps.append("= ").append(String.valueOf(result)).append("\n");
                System.out.println("Запись результата произведена.");
            }
        } catch (IOException ex) {
            System.out.println("Error during file operations: " + ex.getMessage());
        }
        System.out.println("Калькулятор завершил работу.");
    }
}

