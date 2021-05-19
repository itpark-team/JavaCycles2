package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int n = 0;
        int currentMark;
        int sum = 0;
        double avg;
        final int EXIT_CODE = -1;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("input current mark: ");
            currentMark = input.nextInt();

            if (currentMark != EXIT_CODE) {
                sum += currentMark;
                n++;
            }
        }
        while (currentMark != EXIT_CODE);

        avg = sum / (double) n;
        System.out.print("AVG marks = "+avg);
    }
}
