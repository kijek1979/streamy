package com.sda.streams.optional;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        Library library = new Library();
        Optional<Book> b = library.findBook("krzyzacy");

        // opcja 1:
//        if(b.isPresent()){
//            Book book = b.get();
//            book.setTaken(true);
//        }
        // opcja 2:
//        Consumer<Book> consumer = new Consumer<Book>() {
//            @Override
//            public void accept(Book book) {
//                // wykonaj czynność
//                book.setTaken(true);
//            }
//        };
//
//        b.ifPresent(consumer);

        // opcja 3:
        b.ifPresent(book -> book.setTaken(true));
    }
}
