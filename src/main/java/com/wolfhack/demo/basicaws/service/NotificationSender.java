package com.wolfhack.demo.basicaws.service;

import com.wolfhack.demo.basicaws.model.Message;

public interface NotificationSender extends Sender<String> {

	@Override
	void send(String topic, String subject);

	void send(Message message, String subject);

	void send(String topic, Message message, String subject);
}
