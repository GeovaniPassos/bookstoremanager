package com.geovanipassos.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geovanipassos.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
