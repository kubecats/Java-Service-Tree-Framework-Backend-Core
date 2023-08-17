package com.arms.Start;

public class Exercise5_3 {
    public static void main(String[] args) {

         int[] arr = {10, 20, 30, 40, 50};
         int sum=0;

         for(int i=0; i<5; i++){
             sum = sum + arr[i];
         }
        System.out.println("sum="+sum);
    }
}

//> Task :Exercise5_3.main()
//        sum=150