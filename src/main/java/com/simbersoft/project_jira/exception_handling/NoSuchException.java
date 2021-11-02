package com.simbersoft.project_jira.exception_handling;

public class NoSuchException extends RuntimeException{

    public NoSuchException(String message) {
        super(message);
    }
}
