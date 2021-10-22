package com.pb.ivanitskaya.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        int x = array.length;
        System.out.println("Введите одномерный массив целых чисел размерностью 10 элементов");
        int i=0;
        int sum = 0;
        for (i=0;i<array.length;i++) {
            System.out.println("Arreys:");
            array[i] = in.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);

        int count = 0;
        for(i = 0; i<array.length; i++) {
            if (array[i] > 0)
                count++;
        }
        System.out.println("Количество положительных элементов массива = "+count);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    }



