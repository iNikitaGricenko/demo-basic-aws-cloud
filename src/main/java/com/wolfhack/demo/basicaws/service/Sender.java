package com.wolfhack.demo.basicaws.service;

public interface Sender<T> {

	void send(String topic, T message);

}
