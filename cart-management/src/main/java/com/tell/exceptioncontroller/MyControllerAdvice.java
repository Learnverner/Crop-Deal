package com.tell.exceptioncontroller;


import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tell.exceptions.CartNotFoundException;
import com.tell.exceptions.EmptyInputExceptions;

@ControllerAdvice
public class MyControllerAdvice {
@ExceptionHandler(EmptyInputExceptions.class)
public ResponseEntity<String> handelEmptyInput(EmptyInputExceptions emptyInputExceptions){
return new ResponseEntity<String>("Input Filed is Empty", null, HttpStatus.SC_BAD_REQUEST);
}

@ExceptionHandler(CartNotFoundException.class)
public ResponseEntity<String> handelNoSuchElement(CartNotFoundException cartNotFoundException){
return new ResponseEntity<String>("No Data is Present in DB", null, HttpStatus.SC_BAD_REQUEST);
}
}
