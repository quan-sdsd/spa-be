package com.example.naturalbeautyspaa.Exception.ApplicationException;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class ValidationException extends ApplicationException {

    private static final int HTTP_STATUS = 400;
    private final BindingResult br;

    @Override
    public ResponseEntity<?> sendResponse() {
        List<FieldError> fieldErrors = this.br.getFieldErrors();
        Map<String, String> resData = new HashMap<>();
        for(FieldError err : fieldErrors) {
            resData.put(err.getField(), err.getDefaultMessage());
        }
        return ResponseEntity.status(this.HTTP_STAiTUS).body(resData);
    }
}
