package com.bosch.bookshop.book;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTO toDTO(Book book);

    List<BookDTO> toDtos(List<Book> books);
}
