package com.pb.ivanitskaya.hm2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X;
        System.out.println("Введите целое число из деапазона 0-100");
        X = in.nextInt();

        if (X<0){
            System.out.println("Введите число от 0 до 100");
        }
        if (X<=14){
            System.out.println( "Диапазон [0 -14]" );
        }
        if (X>=15&&X<=35) {
            System.out.println("Диапазон [15 - 35]");
        }
        if (X>=36&&X<=50) {
            System.out.println("Диапазон 36-50" );
        }
        if (X>=51&&X<=100) {
            System.out.println("Диапазон 51-100");
        }
        if (X>100){
            System.out.println("Ошибка! Число не попадает в один из имеющихся промежутков");
        }

    }
}
