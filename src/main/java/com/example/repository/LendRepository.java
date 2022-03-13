package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restapi.model.Book;
import com.example.restapi.model.Lend;
import com.example.restapi.model.LendStatus;

import java.util.Optional;


public interface LendRepository extends JpaRepository<Lend, Long>{
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
