package com.wolfhack.demo.basicaws.listener;

import org.springframework.messaging.handler.annotation.Header;

public interface DefaultMessageListener<T> {

	void receiveMessage(T message, @Header("SenderId")  String senderId);

}
