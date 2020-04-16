package com.example.model;

import java.util.List;

public class APIResponse {

	private String statusCode;
	private String statusMessage;
	private List<Products> objects;
	private Products object;
	private long userId;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public List<Products> getObjects() {
		return objects;
	}

	public void setObjects(List<Products> list) {
		this.objects = list;
	}

	public Products getObject() {
		return object;
	}

	public void setObject(Products object) {
		this.object = object;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	
}
