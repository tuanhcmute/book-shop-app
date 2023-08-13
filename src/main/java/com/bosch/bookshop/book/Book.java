package com.bosch.bookshop.book;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "book_tbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @Column(name = "id_column", updatable = false)
    private String id;

    @Column(name = "book_code_column", unique = true, nullable = false)
    private String bookCode;

    @Column(name = "book_name_column", unique = true, nullable = false)
    private String bookName;

    @Column(name = "created_date_column", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "last_modified_date", nullable = false)
    private LocalDateTime lastModifiedDate;
}
