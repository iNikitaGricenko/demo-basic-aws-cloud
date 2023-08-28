package com.wolfhack.demo.basicaws.listener;

import com.wolfhack.demo.basicaws.model.Message;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageListenerImpl implements MessageListener {

	@Override
	@SqsListener("${message-listener-default-queue:test-queue}")
	public void receiveMessage(Message message, String senderId) {
		log.info("Received message: {}, having SenderId: {}", message, senderId);
	}

}
