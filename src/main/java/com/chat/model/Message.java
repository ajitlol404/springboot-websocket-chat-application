package com.chat.model;

public class Message {

	private String name;// Who is sending message
	private String content;// message content

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Message(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

	public Message() {
	}

	@Override
	public String toString() {
		return "Message [name=" + name + ", content=" + content + "]";
	}

}
