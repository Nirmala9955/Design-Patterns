package com.sahu.exception;

public class InvalidStockNameException extends RuntimeException {
	public InvalidStockNameException(String msg) {
		super(msg);
	}
}
