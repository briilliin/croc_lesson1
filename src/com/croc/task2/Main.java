package com.croc.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество байт: ");

        double x = scanner.nextDouble();
        printBytes(x);
        printBytes(23);
        printBytes(1024);
        printBytes(53692044905543.);
        printBytes(5428952);
    }


    public static void printBytes(double number) {
        if (number >= 1099511627776.) {
            System.out.println(String.format("%.1f", number / (1099511627776.)) + "ТБ");
        } else if (number >= 1024 * 1024 * 1024) {
            System.out.println(String.format("%.1f", number / (1024 * 1024 * 1024)) + "ГБ");
        } else if (number >= 1024 * 1024) {
            System.out.println(String.format("%.1f", number / (1024 * 1024)) + "МБ");
        } else if (number >= 1024) {
            System.out.println((number / 1024) + "КБ");
        } else
            System.out.println(number + "Б");


    }

}



