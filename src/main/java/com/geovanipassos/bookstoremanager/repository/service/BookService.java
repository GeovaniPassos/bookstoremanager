package com.geovanipassos.bookstoremanager.repository.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.geovanipassos.bookstoremanager.dto.MessageResponseDTO;
import com.geovanipassos.bookstoremanager.entity.Book;
import com.geovanipassos.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Book created with ID: " + savedBook.getId()).build();
    }

}
