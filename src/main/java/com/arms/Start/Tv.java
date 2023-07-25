package com.arms.Start;

public class Tv {

    String color;
    boolean power;
    int channel;

    public void power(){
        power = !power;
    }

    public void channelUp(){
        ++channel;
    }
    public void setChannelDown(){
        --channel;
    }
}

class TvTest {
    public static void main(String[] args){
        Tv t = new Tv();
        t.channel = 8;
        t.setChannelDown();

        System.out.println("현재 채널은 "+ t.channel + "입니다.");
    }
}
