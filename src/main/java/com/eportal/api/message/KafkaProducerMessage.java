package com.eportal.api.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.eportal.api.dto.CarPostDTO;

@Component
public class KafkaProducerMessage {

	 @Autowired
	 private KafkaTemplate<String, CarPostDTO> kafkaTemplate; //envio de msg para dentro dos tópicos
	 
	 private final String KAFKA_TOPIC = "car-post-topic";
	 
	 //Metodo que vai enviar a msg pra dentro do topico do kafka
	 public void sendMessage(CarPostDTO carPostDTO) {
		 kafkaTemplate.send(KAFKA_TOPIC, carPostDTO);
	 }
	
}
