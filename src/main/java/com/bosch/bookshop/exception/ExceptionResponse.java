package com.bosch.bookshop.exception;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExceptionResponse {
    private String path;
    private Integer statusCode;
    private String message;
}