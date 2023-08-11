package com.arms.Start;

public class Exercise4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        for(int i=0; i<5; i++){

            int j = num % 10;
            sum = sum + j;
            num = num / 10;
        }

        System.out.println("sum:"+sum);
    }
}

// [주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
//> Task :Exercise4_10.main()
//        sum:15