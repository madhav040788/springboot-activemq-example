package com.madhavTech.publisher;

import com.madhavTech.model.SystemMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class PublishController {

    @Autowired
    private JmsTemplate jmsTemplate;


    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody SystemMessage message){
        try {
                jmsTemplate.convertAndSend("learnQueue",message);
                return new ResponseEntity<>("Message Sent",HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
