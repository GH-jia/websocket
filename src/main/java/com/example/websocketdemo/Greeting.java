package com.example.websocketdemo;

import org.springframework.util.StringUtils;

public class Greeting {
    private String content;

    public Greeting(){}

    public Greeting(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}
