package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.Producer;

@RestController
@RequestMapping("/api")
public class KafkaController {
	
	@Autowired
	Producer producer;
	@GetMapping("/produce")
	public String producer(@RequestParam("message") String message) {
		producer.send();
		return "this is the message:"+message;
	}
	

}
