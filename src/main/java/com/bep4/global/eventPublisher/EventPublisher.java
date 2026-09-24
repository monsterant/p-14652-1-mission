package com.bep4.global.eventPublisher;

import com.bep4.standard.event.HasEventName;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventPublisher {
    private final KafkaTemplate<String, HasEventName> kafkaTemplate;

    public void publish(HasEventName event) {
        System.out.println("Kafka publish 호출: " + event.getEventName());
        kafkaTemplate.send(event.getEventName(), event);
    }
}