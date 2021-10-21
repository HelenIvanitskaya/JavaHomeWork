package com.pb.ivanitskaya.hw3;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( "Угадайте целое число в диапазоне от 0 до 100");
        System.out.println("Для выхода из программы введите отрицательное число.");
        int MAX_ATTEMPT= 1;
        int attempt= 0;
        Random random= new Random();
        int mynumber=random.nextInt(101);
        int X;

        while (attempt<MAX_ATTEMPT ) {
            attempt++;
            MAX_ATTEMPT++;

            X = in.nextInt();
            if (X<0) {
                break;
            }
            if (X<mynumber){
                System.out.println("Введеное число меньше задуманого");
            }
            if (X>mynumber){
                System.out.println("Введеное число больше задуманого");
            }
            if (X!=mynumber) {
                continue;
            }
            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;

        }

        System.out.println("Конец игры");

    }
}
