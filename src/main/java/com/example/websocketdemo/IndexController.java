package com.example.websocketdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class IndexController {
    @GetMapping(value = "/index")
    public String index(){
        return "index.html";
    }

    @Autowired
    GreetingController greetingController;
    @RequestMapping(value = "/put")
    @ResponseBody
    public String put() throws Exception {
        HelloMessage helloMessage = new HelloMessage("HJ");
        greetingController.greeting(helloMessage);
        return "OK";
    }
}
