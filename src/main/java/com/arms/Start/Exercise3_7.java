package com.arms.Start;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit =100;

        float celcius = (float)5/9 * (fahrenheit - 32);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.printf("Celcius: %.3f" , celcius);
        System.out.println();
        System.out.printf("Celcius:"+celcius);
    }
}

//> Task :Exercise3_7.main()
//        Fahrenheit:100
//        Celcius: 37.778
//        Celcius:37.77778
// 다른 방법이 있는지 확인