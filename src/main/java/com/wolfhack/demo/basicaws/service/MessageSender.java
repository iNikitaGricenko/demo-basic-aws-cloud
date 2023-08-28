package com.wolfhack.demo.basicaws.service;

import com.wolfhack.demo.basicaws.model.Message;

public interface MessageSender extends Sender<Message> {

	@Override
	void send(String topic, Message message);
}
