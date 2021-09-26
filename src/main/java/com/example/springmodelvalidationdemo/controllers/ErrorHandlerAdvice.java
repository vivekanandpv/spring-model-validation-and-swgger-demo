package com.example.springmodelvalidationdemo.controllers;

import com.example.springmodelvalidationdemo.utils.AppUtils;
import com.example.springmodelvalidationdemo.viewmodels.ValidationErrorPageViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorPageViewModel> handleValidationException(MethodArgumentNotValidException exception) {
        return ResponseEntity.badRequest().body(AppUtils.getValidationErrorPage(exception));
    }
}
