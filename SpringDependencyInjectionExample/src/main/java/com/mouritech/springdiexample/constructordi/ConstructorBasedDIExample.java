package com.mouritech.springdiexample.constructordi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.MessageService;

@Component
public class ConstructorBasedDIExample {
	private MessageService msgService;

	@Autowired
	public ConstructorBasedDIExample(@Qualifier("wService") MessageService mService) {
		super();
		this.msgService = mService;
	}
	public MessageService getMsgService() {
		return msgService;
	}
	
	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}
	
	public void sendMsg(String message) {
		msgService.sendMsg(message);
	}
	
}
