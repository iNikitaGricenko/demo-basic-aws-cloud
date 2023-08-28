package com.wolfhack.demo.basicaws.service.implement;

import com.wolfhack.demo.basicaws.model.Message;
import com.wolfhack.demo.basicaws.service.NotificationSender;
import io.awspring.cloud.messaging.core.NotificationMessagingTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService implements NotificationSender {

	private final NotificationMessagingTemplate messagingTemplate;

	@Value("${notification-topic:default-notification}")
	private String notificationTopic;

	@Override
	public void send(String message, String subject) {
		messagingTemplate.sendNotification(message, subject);
	}

	@Override
	public void send(Message message, String subject) {
		messagingTemplate.sendNotification(notificationTopic, message, subject);
	}

	@Override
	public void send(String topic, Message message, String subject) {
		messagingTemplate.sendNotification(topic, message, subject);
	}

}
