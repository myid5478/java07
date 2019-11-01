package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入要1加到多少");
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1 ;i <=a;i++){
            sum +=i;
        }
        System.out.println("總和"+sum);
    }
}