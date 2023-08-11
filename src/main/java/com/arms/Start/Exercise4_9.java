package com.arms.Start;

public class Exercise4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i=0; i<str.length(); i++){

            int j = (int) str.charAt(i) - 48;
            sum = sum + j;
        }

        System.out.println("sum:"+sum);
    }
}

//[Hint] String클래스의 charAt(int i)을 사용
// charAt 함수는 문자열에서 index를 통해 특정 위치의 문자를 반환하는 함수
// 매개변수는 int형으로 받고, return 값은 char 형으로 반환
// test