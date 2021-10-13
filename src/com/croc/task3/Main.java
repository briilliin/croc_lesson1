package com.croc.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int[] array1 = new int[] {28, 5, 11, 1, 44, 17, 8};
//        sort(array1);
//
//        int[] array2 = new int[] {6, 28, 1, 17};
//        sort(array2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);


    }


    public static void sort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            int tmp = array[left];
            array[left] = array[minInd];
            array[minInd] = tmp;
        }
        System.out.println(Arrays.toString(array));


    }

}



