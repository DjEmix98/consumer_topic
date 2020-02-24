package it.emix.consumer.adapter;



import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.kafka.inbound.KafkaMessageDrivenChannelAdapter;
import org.springframework.integration.kafka.inbound.KafkaMessageDrivenChannelAdapter.ListenerMode;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;

import it.emix.consumer.constats.KafkaConstants;

public class ChannelAdapterKafkaWithJava {
//	@Bean
//	public KafkaMessageDrivenChannelAdapter<String, String>
//	            adapter(KafkaMessageListenerContainer<String, String> container) {
//	    KafkaMessageDrivenChannelAdapter<String, String> kafkaMessageDrivenChannelAdapter =
//	            new KafkaMessageDrivenChannelAdapter<>(container, ListenerMode.record);
//	 //   kafkaMessageDrivenChannelAdapter.setOutputChannel(received());
//	    return kafkaMessageDrivenChannelAdapter;
//	}
//
//	@Bean
//	public KafkaMessageListenerContainer<String, String> container() throws Exception {
//	    ContainerProperties properties = new ContainerProperties(KafkaConstants.KAFKA_TOPIC_NAME);
//	    // set more properties
//	    return new KafkaMessageListenerContainer<>(consumerFactory(), properties);
//	}
//
//	@Bean
//	public ConsumerFactory<String, String> consumerFactory() {
//	    Map<String, Object> props = new HashMap<>();
//	    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.KAFKA_BROKER);
//	    // set more properties
//	    return new DefaultKafkaConsumerFactory<>(props);
//	}
}
