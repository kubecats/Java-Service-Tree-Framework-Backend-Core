package com.arms.Start;

public class Exercise4_12 {
    public static void main(String[] args) {
        // Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
        int result;
        for (int i=2 ; i<10 ; i++ ) {
            for(int j=1 ; j<4 ; j++){
                result = i * j;
                System.out.println(i+"*"+j+"="+result);
            }
        }
    }
}

// 2*1=2
// 2*2=4
// 2*3=6