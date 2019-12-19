package awarkoczewski.books.repository;

import awarkoczewski.books.model.Book;
import awarkoczewski.books.model.Genre;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class InMemoryBookRepositoryTest {

    BookRepository bookRepository = new InMemoryBookRepository();

    @Test
    public void delete() {

        //given
        Book bookToDelete = new Book(3l, "The Origin of Species",
                "Darwin", Genre.SCIENCE, LocalDate.of(1885,12,12));

        Long expectedResult = 3L;

        //when

    }
}