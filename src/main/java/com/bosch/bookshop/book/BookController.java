package com.bosch.bookshop.book;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public BookResponse<List<BookDTO>> getBooks() {
        List<BookDTO> bookDTOS = bookService.getBooks();
        log.info("Size of books DTO: {}", bookDTOS.size());
        BookResponse<List<BookDTO>> bookResponse = BookResponse.<List<BookDTO>>builder()
                .path("/api/v1/books")
                .statusCode(HttpStatus.OK.value())
                .message("Get books successfully")
                .build();
        bookResponse.getData().put("books", bookDTOS);
        return bookResponse;
    }

}
