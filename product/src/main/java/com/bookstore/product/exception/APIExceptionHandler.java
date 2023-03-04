package com.bookstore.product.exception;

import com.bookstore.product.utils.Constants;
import com.bookstore.product.viewmodel.ErrorVm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.webjars.NotFoundException;

@ControllerAdvice
@Slf4j
public class APIExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorVm> handleNotFoundException (NotFoundException ex, HttpRequest req){
        String message = ex.getMessage();
        ErrorVm errorVm = new ErrorVm(HttpStatus.NOT_FOUND.toString(), message);
        log.error(Constants.ERROR_LOG_FORMAT, req.getURI(), 404, message);
        log.debug(ex.getMessage());
        return new ResponseEntity<>(errorVm, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorVm> handleMethodArgumentNotValidException (MethodArgumentNotValidException ex, HttpRequest req) {
        String message = ex.getMessage();
        ErrorVm errorVm = new ErrorVm(HttpStatus.BAD_REQUEST.toString(), message);
        log.error(Constants.ERROR_LOG_FORMAT, req.getURI(), 400, message);
        log.debug(ex.getMessage());
        return new ResponseEntity<>(errorVm, HttpStatus.BAD_REQUEST);
    }
}
