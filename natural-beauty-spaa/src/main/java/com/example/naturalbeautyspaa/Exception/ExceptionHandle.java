package com.example.naturalbeautyspaa.Exception;

import com.example.naturalbeautyspaa.Exception.ApplicationException.ApplicationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<?> sendExceptionRes(ApplicationException ex) {
        return ex.sendResponse();
    }
}
