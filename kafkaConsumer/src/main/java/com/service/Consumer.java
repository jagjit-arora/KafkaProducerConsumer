package com.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.model.Patient;
@Service
public class Consumer {
	
	@KafkaListener(topics = "demo-json-topic", groupId = "demo_group")
    public void consume(Patient patient) throws IOException {
        System.out.println(patient.toString());
    }
}
