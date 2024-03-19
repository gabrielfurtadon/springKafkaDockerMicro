package com.eportal.api.message;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Component;

import com.eportal.api.dto.CarPostDTO;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;

@Component
@Configuration
public class KafkaProducerConfiguration {

	@Value("${spring.kafka.bootstrap-servers}") //URL DO SERVIDOR DO CLUSTER KAFKA
	private String bootstrapServer;
	
	//VAI PRODUZIR MSG <String, CarPostDTO> QUE VAI TRAFEGAR INFO SOBRE CARROS
	@Bean
	public ProducerFactory<String, CarPostDTO> userProducerFactory(){
		
		Map<String, Object> configProps = new HashMap<>();
		
		//JOGANDO NO MAP AS INFOS DO CONFIG DO KAFKA
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer); //SERVER
		configProps.put(JsonSerializer.ADD_TYPE_INFO_HEADERS, false); //Não vai mandar json como header
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()); //serializar via string
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName()); //serializar corpo como json
		
		return new DefaultKafkaProducerFactory<>(configProps);
	}
	
	//utilizar esse template nas controllers
	@Bean
	public KafkaTemplate<String, CarPostDTO> userKafkaTemplate() {
		return new KafkaTemplate<>(userProducerFactory());
	}
	
}
