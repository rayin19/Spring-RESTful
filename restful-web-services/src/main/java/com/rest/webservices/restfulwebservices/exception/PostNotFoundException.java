package com.rest.webservices.restfulwebservices.exception;

public class PostNotFoundException extends RuntimeException{
    public PostNotFoundException(String message) {
        super(message);
    }
}
