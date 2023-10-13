package com.app.geometry;

import java.util.Arrays;

public class ExceptionNegativeDiameter extends Exception {
	private String fildName;
	private int fieldValue;
	public ExceptionNegativeDiameter() {
		
	}

	public ExceptionNegativeDiameter( String fildName, int fieldValue,String message) {
		super(message);
		this.fildName = fildName;
		this.fieldValue = fieldValue;
	}

	@Override
	public String toString() {
		return "ExceptionNegativeDiameter [fildName=" + fildName + ", fieldValue=" + fieldValue + "]"+super.getMessage();
	}


	

}
