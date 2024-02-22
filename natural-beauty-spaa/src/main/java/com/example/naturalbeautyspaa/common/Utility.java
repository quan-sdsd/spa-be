package com.example.naturalbeautyspaa.common;

import com.example.naturalbeautyspaa.Exception.ApplicationException.ValidationException;
import org.springframework.validation.BindingResult;

public class Utility {
    public static void validation(BindingResult br) {
        if(br.hasErrors()) {
            throw new ValidationException(br);
        }
    }
}
