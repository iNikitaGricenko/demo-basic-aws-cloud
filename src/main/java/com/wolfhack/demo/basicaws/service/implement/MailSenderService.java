package com.wolfhack.demo.basicaws.service.implement;

import com.wolfhack.demo.basicaws.model.Mail;
import com.wolfhack.demo.basicaws.service.DefaultMailSender;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MailSenderService implements DefaultMailSender {

	private final MailSender mailSender;

	@Override
	public void send(String subject, Mail message) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(message.getFrom());
		simpleMailMessage.setTo(message.getTo());
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message.getBody());
		this.mailSender.send(simpleMailMessage);
	}
}
