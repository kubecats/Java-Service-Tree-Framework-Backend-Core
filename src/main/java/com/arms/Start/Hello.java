package com.arms.Start;

import com.arms.jiraconnectinfo.service.JiraConnectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hello {


//    @Autowired
    @Qualifier("jiraConnectInfo")
    private JiraConnectInfo jiraConnectInfo;
//public Hello(){
//    Start start = new Start();
//    start.test();
//
//    start.
//    }
//
}
