package com.madhavTech.consumer;

import com.madhavTech.model.SystemMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = "learnQueue")
    public void listenMessage(SystemMessage message){
        logger.info("Listing Message from Consumer {}",message);
    }
}
