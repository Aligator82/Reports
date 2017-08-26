package com.home;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner homework = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.print("Введите целое двузначное число = ");
        num = homework.nextInt();
        sum += num / 10;
        sum += num % 10;
        System.out.println("Сумма цифр равна= "+sum);
    }


}
