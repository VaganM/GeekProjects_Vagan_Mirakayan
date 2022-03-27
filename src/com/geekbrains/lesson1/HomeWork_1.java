package com.geekbrains.lesson1;

public class HomeWork_1 {
    public static void main(String[] args) {

        // ДЗ-1

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        // ДЗ-2

        int a = 20;
        int b = 30;
        int c = a - b;

        if (c > 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }

        // ДЗ-3

        int value = 150;

        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Конец");
        }

        // ДЗ-4

        int d = 10;
        int f = 9;

        if (d >= f) {
            System.out.println("d <= f");
        }
        else {
            System.out.println("d < f");
        }

    }
}