package com.bosch.bookshop.book;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookDTO> getBooks() {
        List<Book> books = bookRepository.findAll();
        log.info("Size of list books: {}", books.size());
        return bookMapper.toDtos(books);
    }
}
