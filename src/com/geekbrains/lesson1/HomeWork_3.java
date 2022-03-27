package com.geekbrains.lesson1;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class HomeWork_3 {
    public static void main(String[] args) {

        invertArray();
        fillArray();
        multiplyArrayNumbers();
        matrixArrayFillDiagonal();
        System.out.println(Arrays.toString(valueReturn(10,5)));
        minOrMaxElement();
    }

    public static void invertArray() {
        int[] numbers = {1, 0, 1, 0, 0, 1, 1, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
            System.out.print(numbers[i]);
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void multiplyArrayNumbers() {
        int[] arrNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] < 6) {
                arrNumbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrNumbers));
    }

    public static void matrixArrayFillDiagonal() {
        int[][] diagonalArray = new int[5][5];
        int lastIndex = diagonalArray.length - 1;
        for (int i = 0; i < diagonalArray.length; i++) {
            int[] row = diagonalArray[i];
            for (int j = 0; j < row.length; j++) {
                if (i == j) {
                    diagonalArray[i][j] = 1;
                }
            }
            diagonalArray[i][lastIndex - i] = 1;
            System.out.println(Arrays.toString(diagonalArray[i]));
        }
    }

    public static int[] valueReturn(int len, int initialValue) {
        int[] massiveNumbers = new int[len];
        for (int i = 0; i < massiveNumbers.length; i++) {
            massiveNumbers[i] = initialValue;
        }
        return massiveNumbers;
    }

    public static void minOrMaxElement() {
        Random rand = new Random();
        int x = rand.nextInt(20);
        int[] minMaxMassive = new int[x];
        int min = minMaxMassive[0];
        int max = minMaxMassive[0];
        for (int i = 0; i < minMaxMassive.length; i++) {
            minMaxMassive[i] = i;
            if (minMaxMassive[i] < min) {
                min = minMaxMassive[i];
            } else if (minMaxMassive[i] > max) {
                max = minMaxMassive[i];
            }
        }
        System.out.println(Arrays.toString(minMaxMassive));
        System.out.println(min);
        System.out.println(max);
    }
}
