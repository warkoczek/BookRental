package awarkoczewski.books.repository;

import awarkoczewski.books.model.Book;
import awarkoczewski.books.model.Genre;

import java.util.List;

public interface BookRepository {

    Book insert(Book book);

    void delete(Book book);

    Book update(Book book);

    Book findBookById(Long id);

    Book findBookByTitle(String title);

    List<Book> findBooksByGenre(Genre genre);

}
