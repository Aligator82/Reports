package com.level;

import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println ((a+b)%2==0 ? "Четное = " +(a+b) : "Нечетное = " +(a+b));



    }
}
