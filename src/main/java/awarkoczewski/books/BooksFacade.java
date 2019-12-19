package awarkoczewski.books;

import awarkoczewski.books.model.Book;
import awarkoczewski.books.model.Genre;
import awarkoczewski.books.repository.BookRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BooksFacade {

    private BookRepository bookRepository;

    public Book save(Book book){

        return bookRepository.insert(book);
    }

    public Book getBookByTitle(String title){

        return bookRepository.findBookByTitle(title);
    }

    public List<Book> showBooksByGenre(Genre genre){

        return bookRepository.findBooksByGenre(genre);
    }
}
