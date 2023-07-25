package com.arms.Start;

import com.arms.jiraconnectinfo.service.JiraConnectInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//spring이 생성자를 호출
@Component
//class 는 type 이다.
public class Start {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

//    생성자만 첫 글자가 대문자임
    public Start(){
        logger.info("------------------------------------------------");
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A' 65 의 문자코드는
        System.out.println(1 + x << 33);
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x+=2);
        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }

}

