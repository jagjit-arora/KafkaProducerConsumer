package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.model.Address;
import com.model.Patient;

@Service
public class Producer {
	@Autowired
	private KafkaTemplate<String, Patient> kafkaTemplate;
	
	String kafkaTopic="demo-json-topic";
	
	public void send() {
		Address a=new Address("Infosys", "Hinjewadi", "Pune", "Maharashtra", "India");
		Patient p=new Patient(11, "John", a, 19928399, "male") ;
		kafkaTemplate.send(kafkaTopic,p);
	}

}
