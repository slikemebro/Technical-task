package com.ua.hlibkorobov.technical_task.controler;

import com.ua.hlibkorobov.technical_task.exception.InvalidSymbolException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@Log4j2
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> handleInvalidSymbolException(InvalidSymbolException e) {
        log.warn(e.getMessage());
        return ResponseEntity.badRequest().body(e.getMessage());
    }
    @ExceptionHandler
    public ResponseEntity<?> handleHttpClientErrorException(HttpClientErrorException e) {
        log.warn(e.getMessage());
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
