package com.belajar.crudwithjwt.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
//@Slf4j
public class BaseErrorHandles {

//    @ResponseBody
//    @ExceptionHandler(value = ValidationException.class)
//    public ResponseEntity<?> handleException(ValidationException exception) {
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMsg());
//    }

    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ValidationResponse handleValidationException(ValidationException ve) {
        ValidationResponse response = new ValidationResponse(ve.getMsg(), ve.getStatus(), ve.getDataList());
        return response;
    }

}
