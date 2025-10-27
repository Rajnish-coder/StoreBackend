package com.zee.store.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ErrorResponseDto {

    private final String apiPath;
    private final HttpStatus errorCode;
    private final String errorMessage;
    private final LocalDateTime errorTime;

}
