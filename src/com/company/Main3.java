package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int n;
        int i = 0;
        int currentMark;
        int sum = 0;
        double avg;

        Scanner input = new Scanner(System.in);

        System.out.print("n: ");
        n = input.nextInt();

        while (i < n) {
            System.out.print("input current mark: ");
            currentMark = input.nextInt();

            sum += currentMark;

            i++;
        }

        avg = sum / (double) n;
        System.out.print("AVG marks = "+avg);
    }
}
