package com.bosch.bookshop.book;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse<T> {
    private String path;
    private Integer statusCode;
    private String message;
    @Builder.Default
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, T> data = new HashMap<>();
}
