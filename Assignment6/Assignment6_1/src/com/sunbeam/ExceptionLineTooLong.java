package com.sunbeam;

public class ExceptionLineTooLong extends Exception {
	private String fieldName;
	private int fieldValue;
	public ExceptionLineTooLong() {
		
	}
	public ExceptionLineTooLong(String fieldName, int fieldValue) {
		super();
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	@Override
	public String toString() {
		return "ExceptionLineTooLong [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]";
	}
	
	
	
	
	

}
