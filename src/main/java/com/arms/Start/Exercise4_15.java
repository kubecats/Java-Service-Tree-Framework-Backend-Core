package com.arms.Start;

public class Exercise4_15 {
    public static void main(String[] args) {

        int number = 43235;
        int tmp = number;

        int result =0; // 변수 number를 거꾸로 변환해서 담을 변수

        while(tmp !=0) {
            result = result*10 + tmp%10;
            tmp/=10;
        }

        if(number == result)
            System.out.println( number + "는 회문수 입니다.");
        else
            System.out.println( number + "는 회문수가 아닙니다.");
    }
}


// [Hint] 나머지 연산자를 이용하시오.
// 12321는 회문수 입니다.