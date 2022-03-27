package com.geekbrains.lesson1;

public class HomeWork_2 {

    public static void main(String[] args) {
        System.out.println("----Task1----");
        System.out.println(checkNumberLower(5, 20));
        System.out.println("----Task2----");
        checkNumberPositiveOrNegative(0);
        System.out.println("----Task3----");
        System.out.println(chIsNegative(5));
        System.out.println("----Task4----");
        printWordTimes("Привет", 10);
        System.out.println("----Task5----");
        System.out.println(leapYear(2008));

    }

    public static boolean checkNumberLower(int a, int b) {
        return (a + b) > 10 && (a + b) <= 20;
    }

    public static void checkNumberPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean chIsNegative(int a) {
        return a < 0;
    }

    public static void printWordTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(word + " " + i);
        }
    }

    public static boolean leapYear(int x) {
        return x % 4 == 0 && x % 100 != 0;
    }
}
