package com.arms.Start;

public class Exercise5_4 {
    public static void main(String[] args) {

        {
            int[][] arr = {
                    {5, 5, 5, 5, 5},
                    {10, 10, 10, 10, 10},
                    {20, 20, 20, 20, 20},
                    {30, 30, 30, 30, 30}
            };
            int total = 0;
            float average = 0;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    total += arr[i][j];
                }
            }
//            average = total/20;

            System.out.println("total=" + total);
//            System.out.println("average=" + average);
        }
    }
}

// error
//    total=325
//    average=16.25