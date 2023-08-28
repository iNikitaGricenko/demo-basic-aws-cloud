package com.wolfhack.demo.basicaws.service;

import com.wolfhack.demo.basicaws.model.Mail;

public interface DefaultMailSender extends Sender<Mail> {

	@Override
	void send(String subject, Mail message);
}
