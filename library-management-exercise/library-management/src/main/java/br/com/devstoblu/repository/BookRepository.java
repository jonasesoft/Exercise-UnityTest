package br.com.devstoblu.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.devstoblu.models.Book;

public interface BookRepository extends JpaRepository<Book, UUID> {
	
	Optional<Book> findBookById(UUID id);
}
