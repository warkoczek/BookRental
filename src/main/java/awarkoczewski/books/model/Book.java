package awarkoczewski.books.model;

import awarkoczewski.blockbusters.model.Blockbuster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {

    private Long id;
    private String title;
    private String author;
    private Genre genre;
    private LocalDate releaseDate;



    public Book(Long id, String title){
        this.id=id;
        this.title=title;
    }



}
