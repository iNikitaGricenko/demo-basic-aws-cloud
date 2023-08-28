package com.wolfhack.demo.basicaws.service.implement;

import com.wolfhack.demo.basicaws.model.Message;
import com.wolfhack.demo.basicaws.service.MessageSender;
import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessagingService implements MessageSender {

	private final QueueMessagingTemplate messagingTemplate;

	@Override
	public void send(String topic, Message message) {
		messagingTemplate.convertAndSend(topic, message);
	}

}
