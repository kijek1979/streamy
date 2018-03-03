package com.sda.streams.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> bookList = new ArrayList<>();
//    public Optional<Book> findBook(String title){
//        // petla ktora wyszukuje
//
//
//        for (Book b : bookList) {
//            if(b.getTitle().equalsIgnoreCase(title)){
////                Optional<Book> optionalBook = Optional.ofNullable(b);
////                return optionalBook;
//                return Optional.of(b);
//            }
//        }
//
//        return Optional.empty();
//    }
    public Optional<Book> findBook(String title){
        // petla ktora wyszukuje
        Book foundBook = null;

        for (Book b : bookList) {
            if(b.getTitle().equalsIgnoreCase(title)){
//                Optional<Book> optionalBook = Optional.ofNullable(b);
//                return optionalBook;
                foundBook = b;
                break;
            }
        }

        return Optional.ofNullable(foundBook);
    }
}
