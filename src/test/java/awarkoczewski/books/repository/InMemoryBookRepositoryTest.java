package awarkoczewski.books.repository;

import awarkoczewski.books.model.Book;
import awarkoczewski.books.model.Genre;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class InMemoryBookRepositoryTest {

    BookRepository bookRepository = new InMemoryBookRepository();

    @Test
    public void insertProperlySavesANewBookAtIndex5(){

        //given
        Book bookToSave = new Book(5L, "Flights", "Olga Tokarczuk", Genre.SF,
                LocalDate.of(2011,12,12));
        Long expectedResult = 5L;

        //when
        bookRepository.insert(bookToSave);
        Book result = bookRepository.findBookById(5L);

        //then
        Assert.assertEquals(expectedResult, result.getId());
    }
}