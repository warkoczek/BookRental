package awarkoczewski;


import awarkoczewski.books.BooksFacade;

import awarkoczewski.books.model.Book;
import awarkoczewski.books.repository.InMemoryBookRepository;

public class App
{
    public static void main( String[] args ) {
        BooksFacade booksFacade = new BooksFacade(new InMemoryBookRepository());

        Book book = booksFacade.getBookByTitle("Flights");

        System.out.println(book.toString());
    }
}
