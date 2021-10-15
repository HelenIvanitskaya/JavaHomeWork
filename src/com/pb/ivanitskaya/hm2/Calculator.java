package com.pb.ivanitskaya.hm2;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("Введите первое целое число");
        operand1 = in.nextInt();
        System.out.println("Введите второе целое число");
        operand2 = in.nextInt();
        System.out.println("Введите знак арифметической операции");
        sign = in.next();
        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "/":
                     if (operand2==0) {
                         System.out.println("Деление на ноль невозможно, введите другое число");
                     } else {
                         System.out.println(operand1 / operand2);
                     }
            break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            default:
                System.out.println("Неверный знак арифметической операции, попробуйте снова(+,-,*,/)");
        }


    }
}