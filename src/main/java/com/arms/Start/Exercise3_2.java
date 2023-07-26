package com.arms.Start;

public class Exercise3_2 {
    public static void main(String[] args) {
        int numOfApples = 132;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples/sizeOfBucket;
        if(numOfApples % 10 != 0){
            numOfBucket = numOfBucket+1;
        }

        System.out.println("필요한 바구니의 수 :"+numOfBucket);
    }
}

//> Task :Exercise3_2.main()
//        필요한 바구니의 수 :14