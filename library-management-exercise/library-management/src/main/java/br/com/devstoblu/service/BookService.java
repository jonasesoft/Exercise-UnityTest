package br.com.devstoblu.service;

import java.util.List;
import java.util.UUID;

import br.com.devstoblu.dto.BookDto;
import br.com.devstoblu.models.Book;

public interface BookService {

	BookDto insertBook(BookDto bookDto);
	List<BookDto> getBooks();
	List<BookDto> getBooksSameAuthorAndName(List<Book> books, String name, String author);
	List<BookDto> getBooksSameName(List<Book> books, String name);
	List<BookDto> getBooksSameAuthor(List<Book> books, String author);
	BookDto getBookById(UUID id);
	BookDto updateBook(BookDto newbookDto, UUID id);
	void deletBook(UUID id);
}
