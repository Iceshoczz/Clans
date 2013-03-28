package com.lirtistasya.util;

public class NotificationCause<T> {
	private String	message	= null;
	private String	name	= null;
	private T		source	= null;

	public NotificationCause(String name, T source, String message) {
		this.name = name;
		this.source = source;
		this.message = message;
	}

	public final String getMessage() {
		return message;
	}

	public final String getName() {
		return name;
	}

	public final T getSource() {
		return source;
	}
}
