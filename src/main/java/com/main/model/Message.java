package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	@Column(name = "messagecode")
	private String messagecode;
	@Column(name = "description")
	private String description;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String messagecode, String description) {
		super();
		this.messagecode = messagecode;
		this.description = description;
	}

	public String getMessagecode() {
		return messagecode;
	}

	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Message [messagecode=" + messagecode + ", description=" + description + "]";
	}

}