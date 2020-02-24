package it.emix.consumer.constats;

public interface KafkaConstants {

	public final static String KAFKA_BROKER = "PLAINTEXT://:9092"; 
	public final static String KAFKA_TOPIC_NAME = "test";
	public static Integer MAX_POLL_RECORDS=1;
	public static String GROUP_ID_CONFIG="consumerGroup1";
	 public static String OFFSET_RESET_EARLIER="earliest";
}
