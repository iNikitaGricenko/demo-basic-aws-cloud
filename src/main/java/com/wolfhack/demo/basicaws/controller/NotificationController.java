package com.wolfhack.demo.basicaws.controller;

import com.wolfhack.demo.basicaws.model.Message;
import io.awspring.cloud.messaging.config.annotation.NotificationMessage;
import io.awspring.cloud.messaging.config.annotation.NotificationSubject;
import io.awspring.cloud.messaging.endpoint.NotificationStatus;
import io.awspring.cloud.messaging.endpoint.annotation.NotificationMessageMapping;
import io.awspring.cloud.messaging.endpoint.annotation.NotificationSubscriptionMapping;
import io.awspring.cloud.messaging.endpoint.annotation.NotificationUnsubscribeConfirmationMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/topic-subscriber")
public class NotificationController {

	@NotificationMessageMapping
	public void receiveNotification(@NotificationMessage String message, @NotificationSubject String subject) {
		log.info("Received message: {}, having subject: {}", message, subject);
		// TODO: process message
	}

	@NotificationMessageMapping
	public void receiveNotification(@NotificationMessage Message message, @NotificationSubject String subject) {
		log.info("Received message: {}, having subject: {}", message, subject);
		// TODO: process message
	}

	@NotificationSubscriptionMapping
	public void confirmSubscriptionMessage(NotificationStatus notificationStatus) {
		log.info("Subscribed from Topic");
		notificationStatus.confirmSubscription();
	}

	@NotificationUnsubscribeConfirmationMapping
	public void confirmUnsubscriptionMessage(NotificationStatus notificationStatus) {
		log.info("Unsubscribed from Topic");
		notificationStatus.confirmSubscription();
	}

}
