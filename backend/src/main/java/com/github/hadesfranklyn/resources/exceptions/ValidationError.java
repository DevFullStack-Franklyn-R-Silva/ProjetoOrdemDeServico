package com.github.hadesfranklyn.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;

	private List<FieldMessade> errors = new ArrayList<>();

	public ValidationError() {
		super();
	}

	public ValidationError(Long timestemp, Integer status, String error) {
		super(timestemp, status, error);
	}

	public List<FieldMessade> getErrors() {
		return errors;
	}

	public void addErrors(String fieldName, String message) {
		this.errors.add(new FieldMessade(fieldName, message));
	}

}
