package com.pramod.basics.rest.demostepbystep;

import java.util.List;

import com.pramod.basics.rest.demostepbystep.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class BooksController {

@GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(
                new Book(1l, "This Book was done 3 days ago", "Pramod The Great...Isnt this great" ));
    }

}



