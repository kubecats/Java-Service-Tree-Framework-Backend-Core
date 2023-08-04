package com.arms.Start;

public class Exercise3_10 {
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = (ch >64) ? (char)(ch+32) : ch; //(char)는 타입 변환임

        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);

    }
}

//> Task :Exercise3_10.main()
//        ch:A
//        ch to lowerCase:a