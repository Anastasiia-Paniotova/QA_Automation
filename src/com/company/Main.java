package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Integer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        // 1 задача
        //реализуйте задачу, которая принимает строку с консоли и вычленяет все числа и находит их сумму
//        Scanner input = new Scanner(System.in);
//        String str = input.next();
//
//        int sum = 0;
//        str = str.replaceAll("\\D+","");
//
//        String[] arr = str.split("");
//
//        int[] numArr = new int [arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            numArr[i] = Integer.parseInt(arr[i]);
//            sum += numArr[i];
//        }
//        System.out.println(sum);

// -----------------------------------------------------
// 2 задача
// реализуйте задачу, которая принимает строку с консоли и вычленяет все символы латиницы/кириллицы и сортирует их,
// указывая количество вхождений каждого символа

        Scanner input = new Scanner(System.in);
        String inputtedString = input.next();
        String newString = "";
        int count = 0;

        Matcher matcher = Pattern.compile("[a-zA-Zа-яА-Я]").matcher(inputtedString);
        while (matcher.find()) {
            newString += matcher.group();
        }

        String[] arr = newString.split("");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i].equals(arr[i - 1])) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    count++;
                }
            }
            System.out.println(arr[i] + " = " + count);
            count = 0;
        }
            }
        }
// -----------------------------------------------------
// 3 задача
// В некоторой школе занятия начинаются в 9:00. Продолжительность урока — 45 минут, после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут,
// а после 2-го, 4-го, 6-го и т.д. — 15 минут. Определите, когда заканчивается указанный урок. Данные вводятся с консоли
//
//Входные данные: Дан номер урока (число от 1 до 10).
//Выходные данные: Выведите два целых числа: время окончания урока в часах и минутах.
//
//При решении этой задачи нельзя пользоваться циклами и условными инструкциями!!!!!

