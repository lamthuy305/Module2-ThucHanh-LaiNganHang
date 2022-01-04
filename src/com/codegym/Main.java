package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gốc: ");
        double money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        int month = scanner.nextInt();
        System.out.println("Nhập lãi suất tháng(%): ");
        double laiSuat = scanner.nextDouble();
        double lai = 0;
//        lai = (money * month * laiSuat) / 100;
        for (int i = 0; i < month; i++) {
            lai += money * laiSuat/100;
        }
        System.out.println("Tổng tiền lãi là: " + lai);
    }
}
