package com.arms.Start;

public class Exercise3_8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;

        char ch ='A';
        ch = (char) (ch +2);

        long l = 3000L * 3000 * 3000; //L을 붙여서 overflow를 방지
ㅊ
        float f = (float)3/2;

        float f2 = 0.2f;
        double d = 0.1;
        float epsilon = 0.000001f; // 허용 오차 범위 설정

        boolean result = Math.abs(d - f2) < epsilon;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("f2="+f2);
        System.out.println("result="+result);

    }
}

//> Task :Exercise3_8.main()
//        c=30
//        ch=C
//        f=1.5
//        l=27000000000
//        f2=0.2
//        result=false -> true 나와야 함..다시 보기