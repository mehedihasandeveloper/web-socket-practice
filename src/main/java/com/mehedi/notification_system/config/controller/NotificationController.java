package com.mehedi.notification_system.config.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @MessageMapping("/send-message")
    @SendTo("/topic/notification")
    public String sendMessage(String message){
        System.out.println("message : " + message);
        return message;
    }
}
