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

//> Task :Exercise4_12.main()
//        2*1=2
//        2*2=4
//        2*3=6
//        3*1=3
//        3*2=6
//        3*3=9
//        4*1=4
//        4*2=8
//        4*3=12
//        5*1=5
//        5*2=10
//        5*3=15
//        6*1=6
//        6*2=12
//        6*3=18
//        7*1=7
//        7*2=14
//        7*3=21
//        8*1=8
//        8*2=16
//        8*3=24
//        9*1=9
//        9*2=18
//        9*3=27