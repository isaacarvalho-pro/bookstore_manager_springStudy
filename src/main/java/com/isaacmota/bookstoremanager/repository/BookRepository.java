package com.isaacmota.bookstoremanager.repository;

import com.isaacmota.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{

}
