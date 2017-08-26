package com.home;

import java.util.Scanner;

public class Home {

    public static void main(String[] args) {
        int sc = 24;
        switch (sc) {
            case 1:
                System.out.println("Все под контролем ");
                break;
            case 2:
                System.out.println("Теряю контроль ");
                break;

            case 3:
                System.out.println("Контроль утерян ");
                break;

            case 4:
                System.out.println("Привет Вертолеты ");
                break;
            default:
                System.out.println("Рыба, Все Хорошо прошло");
                break;


        }
    }
}
