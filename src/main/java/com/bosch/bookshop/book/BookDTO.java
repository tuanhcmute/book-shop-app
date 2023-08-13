package com.bosch.bookshop.book;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {
    private String bookCode;
    private String bookName;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
