package com.company;
import java.util.Scanner;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        // 1 задача
        //реализуйте задачу, которая принимает строку с консоли и вычленяет все числа и находит их сумму
        Scanner input = new Scanner(System.in);
        String str = input.next();

        int sum = 0;
        str = str.replaceAll("\\D+","");

        String[] arr = str.split("");

        int[] numArr = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
            sum += numArr[i];
        }
        System.out.println(sum);

            }
        }
