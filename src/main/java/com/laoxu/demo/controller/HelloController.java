package com.laoxu.demo.controller;

import com.laoxu.demo.enumeration.MessageTypeEnumeration;
import com.laoxu.demo.service.SendMessageThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    private SendMessageThreadService sendMessageThreadService;

    @GetMapping("/test")
    public String test(){

        sendMessageThreadService.sendMsgBySendType(MessageTypeEnumeration.MessageType.type286.sendId);

        return "success";
    }
}
