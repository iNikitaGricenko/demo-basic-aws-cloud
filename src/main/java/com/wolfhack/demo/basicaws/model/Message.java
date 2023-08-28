package com.wolfhack.demo.basicaws.model;

import java.time.Instant;

public interface Message {

	String getMessageId();
	Object getBody();
	Instant getDate();

}
