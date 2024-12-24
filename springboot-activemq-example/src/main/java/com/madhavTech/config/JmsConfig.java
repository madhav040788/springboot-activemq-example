package com.madhavTech.config;

import jakarta.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@EnableJms
public class JmsConfig {

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrency("5-10");
        return factory;
    }

//    @Bean
//    public ActiveMQConnectionFactory connectionFactory() {
//        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
//        factory.setBrokerURL("tcp://localhost:61616");
//        factory.setUserName("admin");
//        factory.setPassword("admin");
//        return factory;
//    }
//
//    @Bean
//    public JmsTemplate jmsTemplate(ActiveMQConnectionFactory connectionFactory) {
//        return new JmsTemplate(connectionFactory);
//    }
}
