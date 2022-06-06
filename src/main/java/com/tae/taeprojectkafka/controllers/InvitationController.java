package com.tae.taeprojectkafka.controllers;

import com.tae.taeprojectkafka.DAO.Formular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class InvitationController {

    @Autowired
    KafkaTemplate<String, Formular> kafkaTemplate;

    private static final Logger logger = Logger.getLogger(InvitationController.class.getName());

    private static final String TOPIC = "conference-invitations";

    @PostMapping("/publish")
    public void publishInvitationMessage(@RequestBody Formular formular){
        kafkaTemplate.send(TOPIC, formular);
        logger.log(Level.INFO, "New invitation received");
    }
}
