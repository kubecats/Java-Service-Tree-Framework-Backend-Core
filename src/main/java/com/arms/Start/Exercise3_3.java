package com.arms.Start;

public class Exercise3_3 {
    public static void main(String[] args) {
        int num =10;
        String Result;

//                Result = num > 0 ? "양수" : "음수";
        Result = num == 0 ? "0" : (num > 0 ? "양수" : "음수");
        System.out.println(Result);

    }
}

