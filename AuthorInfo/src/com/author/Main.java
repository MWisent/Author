package com.author;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("J.K.", "Rowling", "jkrowling@example.com");
        Author author2 = new Author("Stephen", "King", "stephenking@example.com");
        Author author = new Author("Viktoryia", "Pelszyk", "viktoryia.pelszyk@gmail.com");

        Author[] authors = {author, author1, author2};

        Book book = new Book("Programowanie", authors, 23.99, 20);

        System.out.println(book.toString());
        System.out.println(book.getTotalPrice());
        System.out.println(book.isAvailable());


        System.out.println(author.getFirstName());
        System.out.println(author.getLastName());
        System.out.println(author.getEmail());



    }
}