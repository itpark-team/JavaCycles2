package com.company;

public class Main2 {
    public static void main(String[] args) {
        double startMoney = 1000;
        double finishMoney = 10000;

        double percent = 5;
        int years = 0;
        double money = startMoney;

        while (money < finishMoney) {
            money = money + money * percent / 100;

            years++;

            System.out.println("result: money = " + money + " years = " + years);
        }


    }
}
