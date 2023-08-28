package com.wolfhack.demo.basicaws.listener;

import com.wolfhack.demo.basicaws.model.Message;
import org.springframework.messaging.handler.annotation.Header;

public interface MessageListener extends DefaultMessageListener<Message> {

	@Override
	void receiveMessage(Message message, @Header("SenderId")  String senderId);

}
