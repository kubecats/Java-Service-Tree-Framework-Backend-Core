package com.arms.Start;

public class Exercise4_6 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    count++;
                    System.out.println("주사위1: " + i + ", 주사위2: " + j);
                }
            }
        }

        System.out.println("총 경우의 수: " + count);
    }
}
