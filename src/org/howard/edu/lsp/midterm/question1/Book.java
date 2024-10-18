package org.howard.edu.lsp.midterm.question1;

public class Book {
    private String title; // added list of needed attributes
    private String author;
    private String ISBN;
    private int yearPublished;

    // Constructor for Book

    //1.	Write the Book class with appropriate constructors, getters, and setters.  Be mindful of encapsulation in your declarations. (5 pts.)
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters

    //2.	Override the boolean equals(Object) method in the Book class so that two Book objects are considered equal if they have the same ISBN and author. (5 pts.)
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public int getYearPublished() { return yearPublished; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    // Override equals to compare books by ISBN and author

    //3.	Override the String toString() method in the Book class to return a meaningful string representation of a Book object (see sample output below)  (5 pts.)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return this.ISBN.equals(book.ISBN) && this.author.equals(book.author);
    }

    // Override toString to provide meaningful output
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}


