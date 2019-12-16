package com.example.websocketdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

@Controller

public class GreetingController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        System.out.println(message.getName());

        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
    @RequestMapping(value = "/puttest")
    public void put(){
        Greeting greeting = new Greeting("Hello, hj" );
        simpMessagingTemplate.convertAndSend("/topic/greetings",greeting);
    }
}
