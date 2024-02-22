package com.example.naturalbeautyspaa.Exception.ApplicationException;

import org.springframework.http.ResponseEntity;

public abstract class ApplicationException extends RuntimeException {

    public abstract ResponseEntity<?> sendResponse();
}
