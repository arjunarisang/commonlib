package io.github.arjunarisang.commonlib.exception;

import io.github.arjunarisang.commonlib.util.ResponseUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.google.common.base.CaseFormat.LOWER_CAMEL;
import static com.google.common.base.CaseFormat.LOWER_UNDERSCORE;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", new Date());
        body.put("status", status.value());

        List<String> errors =
                ex.getBindingResult()
                        .getFieldErrors()
                        .stream()
                        .map(x -> LOWER_CAMEL.to(LOWER_UNDERSCORE, x.getField()) + " " + x.getDefaultMessage())
                        .collect(Collectors.toList());

        body.put("errors", errors);

        return new ResponseEntity<>(body, headers, status);
    }

    @Override
    protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", new Date());
        body.put("status", status.value());

        return new ResponseEntity<>(body, headers, status);
    }

    @ExceptionHandler(value = {EntityNotFoundException.class, javax.persistence.EntityNotFoundException.class})
    public ResponseEntity<Object> handleNotFoundException(RuntimeException ex, WebRequest request) {
        ErrorDetails errorDetails =
                ErrorDetails
                        .builder()
                        .timestamp(new Date())
                        .message(ResponseUtils.invokeAntiXss(ex.getMessage()))
                        .details(ResponseUtils.invokeAntiXss(request.getDescription(false)))
                        .build();

        return handleExceptionInternal(ex, errorDetails, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(value = {BadRequestException.class})
    public ResponseEntity<Object> handleBadRequestException(RuntimeException ex, WebRequest request) {
        ErrorDetails errorDetails =
                ErrorDetails
                        .builder()
                        .timestamp(new Date())
                        .message(ResponseUtils.invokeAntiXss(ex.getMessage()))
                        .details(ResponseUtils.invokeAntiXss(request.getDescription(false)))
                        .build();

        return handleExceptionInternal(ex, errorDetails, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = {InternalServerErrorException.class})
    public ResponseEntity<Object> handleInternalServerErrorException(RuntimeException ex, WebRequest request) {
        ErrorDetails errorDetails =
                ErrorDetails
                        .builder()
                        .timestamp(new Date())
                        .message(ResponseUtils.invokeAntiXss(ex.getMessage()))
                        .details(ResponseUtils.invokeAntiXss(request.getDescription(false)))
                        .build();

        return handleExceptionInternal(ex, errorDetails, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @ExceptionHandler(value = {UnauthorizedException.class})
    public ResponseEntity<Object> handleUnauthorizedException(RuntimeException ex, WebRequest request) {
        ErrorDetails errorDetails =
                ErrorDetails
                        .builder()
                        .timestamp(new Date())
                        .message(ResponseUtils.invokeAntiXss(ex.getMessage()))
                        .details(ResponseUtils.invokeAntiXss(request.getDescription(false)))
                        .build();

        return handleExceptionInternal(ex, errorDetails, new HttpHeaders(), HttpStatus.UNAUTHORIZED, request);
    }

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<Object> handleGenericException(RuntimeException ex, WebRequest request) {
        ErrorDetails errorDetails =
                ErrorDetails
                        .builder()
                        .timestamp(new Date())
                        .message(ResponseUtils.invokeAntiXss(ex.getMessage().replace("HSEARCH", "")))
                        .details(ResponseUtils.invokeAntiXss(request.getDescription(false)))
                        .build();

        return handleExceptionInternal(ex, errorDetails, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
