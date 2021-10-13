package com.croc.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y, result;
        Point a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату точки A(x, y)");

        x = scanner.nextDouble();
        y = scanner.nextDouble();
        a = new Point(x, y);

        System.out.println("Введите координату точки B(x, y)");

        x = scanner.nextDouble();
        y = scanner.nextDouble();

        b = new Point(x, y);

        System.out.println("Введите координату точки C(x, y)");

        x = scanner.nextDouble();
        y = scanner.nextDouble();

        c = new Point(x, y);

        result = solve(a, b, c);
        System.out.println("Площадь треугольника: " + result);

    }

    public static double solve(Point a, Point b, Point c) {
        double AB, BC, AC, p;
        AB = sideLength(a, b);
        BC = sideLength(c, b);
        AC = sideLength(a, c);
        p = (AB + BC + AC) / 2;
        if (isTriangle(AB, BC, AC)) {
            return Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));
        } else {
            System.out.println("такого треугольника не существует");
            return 0;
        }
    }

    public static double sideLength(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }

    public static boolean isTriangle(double AB, double AC, double BC) {
        boolean result;
        if (AB < BC + AC && BC < AB + AC && AC < AB + BC) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
