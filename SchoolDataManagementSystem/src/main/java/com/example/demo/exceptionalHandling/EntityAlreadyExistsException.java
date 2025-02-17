package com.example.demo.exceptionalHandling;

public class EntityAlreadyExistsException extends RuntimeException {

	public EntityAlreadyExistsException(String msg) {
		super(msg);
	}
}
